package Ćwiczenia5;

class Crystal extends Minerals {

    private int magicPower;

public Crystal(String name,int baseReagent, int power, int magicPower){
    super(name,baseReagent,power);
    setMagicPower(magicPower);

}

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
    if(magicPower<=0)
    {
     throw new RuntimeException("Magicpower cannot be lower or equal to zero");
    }

        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {

    return super.getReagent()+magicPower;
}
}