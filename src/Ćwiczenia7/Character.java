package Ćwiczenia7;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private Location location;
    private int Health = 100;
    private static ArrayList<Character> characters = new ArrayList<>();

    public Character(String name, Location location) {
        setName(name);
        setLocation(location);
        characters.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Name cannot be empty!");
        }
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if(location == null)
        {
            throw new RuntimeException("Location cannot be empty!");
        }
        this.location = location;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public static ArrayList<Character> getCharacters() {
        return characters;
    }

    public static void doSth(String action, Character character, Character character2, Character character3 ){
        System.out.println("I am "+character.getName()+", I am "+action);
        System.out.println("I am "+character2.getName()+", I am "+action);
        System.out.println("I am "+character3.getName()+", I am "+action);
        }

    public void moveTo(Location newLoc) throws StoryViolationException {
        if(newLoc == null)
        {
            throw new RuntimeException("You have to type location!");
        }
        if(this instanceof Voldemort && newLoc == Location.Hogwarts){
            throw new StoryViolationException("He cannot go there");
        }
        else{
            this.setLocation(newLoc);
        }

    }

    public void moveTo(Orphanage orphanage){
        if(orphanage.getLocation() == this.location)
        {
            throw new RuntimeException("This character is already in here!");
        }
        else{
            this.setLocation(orphanage.getLocation());
        }


    }

    public static void status(){
        for(Character character : characters) {
            System.out.println(character.getName()+": "+character.getHealth());
        }

    }

    public void doSth(String action){
            System.out.println("I am "+this.getName()+", I am "+action);

        }

    public void say(String text, Character receiver){
        System.out.println(this.getName()+" to "+receiver.getName());
        System.out.println("    "+text);
    }

    public static void moveAllTo(Location newLoc, Character movingCharacter, Character movingCharacter2){
      movingCharacter.setLocation(newLoc);
      movingCharacter2.setLocation(newLoc);
    }

    public void introduce(){
        System.out.println("Hello, I am "+this.getName());
    }

}
