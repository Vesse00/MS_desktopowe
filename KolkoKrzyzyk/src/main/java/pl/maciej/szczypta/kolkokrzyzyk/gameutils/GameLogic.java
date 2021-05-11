/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.maciej.szczypta.kolkokrzyzyk.gameutils;

import pl.maciej.szczypta.kolkokrzyzyk.Player;

/**
 *
 * @author gromm
 */
public class GameLogic {
    private boolean player = false;
    private Player p1, p2;
    //true - circle     
    private int [][]board = new int[3][3];
    
    /**
     * 
     * @param x
     * @param y
     * @param sign 1 - circle  2 - cross 0 - starting value
     * @return win or not  |  true means win
     */
    public boolean addPlayerMoveBoard(int x, int y, int sign){
        
        board[x][y] = sign;
        
        return isWinner();
    } 
    
    private boolean isWinner(){
        boolean winner = false;
        
        //sprawdzamy czyw wierszach sa jednakoweznaki
        //board[0][0] == board[1][0] == board[2][0]
        for(int i=0;i<3;i++){
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] >0){
                winner = true;
                break;
            }
        }
        
        //sprawdzenie kolum
        for(int i=0;i<3;i++){
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] >0){
                winner = true;
                break;
            }
        }
        
        
        //sprawdzenie na skos
        
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] >0){
            winner = true;
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] >0){
            winner = true;
        }
        
        return winner;
    }
    
    @Override
    public String toString(){
        return "|"+board[0][2]+"|"+board[1][2]+"|"+board[2][2]+"\n"+
                "|"+board[0][1]+"|"+board[1][1]+"|"+board[2][1]+"\n"+
                "|"+board[0][0]+"|"+board[1][0]+"|"+board[2][0]+"\n";
    }
}
