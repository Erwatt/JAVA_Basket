
package basket;

/**
 *
 * @author erwan & adrien
 */

/*declaration des fonctions*/
public class Fault {
    
    
    
    /*gere les fautes et les attributions au joueur et equipe*/
    public void new_fault(Team team, Player p, Boolean lancer, Integer Nbr_lancer, Player shooter, Team shooter_team){
        Integer team_fault = team.fault();
        team_fault += 1;
        team.f5_team_fault(team, team_fault);
        Integer player_fault = p.fault();
        player_fault += 1;
        p.f5_player_fault(p, player_fault);
        if (player_fault > 4){
            new Referee().player_out(p);/*exlusion d un joueur*/
        }
        if (team_fault >= 5){
            new Game().free_throw(shooter, 2, shooter_team);
        }
        else if(lancer == true){
            new Game().free_throw(shooter, Nbr_lancer, shooter_team);
        }
        
    }
}
