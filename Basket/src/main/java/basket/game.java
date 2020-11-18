/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;

/**
 *
 * @author erwan & adrien
 */
public class game {
    private stadium stadium;
    private team team_name;
    
    public void new_score(player player, Integer point){
        Integer player_points = player.points();
        player_points += point;
        player.f5_player_points(player, player_points);
    }
        
    
}
