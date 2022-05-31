package Ćwiczenia5;

class Ore extends Minerals{
    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic){
        super(name, baseReagent, power);
        setMetallic(metallic);

    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    @Override
    public int getReagent() {
        if(metallic)
        {
            return super.getReagent();
        }
        else
        {
            return super.getReagent()/2;
        }
    }
}
