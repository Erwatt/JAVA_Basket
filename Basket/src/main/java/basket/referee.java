/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;

/**
 *
 * @author erwan
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
        if (team.fault>5) {
            System.out.println("2 lancers");
        }
    }
    
    public void faute_sur_tir() {
        arbitreDit();
        System.out.println("Faute");
        if (panier_marqué == 1){
            System.out.println("Panier accordé, 1 lancer");
        }
        else{
            System.out.println("2 lancers");
        }
    }
    
 /*    public void annonceScoreEchange(Joueur joueur1, Joueur joueur2, String score1, String score2){
        arbitreDit();
        System.out.println("le joueur: "+joueur1.getPrenom()+" a "+score1+" et le joueur: "+joueur2.getPrenom()+" a "+score2);
    }*/
}
