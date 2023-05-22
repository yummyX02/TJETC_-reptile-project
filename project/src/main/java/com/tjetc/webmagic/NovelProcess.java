package com.tjetc.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;

public class NovelProcess implements PageProcessor {
    int i = 1;
    int l = 1;

    public static void main(String[] args) {
        Spider spider = Spider.create(new NovelProcess());
        spider.addPipeline(new NovelPipline());
//        spider.addUrl("https://www.qidian.com/rank/collect/");
        spider.addUrl("https://www.qidian.com/all/orderId2/");

        spider.run();
    }
    @Override
    public void process(Page page) {

//        执行部分
        Html html = page.getHtml();
        //获取页码
        String pageNum = html.css("#page-container > div > ul > li:nth-child(6) > a", "text").get();
        if(pageNum!=null){
            int pageNumInt=Integer.parseInt(pageNum);
            if(l==1){
                for(int i=2;i<=pageNumInt;i++){
                    String nextUrl="https://www.qidian.com/rank/collect/page"+i;
//                    System.out.println(nextUrl);
                    //将下一页链接添加到爬虫队列中
                    page.addTargetRequest(nextUrl);
                }
                l++;
            }
        }
        List<Selectable> nodes = html.css("#book-img-text > ul > li > div.book-mid-info > h2 > a").nodes();
        if (nodes.size() > 0){
            List<String> all_links = html.css("#book-img-text > ul > li > div.book-mid-info > h2 > a").links().all();
            page.addTargetRequests(all_links);
        }else{
            parsObj(page);
        }
    }

    public void parsObj(Page page){
//        进入详情页
        Html html = page.getHtml();
        //System.out.println(html);
        String all_bookName = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > h1 > em", "text").get();
        String star=html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p:nth-child(4) > em:nth-child(4)","text").get();
        String all_writerName = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > h1 > span:nth-child(2) > a", "text").get();
        String all_class = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p.tag > a:nth-child(4)", "text").get();
        String all_status = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p.tag > span:nth-child(1)", "text").get();
        String all_info = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p.intro", "text").get();
        String all_num = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p:nth-child(4) > em:nth-child(1)", "text").get();
        String all_thumbUp = html.css("body > div.wrap > div.book-detail-wrap.center990 > div.book-information.cf > div.book-info > p:nth-child(4) > em:nth-child(7)", "text").get();
        String all_updateInfo = html.css(" body > div.wrap > div.book-detail-wrap.center990 > div.book-content-wrap.cf > div.left-wrap.fl > div > div.book-intro-state > div.book-state > ul > li.update > div > p.cf.charpter-container.charpter-latest > a", "text").get();
//        System.out.println(i+all_bookName+all_writerName+all_class+all_info+all_status+all_num+all_star+all_thumbUp);
        NovelInfo novelInfo = new NovelInfo();
        novelInfo.setId(i++);

        novelInfo.setBookName(all_bookName);
        novelInfo.setWriterName(all_writerName);
        novelInfo.setType(all_class);
        novelInfo.setStatus(all_status);
        novelInfo.setStar(star);
        novelInfo.setInfo(all_info);
        novelInfo.setFontNum(all_num);
        novelInfo.setThumbUp(all_thumbUp);
        novelInfo.setUpdateInfo(all_updateInfo);
        page.putField("novelInfo",novelInfo);

    }
    private Site site = Site.me()
            .setCharset("utf8")
            .setTimeOut(10 * 1000)
            .setRetrySleepTime(3 * 1000)
            .setSleepTime(3)
            .setRetrySleepTime(3);
    @Override
    public Site getSite() {
        return site;
    }
}
