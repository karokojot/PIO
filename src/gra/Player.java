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
public class Player {
    private Random r = new Random();
    public int guess(){
        int guess = r.nextInt(6)+1;
        return guess;
    }
}
