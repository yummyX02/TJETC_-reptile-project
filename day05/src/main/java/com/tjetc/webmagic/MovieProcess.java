package com.tjetc.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

import javax.swing.text.html.HTML;
import java.util.List;

public class MovieProcess implements PageProcessor {
    public static void main(String[] args) {
        Spider spider = Spider.create(new MovieProcess());
        spider.addPipeline(new MoviePiprline());
//        爬取的根路径
//        spider.addUrl("https://movie.douban.com/chart");
//        spider.addUrl("https://www.qidian.com/rank/collect/");
        spider.addUrl("https://www.maoyan.com/board/4?timeStamp=1682234372172&channelId=40011&index=2&signKey=abc5b663ff540c9f7795d8f31d1ff2ab&sVersion=1&webdriver=false");
        spider.run();
    }

    @Override
    public void process(Page page) {
        Html html = page.getHtml();
        System.out.println(html);
//        String s = html.css("#book-img-text > ul > li:nth-child(1) > div.book-mid-info > h2 > a", "text").get();
//        System.out.println(s);
//        List<Selectable> nodes = html.css("#content .indent .pl2").nodes();
////        如果node的长度大于0，说明当前页面仍在列表界面
//        if (nodes.size() > 0){
////            找到a链接
//            List<String> all = html.css("#content .indent ,pl2").links().all();
////            将所有的链接都添加到待爬取队列中
//            page.addTargetRequests(all);
//        }
////        否则就是进入了详情页，当前的CSS选择器已经改变了，自然是获取不到数据
//        else {
////            分析想要保存的数据
//            parsObj(page);
//
//        }
//        List<Selectable> nodes = html.css("#content .indent .pl2").nodes();
        //        获取这个结点下的所有结点
//        for (Selectable node : nodes) {
////            System.out.println(node);
////            > 表示子代元素
//            String text = node.css(".pl2 > a span", "text").get();
//            System.out.println(text);
//        }


//        get是找到标签中的第一个
//        all是找到所有匹配的内容
//        List text = html.css("#content .pl2 > a span","text").all();
//        html.xpath();

//        System.out.println(text);
//        List<String> all = html.css("#content .indent").links().all();
//        String links = html.css("#content .indent").links().get();
//        System.out.println(links);
//        放到待爬取的队列中
//        page.addTargetRequest(links);
//        System.out.println(page.getHtml());


    }

    private void parsObj(Page page) {
//        执行真正存储数据库的位置
        Html html = page.getHtml();
        String name = html.css("#content > h1 > span:nth-child(1)", "text").get();
        MovieInfo movieInfo = new MovieInfo();
        movieInfo.setName(name);
//        将数据方法pipline处理，是一个map集合 将数据放进ResultItems
        page.putField("movieinfo",movieInfo);

    }

    private Site site = Site.me()
            //设置编码
            .setCharset("utf8")
            //等待多久去爬取，参数为毫秒值
            .setTimeOut(10 * 1000)
            //重试事件
            .setRetrySleepTime(3 * 1000)
            //等待次数
            .setSleepTime(3)
            //重试次数
            .setRetrySleepTime(3);
    @Override

    public Site getSite() {
//        return PageProcessor.super.getSite();
    return site;
    }
}
