package Ćwiczenia7;

import java.util.ArrayList;


public class Orphanage {
    private String name;
    private Location location;
    private static ArrayList<Child> orphans = new ArrayList<>();

    public Orphanage(String name, Location location) {
        setName(name);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Orphanage should have a name!");
        }
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if(location==null)
        {
            throw new RuntimeException("Orphanage should have a name!");
        }
        this.location = location;
    }

    public static ArrayList<Child> getOrphans() {
        return orphans;
    }

    public void addChild (Child orphan) {
        orphans.add(orphan);
        orphan.setLocation(this.getLocation());
    }
}
