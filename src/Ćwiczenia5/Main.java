package Ćwiczenia5;

public class Main {
    public static void main(String[] args) {
        Liquid woda= new Water("Cisowianka",2,34,false);
        Minerals zloto=new Ore("zloto",10,20,true);
        Plants roza=new Flower("roza",20,10);
        Liquid wodka= new Alcohol("wodka",20,40,50);
        Plants korzen = new Root("korzen",40,20);
        Eliksir jaskolka= new Eliksir("Jaskolka");
        jaskolka.addIngredient(roza);
        jaskolka.addIngredient(zloto);
        jaskolka.addIngredient(korzen);
        jaskolka.removeIngredient(korzen);
        jaskolka.addIngredient(wodka);
        System.out.println(woda.getReagent());
        System.out.println(wodka.getReagent());

    }
}
