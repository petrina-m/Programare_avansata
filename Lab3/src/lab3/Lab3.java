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
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Museum v2 = new Museum("Alecsandri");
        v2.setOpeningTime(LocalTime.of(9, 30)); //9:30
        v2.setClosingTime(LocalTime.parse("17:00"));
        v2.setTicketPrice(20);
        
        Museum v3 = new Museum("Cuza");
        v3.setOpeningTime(LocalTime.of(9, 30)); //9:30
        v3.setClosingTime(LocalTime.parse("17:00"));
        v3.setTicketPrice(27);
        
        Church v4 = new Church("Biserica Neagra");
        v4.setOpeningTime(LocalTime.of(7, 0));
        v4.setClosingTime(LocalTime.MIDNIGHT);
        
        Church v5 = new Church("Biserica Alba");
        v5.setOpeningTime(LocalTime.of(7, 0));
        v5.setClosingTime(LocalTime.MIDNIGHT);
        
        
        Hotel v1 = new Hotel("Unirea");
        v1.setRank(1);
        
        Restaurant v6= new Restaurant("Fika");
        v6.setRank(2);
        v6.setOpeningTime(LocalTime.of(10, 30)); //9:30
        v6.setClosingTime(LocalTime.of(10, 30));

                
      
    }

}
