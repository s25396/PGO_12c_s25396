package Ćwiczenia2;

public class Adress {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Adress(String country,String city, String street, int house, int flat){
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse(house);
        setFlat(flat);

    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country==null || country.isEmpty())
        {
            throw new RuntimeException("Country has to be given");
        }
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city==null || city.isEmpty())
        {
            throw new RuntimeException("City has to be given");
        }
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street==null || street.isEmpty())
        {
            throw new RuntimeException("Street has to be given");
        }
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        if(house==0)
        {
            throw new RuntimeException("Number of House has to be given");
        }
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {

        if(flat==0)
        {
            throw new RuntimeException("Flat's number has to be given");
        }
        this.flat = flat;
    }
}
