package Ćwiczenia2;
import Ćwiczenia2.*;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;


    public Person(String name, String surname, LocalDate dateOfBirth) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }

    public void Publishbook() {
        Book i= new Book();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
