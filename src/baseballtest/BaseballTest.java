/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;
import java.util.Scanner;
/**
 *
 * @author Zanea7326
 */
public class BaseballTest {
    public static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter=0;
        String input="e";
        int inputInt;
        
        BaseballTeam BaseballTeam = new BaseballTeam();
        
        while(!input.equalsIgnoreCase("q")){
            System.out.println("Please input whether the games was a win,loss,or tie\n(Enter q to quit)");
            
            input=sc.next();
            
            if(input.equalsIgnoreCase("w")){
                System.out.println("Please input the number of wins");
                inputInt=sc.nextInt();
                BaseballTeam.updateWins(inputInt);
                
            }else if(input.equalsIgnoreCase("l")){
                System.out.println("Please input the number of losses");
                inputInt=sc.nextInt();
                BaseballTeam.updateLosses(inputInt);
                
            }else if(input.equalsIgnoreCase("t")){
                System.out.println("Please input the number of ties");
                inputInt=sc.nextInt();
                BaseballTeam.updateTies(inputInt);
                
            }
        }
    }
    
}
