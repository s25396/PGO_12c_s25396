package Ćwiczenia2;
import Ćwiczenia2.*;

import javax.management.ObjectInstance;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress adress;
    private Book book;
    private Lang lang;
    private Genre genre;
    private LocalDate publishDate;


    public Person(String name, String surname, LocalDate dateOfBirth, Adress adress) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        this.adress = adress;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty())
        {
            throw new RuntimeException("Everyone has a name");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname==null || surname.isEmpty())
        {
            throw new RuntimeException("Everyone has a Surname");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth==null)
        {
            throw new RuntimeException("Everyone has date of birth");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Period getAge()
    {
        return Period.between(dateOfBirth,LocalDate.now());
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        if(adress==null)
        {
            throw new RuntimeException("The person must have adress");
        }
        this.adress = adress;
    }

    public Book getbook() {
        return book;
    }

    public void setbook(Book book) {
        this.book = book;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public Lang getLang() {
        return lang;
    }

    public Genre getGenre() {
        return genre;
    }

    public void PublishBook(){

    }
}
