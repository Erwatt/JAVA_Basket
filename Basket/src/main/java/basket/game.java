
package basket;
import java.util.Scanner;

/**
 *
 * @author erwan & adrien
 */

/*declaration des fonctions*/
public class Game {
    private Stadium stadium;
    private Team team_name;
    
    public void new_score(Player player, Integer points, Team team){
        player.f5_player_points(player, points, team);
    }
    
    /*lance franc*/
    public void free_throw(Player player, Integer Nbr_lancer, Team team){
        for (Integer i = 0; i < Nbr_lancer; i++){
            System.out.println("Lancer marqué ? 1/0"); /*interroge l utilisateur*/
            Scanner input = new Scanner(System.in);
            Integer scored = input.nextInt();
            if (scored == 1){
                new_score(player, 1, team);
            }
        }
    }
    
    
}
