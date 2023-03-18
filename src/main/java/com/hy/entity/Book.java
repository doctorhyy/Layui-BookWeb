package com.hy.entity;

public class Book {
    String bookId;
    String title;
    String author;
    String infor;
    String genre;
    String childGenre;
    String finalState;
    String newChapter;
    String bookImg;
    String bookSrc;
    String numOfRead;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getChildGenre() {
        return childGenre;
    }

    public void setChildGenre(String childGenre) {
        this.childGenre = childGenre;
    }

    public String getFinalState() {
        return finalState;
    }

    public void setFinalState(String finalState) {
        this.finalState = finalState;
    }

    public String getNewChapter() {
        return newChapter;
    }

    public void setNewChapter(String newChapter) {
        this.newChapter = newChapter;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookSrc() {
        return bookSrc;
    }

    public void setBookSrc(String bookSrc) {
        this.bookSrc = bookSrc;
    }

    public String getNumOfRead() {
        return numOfRead;
    }

    public void setNumOfRead(String numOfRead) {
        this.numOfRead = numOfRead;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", infor='" + infor + '\'' +
                ", genre='" + genre + '\'' +
                ", childGenre='" + childGenre + '\'' +
                ", finalState='" + finalState + '\'' +
                ", newChapter='" + newChapter + '\'' +
                ", bookImg='" + bookImg + '\'' +
                ", bookSrc='" + bookSrc + '\'' +
                ", numOfRead='" + numOfRead + '\'' +
                '}';
    }
}
