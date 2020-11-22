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
public class Fault {
    
    
    
    
    public void new_fault(Team team, Player p, Boolean lancer, Integer Nbr_lancer, Player shooter){
        Integer team_fault = team.fault();
        team_fault += 1;
        team.f5_team_fault(team, team_fault);
        Integer player_fault = p.fault();
        player_fault += 1;
        p.f5_player_fault(p, player_fault);
        if (player_fault > 4){
            new Referee().player_out(p);
        }
        if (team_fault >= 5){
            new Game().free_throw(shooter, 2);
        }
        else if(lancer == true){
            new Game().free_throw(shooter, Nbr_lancer);
        }
        
    }
}
