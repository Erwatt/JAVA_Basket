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
    
    public void arbitreDit(){
        System.out.print("L'arbitre dit au micro: ");
    }
   /* public void let() {
        arbitreDit();
        System.out.println("Il y a let. Veuillez recommencer à servir");
    }*/

    public void faute() {
        arbitreDit();
        System.out.println("Faute");
        new_fault(team, player, 0, 0);
        if (team.fault>5) {
            System.out.println("2 lancers");
            new_fault(team, player, 1, 2);
        }
    }
    
    public void faute_sur_tir() {
        arbitreDit();
        System.out.println("Faute");
        if (panier_marqué == 1){
            System.out.println("Panier accordé, 1 lancer");
            new_fault(team, player, 1, 1);
        }
        else{
            System.out.println("2 lancers");
            new_fault(team, player, 1, 2);
        }
    }
    
 /*    public void annonceScoreEchange(Joueur joueur1, Joueur joueur2, String score1, String score2){
        arbitreDit();
        System.out.println("le joueur: "+joueur1.getPrenom()+" a "+score1+" et le joueur: "+joueur2.getPrenom()+" a "+score2);
    }*/
}
