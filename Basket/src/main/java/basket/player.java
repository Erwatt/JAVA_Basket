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
public class player {
    private String name;
    private String firstname;
    private Integer age;
    private team team;
    private Integer points;
    private Integer fault;
    private Boolean in_game;  
    
    /**
     *
     * @param name
     * @param firstname
     * @param age
     * @param team
     * @param points
     * @param fault
     * @param in_game
     */
    
    
    public player(String name, String firstname, int age, String team, int points, int fault, boolean in_game) {
        player player1 = new player ("Wattelier","Erwan",21,"ISEN",0,0,true);
        player player2 = new player ("Bayeulle","Adrien",21,"ISEN",0,0,true);
        player player3 = new player ("Mesureur","Adrien",22,"ISEN",0,0,true);
        player player4 = new player ("Blasselle","Thibaut",20,"ISEN",0,0,true);
        player player5 = new player ("Steve","Benjamin",22,"ISEN",0,0,true);
        player player6 = new player ("Steve","Jeremy",22,"ISEN",0,0,true);
        player player7 = new player ("Vasseur","Adelie",22,"HEI",0,0,true);
        player player8 = new player ("Capoen","Alex",21,"HEI",0,0,true);
        player player9 = new player ("Bahi","Anass",24,"HEI",0,0,true);
        player player10 = new player ("Monvoisin","Anthony",22,"HEI",0,0,true);
        player player11 = new player ("Aseet","Antoine",21,"HEI",0,0,true);
        player player12 = new player ("Francoise","Arnaud",21,"HEI",0,0,true);
        player player13 = new player ("Grosbety","Benjamin",21,"ISA",0,0,true);
        player player14 = new player ("Benoist","Camille",23,"ISA",0,0,true);
        player player15 = new player ("Fenart","Charles",24,"ISA",0,0,true);
        player player16 = new player ("Sailliot","Charles",21,"ISA",0,0,true);
        player player17 = new player ("Arnaud","Clement",25,"ISA",0,0,true);
        player player18 = new player ("Blondeau","Corentin",21,"ISA",0,0,true);
        player player19 = new player ("Delannoy","Cyril",20,"ICAM",0,0,true);
        player player20 = new player ("Baurens","Damien",21,"ICAM",0,0,true);
        player player21 = new player ("Deleval","Elise",22,"ICAM",0,0,true);
        player player22 = new player ("Texier","Eloi",21,"ICAM",0,0,true);
        player player23 = new player ("Schelfhout","Etienne",21,"ICAM",0,0,true);
        player player24 = new player ("Dalmas","Eugenie",21,"ICAM",0,0,true);
    }
    
    Integer points(){
        return this.points;
    }
    
    Integer fault(){
        return this.fault;
    }
    
    public void f5_player_points(player player, Integer points){
        player.points += points;
        team.f5_team_points(player.team, points);
    }
    
    public void f5_player_fault(player player, Integer fault){
        player.fault = fault;
    }
}
    