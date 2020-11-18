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
public class fault {
    private team team;
    private player player;
    private Boolean lancer;
    private Integer Nbr_lancer;
    
    
    
    public static void new_fault(team team, player player, Boolean lancer, Integer Nbr_lancer, player shooter){
        Integer team_fault = team.fault();
        team_fault += 1;
        team.f5_team_fault(team, team_fault);
        Integer player_fault = player.fault();
        player_fault += 1;
        player.f5_player_fault(player, player_fault);
        if (player_fault > 4){
            referee.player_out(player);
        }
        if (team_fault >= 5){
            game.free_throw(shooter, 2);
        }
        else if(lancer == true){
            game.free_throw(shooter, Nbr_lancer);
        }
        
    }
}
