package Ćwiczenia5;

public abstract class Ingredient{
    protected String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent)
    {
        setName(name);
        setBaseReagent(baseReagent);
    }
    public void setBaseReagent(int baseReagent) {
        if(baseReagent <= 0)
        {
            throw new RuntimeException("baseReagent cannot be null and negative");
        }

        this.baseReagent = baseReagent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Name cannot be null");
        }
        this.name = name;
    }

    public int getReagent() {
        return baseReagent;
    }
}


