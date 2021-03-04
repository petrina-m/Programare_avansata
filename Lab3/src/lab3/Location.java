/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author 40757
 */
import java.util.Map;
import java.util.HashMap;
import static java.util.Objects.isNull;

public abstract class Location implements Comparable<Location> {

    private String name; //numele locatiei
    private Map<Location, Integer> cost = new HashMap<>();

    //constructor
    public Location(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getCost(Location node) {
        //returnez costul
        return cost.get(node);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    @Override
    public int compareTo(Location other) {
        if(isNull(other.name)) //dacanumele este null
        {
            System.out.println("There is no name");
        }
        else
        {
            return this.name.compareTo(other.name); 
        }
        return 0;
       
    }

}
