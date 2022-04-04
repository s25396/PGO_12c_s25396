package Ćwiczenia2;
import Ćwiczenia2.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;



public class Book {
    private final long ID= hashCode();
    private String name;
    private Genre genre;
    private Lang lang;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvailable=true;
    private Person author;
    private static Map<Book,Person>personwithloan = new HashMap<>();
    private static Set<Book> books= new HashSet<>();



    public Book(String name, Genre genre, Lang lang, LocalDate publishDate) {
        setName(name);
        setGenre(genre);
        setLang(lang);
        setPublishDate(publishDate);
        books.add(this);
    }

    public long getID() {
        return ID;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
        {
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if(genre==null)
        {
            throw new RuntimeException("book's genre must not be empty");
        }
        this.genre = genre;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        if(lang==null)
        {
            throw new RuntimeException("Language of the book must be given");
        }
        this.lang = lang;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        if(publishDate==null)
        {
            throw new RuntimeException("Book must have publish date");
        }
        this.publishDate = publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Period getAge() {
        return Period.between(publishDate,LocalDate.now());
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public static Set<Book> getbooks() {
        return Collections.unmodifiableSet(books);
    }

    public void BorrowBook(Person x){

        if (!isAvailable)
        {
            throw new RuntimeException("This book is already borrowed");
        }
        else
        {
            if (personwithloan.containsValue(x))
            {
                throw new RuntimeException("You can only borrow one book");
            }
            else
            {
                borrowCount++;
                isAvailable = false;
                personwithloan.put(this,x);
                System.out.println(getName() + " has just been borrowed by " + x.getName());
            }

        }

    }

    public void PlaceBack(){
        isAvailable=true;
        personwithloan.remove(this);
        System.out.println(this.getName()+" has been successfully placed back and now is available");
    }}
