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

/*declaration des fonctions*/
public class Referee {
    private Game game;
    
    
    /*fonction pour annoncer que l arbitre parle*/
    public void arbitreDit(){
        System.out.print("L'arbitre dit au micro: ");
    }
   
    /*faute du joueur*/
    public void faute(Team team, Player player, Player shooter, Team shooter_team) {
        arbitreDit();
        System.out.println("Faute");
        if (team.fault()>5) {
            System.out.println("2 lancers");
            new Fault().new_fault(team, player, true, 2, shooter, shooter_team);
        }
        else{
            new Fault().new_fault(team, player, true, 0, shooter, shooter_team);
        }
    }
    
    /*faute sur tir*/
    public void faute_sur_tir(Team team, Player player, Boolean panier_marqué, Player shooter, Team shooter_team) {
        arbitreDit();
        System.out.println("Faute");
        if (panier_marqué == true){
            System.out.println("Panier accordé, 1 lancer");
            new Game().new_score(player, 2, shooter_team);
            new Fault().new_fault(team, player, true, 1, shooter, shooter_team);
        }
        else{
            System.out.println("2 lancers");
            new Fault().new_fault(team, player, true, 2, shooter, shooter_team);
        }
    }
      
    
    /*exclusion d un joueur*/
    public void player_out(Player player){
        arbitreDit();
        System.out.println(player.name() + "a commis 5 fautes.");
        System.out.println("Veuillez procéder à un changement");
    }
    
    /*permet de faire un changement pendant le match*/
    public void replacement(Player player_leaving, Player player_entering){
        player_leaving.f5_player_in_game(player_leaving, false);
        player_entering.f5_player_in_game(player_entering, true);
    }
 
}
