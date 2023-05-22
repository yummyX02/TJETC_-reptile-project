package com.tjetc.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

public class QidianProcess implements PageProcessor {
    public static void main(String[] args) {
        Spider spider = Spider.create(new QidianProcess());
        spider.addUrl("https://www.qidian.com/rank/");
        spider.run();
    }

    @Override
    public void process(Page page) {
        Html html = page.getHtml();
//        html.css()
//        System.out.println(html);
        List<String> all = html.css("body > div.wrap > div.rank-box.box-center.cf > div.main-content-wrap.fl > div.rank-body > div > div:nth-child(1) > div > ul > li").all();
        System.out.println(all);
    }
    Site site = Site.me()
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
