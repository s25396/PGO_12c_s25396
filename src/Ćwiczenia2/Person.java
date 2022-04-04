package Ćwiczenia2;
import Ćwiczenia2.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress adress;
    private Book book;


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

    public void PublishBook(){
        Scanner in= new Scanner(System.in);
        System.out.println("Set name of your book");
        String name=in.next();
        System.out.println("Choose genre of your book: ");
        for(Genre g: Genre.values())
        {
            System.out.println("-" + g);
        }
        String genretype = in.next();
        System.out.println("Choose language of your book: ");
        for(Lang l: Lang.values())
        {
            System.out.println("-"+l);
        }
        String lang = in.next();
        this.book= new Book(name,Genre.valueOf(genretype),Lang.valueOf(lang),LocalDate.now(),this);
        System.out.println("Your published book:");
        System.out.println("Author: "+book.getAuthor().getName()+" "+book.getAuthor().getSurname());
        System.out.println("Name: "+book.getName());
        System.out.println("Genre: "+book.getGenre());
        System.out.println("Language: "+book.getLang());
        System.out.println("Published date: "+book.getPublishDate());
    }

}
