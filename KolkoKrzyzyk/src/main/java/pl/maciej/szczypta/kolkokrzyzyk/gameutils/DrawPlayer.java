/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.maciej.szczypta.kolkokrzyzyk.gameutils;

import java.util.Random;

/**
 *
 * @author gromm
 */
public class DrawPlayer {
    /**
     *  Draw players to start
     * @return true means Player 1 starts
     */
    public static boolean randomPlayer(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
    
    /**
     * Draw cross or circle
     * @return true means circle
     */
    public static boolean randomSign(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
}
