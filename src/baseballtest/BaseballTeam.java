/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author Zanea7326
 */

public class BaseballTeam extends Sports{
    public BaseballTeam(){
        super("Baseball",9);
    }
    private int wins, losses, ties, totalPoints;
    
    public void updateWins(int x){
        wins=x;
        
        Stats.overallPoints();
    }
    public void updateLosses(int x){
        losses=x;
    }
    public void updateTies(int x){
        ties=x;
        
        Stats.overallPoints();
    }
}
