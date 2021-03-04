/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.time.LocalTime;

/**
 *
 * @author 40757
 */
public class Museum extends Location implements Visitable, Payable {

    private String name;
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Museum(String name) {
        super(name);
    }

    /**
     *
     * @return
     */
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }
    
    public void setTicketPrice(double ticketPrice){
        this.ticketPrice=ticketPrice;
    }

}
