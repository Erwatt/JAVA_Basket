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
public class referee {
    private game game;
    
    public static void arbitreDit(){
        System.out.print("L'arbitre dit au micro: ");
    }
   /* public void let() {
        arbitreDit();
        System.out.println("Il y a let. Veuillez recommencer à servir");
    }*/

    /*action de l arbitre lors d une faute*/
    public void faute(team team, player player, player shooter) {
        arbitreDit();
        System.out.println("Faute");
        if (team.fault()>5) {
            System.out.println("2 lancers");
            fault.new_fault(team, player, true, 2, shooter);
        }
        else{
            fault.new_fault(team, player, true, 0, shooter);
        }
    }
    
    
    public void faute_sur_tir(team team, player player, Boolean panier_marqué, player shooter) {
        arbitreDit();
        System.out.println("Faute");
        if (panier_marqué == true){
            System.out.println("Panier accordé, 1 lancer");
            game.new_score(player, 2);
            fault.new_fault(team, player, true, 2, shooter);
        }
        else{
            System.out.println("2 lancers");
            fault.new_fault(team, player, true, 2, shooter);
        }
    }
        
    /*exclusion d un joueur*/
    public static void player_out(player player){
        arbitreDit();
        System.out.println(player + "a commis 5 fautes.");
        System.out.println("Veuillez procéder à un changement");
    }
    
    
 /*    public void annonceScoreEchange(Joueur joueur1, Joueur joueur2, String score1, String score2){
        arbitreDit();
        System.out.println("le joueur: "+joueur1.getPrenom()+" a "+score1+" et le joueur: "+joueur2.getPrenom()+" a "+score2);
    }*/
}
