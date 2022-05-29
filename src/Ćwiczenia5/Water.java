package Ćwiczenia5;


class Water extends Liquid {
    private boolean distilled;

    public Water(String name, int baseReagent,int dissolubility, boolean distilled){
        super(name,baseReagent,dissolubility);
        setDistilled(distilled);
    }

    public boolean isDistilled() {
        return distilled;
    }

    public void setDistilled(boolean distilled) {
        this.distilled = distilled;
    }

    @Override
    public int getReagent() {
        if (distilled)
        {
            return super.getReagent();
        }
        else {
            return super.getReagent()/2;
        }
    }
}
