/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra;

import java.util.Scanner;

/**
 *
 * @author karola
 */
public class PlayerHuman extends Player {
    private Scanner scanner = new Scanner(System.in);

    private String name = "nieznane";

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if(name.length()<2 || name.indexOf(" ") != -1)
            throw new IllegalArgumentException();
        this.name=name;  
    }
    
    public int guess(){
        System.out.print("Podaj liczbę: ");
        return scanner.nextInt();
    }
    }    


