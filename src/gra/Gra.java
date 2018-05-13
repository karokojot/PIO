/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra;

import java.util.Random;


/**
 *
 * @author karola
 */
public class Gra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rzuć kośćmi: ");
        Player player = new Player();
        Random r = new Random();
        
        boolean match = false;
        while (!match){
            int number = r.nextInt(6)+1;
            int guess = player.guess();
            
            System.out.println("wyrzucona liczba: " + number + " zgadł: " + guess);
            
            if (number == guess)
                match = true;
        }
        // TODO code application logic here
    }
    
}
