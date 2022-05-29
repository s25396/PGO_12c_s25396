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
            if(x instanceof Liquid)
            {
                x=catalyst;
                ingredients.add(x);
            }
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
        if(isCreated)
        {
            throw new RuntimeException("Eliksir has already been created");
        }
        else
        {
         for(Ingredient x:ingredients)
         {
             if(x instanceof Minerals){
                 power =  ((Minerals) x).getPower() + power;
                 return power;
             }
             else
             {
                 return power;
             }

         }
         power = power/catalyst.getReagent();
        }

        return power;
    }

    public void create(){
        isCreated=true;
    }
}
