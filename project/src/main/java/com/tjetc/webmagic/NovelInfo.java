package com.tjetc.webmagic;

public class NovelInfo {
    private int id;
    private String bookName;
    private String writerName;
    private String type;
    private String star;
    private String info;
    private String status;
    private String fontNum;

    private String updateInfo;
    public String getFontNum() {
        return fontNum;
    }

    public void setFontNum(String fontNum) {
        this.fontNum = fontNum;
    }

    private String thumbUp;

    public NovelInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(String thumbUp) {
        this.thumbUp = thumbUp;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public NovelInfo(int id, String bookName, String writerName, String type, String star, String info, String status, String thumbUp, String updateInfo) {
        this.id = id;
        this.bookName = bookName;
        this.writerName = writerName;
        this.type = type;
        this.star = star;
        this.info = info;
        this.status = status;
        this.thumbUp = thumbUp;
        this.updateInfo = updateInfo;
    }
}
