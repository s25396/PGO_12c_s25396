package Ćwiczenia5;

class Minerals extends Ingredient {
    protected int power;


    public Minerals(String name, int baseReagent, int power){
        super(name, baseReagent);
        setPower(power);

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power<=0)
        {
            throw new RuntimeException("Power cannot be 0 or negative");
        }
        this.power = power;
    }

    @Override
    public int getReagent() {
        
        return super.getReagent()+power;
    }
}
