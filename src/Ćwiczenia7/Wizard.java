package Ćwiczenia7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;

public class Wizard extends Character{
    private static ArrayList<Character> targets = new ArrayList<>();

    public Wizard(String name, Location location) {
        super(name, location);
    }

    public void target(Character whoWillBeAttacked){
        targets.add(whoWillBeAttacked);

    }

    public void castSpell(Spell spell) {
            if (spell == Spell.AvadaKedavra)
            {
                for (Character whoDie : targets) {
                        if (whoDie.getName().equals("Harry")) {
                            System.out.println(whoDie.getName() + " goes LOL...");
                            this.setHealth(0);
                        }
                        else if(this instanceof Voldemort) {
                            whoDie.setHealth(0);
                            System.out.println(whoDie.getName() + " died.");
                        }

                    }

                if (this instanceof Voldemort)
                {
                    System.out.println(this.getName() + " died.");
                }
                targets = null;
            }
        }
    }