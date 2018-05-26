/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra;

/**
 *
 * @author karola
 */
public class PlayerDumb extends Player{

    /**
     *
     * @return
     */
    @Override
    public int guess() {
        return 6;
    }
    public void setName(String name){
        System.out.println("Nie możesz zmienić nazwy");
    }
    
    public String getName(){
        return "...";
    }

    
}
