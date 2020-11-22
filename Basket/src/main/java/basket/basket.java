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
public class Basket {
    public static void main(String Args[]){
        Player player1 = new Player ("Wattelier","Erwan",21,0,0,true); 
        Player player2 = new Player ("Bayeulle","Adrien",21,0,0,true);
        Player player3 = new Player ("Mesureur","Adrien",22,0,0,true);
        Player player4 = new Player ("Blasselle","Thibaut",20,0,0,true);
        Player player5 = new Player ("Steve","Benjamin",22,0,0,true);
        Player player6 = new Player ("Steve","Jeremy",22,0,0,true);
        Player player7 = new Player ("Vasseur","Adelie",22,0,0,true);
        Player player8 = new Player ("Capoen","Alex",21,0,0,true);
        Player player9 = new Player ("Bahi","Anass",24,0,0,true);
        Player player10 = new Player ("Monvoisin","Anthony",22,0,0,true);
        Player player11 = new Player ("Asset","Antoine",21,0,0,true);
        Player player12 = new Player ("Francoise","Arnaud",21,0,0,true);
        Player player13 = new Player ("Grosbety","Benjamin",21,0,0,true);
        Player player14 = new Player ("Benoist","Camille",23,0,0,true);
        Player player15 = new Player ("Fenart","Charles",24,0,0,true);
        Player player16 = new Player ("Sailliot","Charles",21,0,0,true);
        Player player17 = new Player ("Arnaud","Clement",25,0,0,true);
        Player player18 = new Player ("Blondeau","Corentin",21,0,0,true);
        Player player19 = new Player ("Delannoy","Cyril",20,0,0,true);
        Player player20 = new Player ("Baurens","Damien",21,0,0,true);
        Player player21 = new Player ("Deleval","Elise",22,0,0,true);
        Player player22 = new Player ("Texier","Eloi",21,0,0,true);
        Player player23 = new Player ("Schelfhout","Etienne",21,0,0,true);
        Player player24 = new Player ("Dalmas","Eugenie",21,0,0,true);
        
        
        Coach coach1 = new Coach("Bionne","Maxence",0);
        Coach coach2 = new Coach("Chevillion","Tanguy",0);
        Coach coach3 = new Coach("Declercq","Gregoire",0);
        Coach coach4 = new Coach("Ducornait","Julien",0);
        
        Stadium stadium1 = new Stadium("Paris","France");
        Stadium stadium2 = new Stadium("Bruxelles","Belgique");
        Stadium stadium3 = new Stadium("Los Angeles","USA");
        Stadium stadium4 = new Stadium("Montreal","CANADA");
        Team team1 = new Team("ISEN",coach1, "France", stadium1,players1,0,0);
        Team team2 = new Team("HEI",coach2, "Belgique", stadium2,players1,0,0);
        Team team3 = new Team("ISA",coach3,"USA",stadium3,players1,0,0);
        Team team4 = new Team("ICAM",coach4,"CANADA",stadium4,players1,0,0);
        Team teams[] = new team[2];
        teams[0] = team1;
        teams[1] = team2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Score     "+ teams[0].points() + " : " + teams[1].points());
        System.out.println("Action possibles :");
        System.out.println("Panier marqué : 1");
        System.out.println("Faute : 2");
        Integer answer = scan.nextInt();
        switch (answer){
            case 1:
                System.out.println(teams[0].player);
            case 2:
                
                
        }
    }
    
}
