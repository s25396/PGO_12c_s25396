package Ćwiczenia5;

import java.util.ArrayList;

public class Eliksir {

    private String name;
    private boolean isCreated = false;
    private int power;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst;


    public Eliksir(String name) {
        setName(name);
    }

    public boolean isCreated() {
        return isCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
    }

    public void addIngredient(Ingredient x){
        if(isCreated)
        {
            throw new RuntimeException("Eliksir has already been created");

        }
        else
        {
            ingredients.add(x);
        }

    }

    public void removeIngredient(Ingredient x){
        if(isCreated)
        {
            throw new RuntimeException("Eliksir has already been created");
        }
        else
        {
            ingredients.remove(x);
        }
    }

    public int getPower() {
        if(!isCreated)
        {
            throw new RuntimeException("There is no Eliksir created");
        }
        else {
            return power;
        }
    }

    public Liquid getCatalyst() {
        if(catalyst==null)
        {
            System.out.println("You haven't add any catalyst yet.");
        }
        return catalyst;
    }

    public void addCatalyst(Liquid catalyst) {
        if(isCreated)
        {
            throw new RuntimeException("Eliksir has been already made");
        }
        this.catalyst = catalyst;
    }

    public void create(){
        if(ingredients.isEmpty())
        {
            throw new RuntimeException("There is no ingredient!");
        }
        else
        {
            if(catalyst==null)
            {
            throw new RuntimeException("You have to add Catalyst to make the Eliksir!");
            }
            else
            {
                isCreated = true;
                for (Ingredient x : ingredients) {
                    power +=x.getReagent();
                }
                power = power / catalyst.getReagent();
            }
        }}
}
