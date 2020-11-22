/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;
import java.util.Scanner;

/**
 *
 * @author erwan & adrien
 */
public class Game {
    private Stadium stadium;
    private Team team_name;
    
    public void new_score(Player player, Integer points){
        player.f5_player_points(player, points);
    }
    
    public void free_throw(Player player, Integer Nbr_lancer){
        for (Integer i = 0; i < Nbr_lancer; i++){
            System.out.println("Lancer marqué ?");
            Scanner input = new Scanner(System.in);
            String scored = input.nextLine();
            if (scored == "yes"){
                new_score(player, 1);
            }
        }
    }
    
    
}
