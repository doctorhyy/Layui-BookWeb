package com.hy.entity;


import java.sql.Date;

public class Collect {
    private String userId;
    private String bookId;
    private String title;
    private String userName;
    private Date date;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "userId='" + userId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                '}';
    }
}
