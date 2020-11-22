/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author erwan & adrien
 */
public class Basket {
    public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        
        Player player1 = new Player ("Wattelier","Erwan",21,0,0,true); 
        Player player2 = new Player ("Bayeulle","Adrien",21,0,0,true);
        Player player3 = new Player ("Mesureur","Adrien",22,0,0,true);
        Player player4 = new Player ("Blasselle","Thibaut",20,0,0,true);
        Player player5 = new Player ("Steve","Benjamin",22,0,0,true);
        Player player6 = new Player ("Steve","Jeremy",22,0,0,false);
        Player player7 = new Player ("Vasseur","Adelie",22,0,0,true);
        Player player8 = new Player ("Capoen","Alex",21,0,0,true);
        Player player9 = new Player ("Bahi","Anass",24,0,0,true);
        Player player10 = new Player ("Monvoisin","Anthony",22,0,0,true);
        Player player11 = new Player ("Asset","Antoine",21,0,0,true);
        Player player12 = new Player ("Francoise","Arnaud",21,0,0,false);
        Player player13 = new Player ("Grosbety","Benjamin",21,0,0,true);
        Player player14 = new Player ("Benoist","Camille",23,0,0,true);
        Player player15 = new Player ("Fenart","Charles",24,0,0,true);
        Player player16 = new Player ("Sailliot","Charles",21,0,0,true);
        Player player17 = new Player ("Arnaud","Clement",25,0,0,true);
        Player player18 = new Player ("Blondeau","Corentin",21,0,0,false);
        Player player19 = new Player ("Delannoy","Cyril",20,0,0,true);
        Player player20 = new Player ("Baurens","Damien",21,0,0,true);
        Player player21 = new Player ("Deleval","Elise",22,0,0,true);
        Player player22 = new Player ("Texier","Eloi",21,0,0,true);
        Player player23 = new Player ("Schelfhout","Etienne",21,0,0,true);
        Player player24 = new Player ("Dalmas","Eugenie",21,0,0,false);
        
        ArrayList<Player> players1 = new ArrayList<Player>();
        players1.add(player1);
        players1.add(player2);
        players1.add(player3);
        players1.add(player4);
        players1.add(player5);
        players1.add(player6);
        
        ArrayList<Player> players2 = new ArrayList<Player>();
        players2.add(player7);
        players2.add(player8);
        players2.add(player9);
        players2.add(player10);
        players2.add(player11);
        players2.add(player12);
        
        ArrayList<Player> players3 = new ArrayList<Player>();
        players3.add(player13);
        players3.add(player14);
        players3.add(player15);
        players3.add(player16);
        players3.add(player17);
        players3.add(player18);
        
        ArrayList<Player> players4 = new ArrayList<Player>();
        players4.add(player19);
        players4.add(player20);
        players4.add(player21);
        players4.add(player22);
        players4.add(player23);
        players4.add(player24);
        
        
        Coach coach1 = new Coach("Bionne","Maxence",0);
        Coach coach2 = new Coach("Chevillion","Tanguy",0);
        Coach coach3 = new Coach("Declercq","Gregoire",0);
        Coach coach4 = new Coach("Ducornait","Julien",0);
        
        Stadium stadium1 = new Stadium("Paris","France");
        Stadium stadium2 = new Stadium("Bruxelles","Belgique");
        Stadium stadium3 = new Stadium("Los Angeles","USA");
        Stadium stadium4 = new Stadium("Montreal","CANADA");
        
        
        Team team1 = new Team("ISEN",coach1, "France", stadium1,players1,0,0);
        Team team2 = new Team("HEI",coach2, "Belgique", stadium2,players2,0,0);
        Team team3 = new Team("ISA",coach3,"USA",stadium3,players3,0,0);
        Team team4 = new Team("ICAM",coach4,"CANADA",stadium4,players4,0,0);
        
        
        Team teams[] = new Team[4];
        teams[0] = team1;
        teams[1] = team2;
        teams[2] = team3;
        teams[3] = team4;
        
        System.out.println("Quelles sont les équipes en jeu ?");
        for (Integer i = 0; i < 4; i++){
            System.out.println(teams[i].team_name() + " : " + i);
        }
        System.out.println("Equipe n°1 :");
        Team playing_team_1 = teams[scan.nextInt()];
        System.out.println("Equipe n°2 :");
        Team playing_team_2 = teams[scan.nextInt()];
        boolean game_end = false;                
        
