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
public class PlayerComp extends Player{
    
    private Random dice = new Random();
   
    public int guess() {
        return dice.nextInt(6) + 1;
    }
    
    public void setName(String name){
        System.out.println("To jest komputer - nie możesz zmienić nazwy");
    }
    
    public String getName(){
        return "Gracz komputerowy";
    }

    
}
