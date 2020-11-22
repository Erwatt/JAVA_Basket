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
public class basket {
    public static void main(String Args[]){
        team teams[] = new team[2];
        teams[0] = team.team1;
        teams[1] = team.team2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Score     "+ teams[0].points() + " : " + teams[1].points());
        System.out.println("Action possibles :");
        System.out.println("Panier marqué : 1");
        System.out.println("Faute : 2");
        Integer answer = scan.nextInt();
        switch (answer){
            case 1:
                System.out.println(teams[0].player());
                
        }
    }
    
}