        while (game_end == false) {
            System.out.println("Score     "+ playing_team_1.team_name() + " " +playing_team_1.points() + " : " + playing_team_2.team_name() + " " +playing_team_2.points());
            System.out.println("Action possibles :");
            System.out.println("Panier marqué : 1");
            System.out.println("Faute : 2");
            System.out.println("Changement : 3");
            System.out.println("Fin de match : 4");
            Integer answer = scan.nextInt();
            switch (answer){
                case 1:
                    System.out.println("Quelle équipe a marqué ?");
                    System.out.println(playing_team_1.team_name() + " : 1");
                    System.out.println(playing_team_2.team_name() + " : 2");
                    Player scoring_player;
                    if (scan.nextInt() == 1){
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_1.player().get(i).in_game() == true){
                                System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                            }
                        }
                        scoring_player = playing_team_1.player().get(scan.nextInt());
                        System.out.println("Combien de point vient-il de marquer ?");
                        Integer scored_points = scan.nextInt();
                        new Game().new_score(scoring_player, scored_points, playing_team_1);
                    }
                    else if (scan.nextInt() == 2){
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_2.player().get(i).in_game() == true){
                                System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                            }
                        }
                        scoring_player = playing_team_2.player().get(scan.nextInt());
                        System.out.println("Combien de point vient-il de marquer ?");
                        Integer scored_points = scan.nextInt();
                        new Game().new_score(scoring_player, scored_points, playing_team_2);
                    }
                break;

                case 2:
                    System.out.println("Quelle équipe a commis la faute ?");
                    System.out.println(playing_team_1.team_name() + " : 1");
                    System.out.println(playing_team_2.team_name() + " : 2");
                    Player faulting_player;
                    Player shooting_player;
                    if (scan.nextInt() == 1){
                        System.out.println("Quel joueur a commis la faute ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_1.player().get(i).in_game() == true){
                                System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                            }
                        }
                        faulting_player = playing_team_1.player().get(scan.nextInt());
                        System.out.println("Y a t'il faute sur tir ? 1/0");
                        if (scan.nextInt() == 0){
                            System.out.println("Quelle joueur tire les potentiels lancers francs ?");
                            for (Integer i = 0; i < 6; i++){
                                if (playing_team_2.player().get(i).in_game() == true){
                                    System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                                }
                            }
                            shooting_player = playing_team_2.player().get(scan.nextInt());
                            new Referee().faute(playing_team_1, faulting_player, shooting_player, playing_team_2);
                        }
                        else if (scan.nextInt() == 1){
                            System.out.println("Qui a tiré ?");
                            for (Integer i = 0; i < 6; i++){
                                if (playing_team_2.player().get(i).in_game() == true){
                                    System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                                }
                            }
                            shooting_player = playing_team_2.player().get(scan.nextInt());
                            System.out.println("Le panier est-il marqué ? 1/0");
                            if (scan.nextInt() == 1){
                                new Referee().faute_sur_tir(playing_team_1, faulting_player, true, shooting_player, playing_team_2);
                            }
                            else if (scan.nextInt() == 0){
                                new Referee().faute_sur_tir(playing_team_1, faulting_player, false, shooting_player, playing_team_2);
                            }
                        }
                    }
                    else if (scan.nextInt() == 2){
                        System.out.println("Quel joueur a commis la faute ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_2.player().get(i).in_game() == true){
                                System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                            }
                        }
                        faulting_player = playing_team_2.player().get(scan.nextInt());
                        System.out.println("Y a t'il faute sur tir ? 1/0");
                        if (scan.nextInt() == 0){
                            System.out.println("Quelle joueur tire les potentiels lancers francs ?");
                            for (Integer i = 0; i < 6; i++){
                                if (playing_team_1.player().get(i).in_game() == true){
                                    System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                                }
                            }
                            shooting_player = playing_team_1.player().get(scan.nextInt());
                            new Referee().faute(playing_team_2, faulting_player, shooting_player, playing_team_1);
                        }
                        else if (scan.nextInt() == 1){
                            System.out.println("Qui a tiré ?");
                            for (Integer i = 0; i < 6; i++){
                                if (playing_team_1.player().get(i).in_game() == true){
                                    System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                                }
                            }
                            shooting_player = playing_team_1.player().get(scan.nextInt());
                            System.out.println("Le panier est-il marqué ? 1/0");
                            if (scan.nextInt() == 1){
                                new Referee().faute_sur_tir(playing_team_2, faulting_player, true, shooting_player, playing_team_1);
                            }
                            else if (scan.nextInt() == 0){
                                new Referee().faute_sur_tir(playing_team_2, faulting_player, false, shooting_player, playing_team_1);
                            }
                        }
                    }
                break;
                
                case 3:
                    Player player_leaving;
                    Player player_entering;
                    System.out.println("Quelle équipe effectue un changement ?");
                    System.out.println(playing_team_1.team_name() + " : 1");
                    System.out.println(playing_team_2.team_name() + " : 2");
                    if (scan.nextInt() == 1){
                        System.out.println("Quelle joueur sort du terrain ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_1.player().get(i).in_game() == true){
                                System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                            }
                        }
                        player_leaving = playing_team_1.player().get(scan.nextInt());
                        
                        System.out.println("Quelle joueur entre sur le terrain ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_1.player().get(i).in_game() == false){
                                System.out.println(playing_team_1.player().get(i).name() + " : " + i);
                            }
                        }
                        player_entering = playing_team_1.player().get(scan.nextInt());
                        
                        new Referee().replacement(player_leaving, player_entering);
                    }
                    else if (scan.nextInt() == 2){
                        System.out.println("Quelle joueur sort du terrain ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_2.player().get(i).in_game() == true){
                                System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                            }
                        }
                        player_leaving = playing_team_2.player().get(scan.nextInt());
                        
                        System.out.println("Quelle joueur entre sur le terrain ?");
                        for (Integer i = 0; i < 6; i++){
                            if (playing_team_2.player().get(i).in_game() == false){
                                System.out.println(playing_team_2.player().get(i).name() + " : " + i);
                            }
                        }
                        player_entering = playing_team_2.player().get(scan.nextInt());
                        
                        new Referee().replacement(player_leaving, player_entering);
                    }
                break;
                
                case 4:
                    System.out.println("Match terminé");
                    System.out.println("Score     "+ playing_team_1.team_name() + " " +playing_team_1.points() + " : " + playing_team_2.team_name() + " " +playing_team_2.points());
                    if (playing_team_1.points() > playing_team_2.points()){
                        System.out.println("Victoire de l'équipe " + playing_team_1.team_name());
                    }
                    else if (playing_team_1.points() > playing_team_2.points()){
                        System.out.println("Victoire de l'équipe " + playing_team_2.team_name());
                    }
                    else if (playing_team_1.points() == playing_team_2.points()){
                        System.out.println("Match nul");
                    }
                    game_end = true;
                break;

            }  
        }
    }
    
}
