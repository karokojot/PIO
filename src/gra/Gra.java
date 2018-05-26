/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author karola
 */
public class Gra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dice = new Random();
        Scanner sc = new Scanner(System.in);
        

        Player player = new PlayerHuman();
        
        while(true){
            System.out.print("Wprowadź imię gracza: ");
            String name = sc.nextLine();
            try{
                player.setName(name);
            }
            catch(IllegalArgumentException e){
                System.out.println("Nazwa ma zawierac co najmniej 2 litery i byc bez spacji. ");
                continue;
            }
            break;
        }
        
        int number, guess = 1;
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);
            
            guess = player.guess();
                    
            System.out.println("Gracz: " + player.getName() + " zgadł liczbę: " + guess);
            
            if (number != guess) {
                System.out.println("ŹLE!");
            } else {
                System.out.println("DOBRZE!");
            }
            
        } while (number != guess);

        // TODO code application logic here
    }
    
}
