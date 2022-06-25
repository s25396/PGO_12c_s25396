package Ćwiczenia7;

import java.util.ArrayList;

public class Voldemort extends Wizard{
    private static ArrayList<String> horcruxes = new ArrayList<>();

    public Voldemort(Riddle tom){
        super("Lord Voldemort",tom.getLocation());
        Character.getCharacters().remove(tom);
    }

    public void createHorcruxes(int numberOfHorcruxes){
        for(int i=1;i<=numberOfHorcruxes;i++){
            horcruxes.add("    horcrux");
        }
    }

    public void printHorcruxes(){
        System.out.println("Created horcruxes: ");
        int i = 1;
        for(String horcrux: horcruxes){
            System.out.println(horcrux+" "+i);
            i++;
        }

    }
}
