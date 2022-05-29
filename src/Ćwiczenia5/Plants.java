package Ćwiczenia5;

class Plants extends Ingredient{
    protected int toxity;

    public Plants(String name, int baseReagent, int toxity ){
        super(name, baseReagent);
        setToxity(toxity);
    }

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        if(toxity<0)
        {
            throw new RuntimeException("Toxity cannot be negative");
        }
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return super.getReagent()*toxity;
    }
}
