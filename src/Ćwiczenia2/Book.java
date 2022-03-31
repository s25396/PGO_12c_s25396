package Ćwiczenia2;
import Ćwiczenia2.*;
import java.time.LocalDate;

public class Book {
    private long ID;
    private String name;
    private Genre genre;
    private Lang lang;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvailable;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getBorrowCount() {
        return BorrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        BorrowCount = borrowCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
