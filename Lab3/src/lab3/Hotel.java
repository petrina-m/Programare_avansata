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
public class Hotel extends Location implements  Classifiable{
    private String name;
    private int rank;

    public Hotel(String name) {
        super(name);
    }
    
    @Override
    public int getRank() {
        return rank;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    
}
