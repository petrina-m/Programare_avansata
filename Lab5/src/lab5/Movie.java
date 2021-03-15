/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 40757
 */
public class Movie extends Item implements Payable, hasRank{
    private int ticketPrice;
   // private String name;
    private int rank;

    public Movie(int ticketPrice, int rank, String name) {
        super(name);
        this.ticketPrice = ticketPrice;
        this.rank = rank;
    }

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }


    public void setTicketPrice(int ticketPrice) {
        if (ticketPrice < 0) {
            throw new IllegalArgumentException(
                    "Ticket's price should be a positive number: " + rank);
        }
        this.ticketPrice = ticketPrice;
    }

   
    public void setRank(int rank) {
        if (rank < 0) {
            throw new IllegalArgumentException(
                    "Rank should be a positive number: " + rank);
        }
        this.rank = rank;
    }
    

    @Override
    public int getRank() {
       return rank;
    }
    
}
