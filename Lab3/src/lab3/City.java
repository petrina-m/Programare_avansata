/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 40757
 */


public class City {

    private List<Location> nodes = new ArrayList<>();
    public City() {}

    public void addLocation(Location node) {
        nodes.add(node);
    }
    public int getLocation(Location node)
    {
        //returneaza indicele
        return nodes.indexOf(node);
    }

}
