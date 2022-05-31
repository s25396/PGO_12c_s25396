package Ćwiczenia5;

class Liquid extends Ingredient{
    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility){
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if(dissolubility<0 || dissolubility>100)
        {
            throw new RuntimeException("Dissolubility should be in range (0-100)");
        }
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {

        return dissolubility;
    }
}
