package com.obss.model;

public class BookInfo {


    private int bookID;
    private String title;
    private String publishDate;
    private String updateDate;
    private String insertDate;
    private String insertedBy;



    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }
}
