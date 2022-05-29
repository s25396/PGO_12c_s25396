package Ćwiczenia5;

class Root extends Plants {

    public Root(String name, int baseReagent, int toxity){
        super(name, baseReagent, toxity);
    }

    @Override
    public int getReagent() {

        return super.getReagent()/2;
    }
}
