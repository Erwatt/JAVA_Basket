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
        player player1 = new player ("wattelier","erwan",21,"ISEN",0,0,true);
        player player2 = new player ("bayeulle","adrien",21,"ISEN",0,0,true);
        player player3 = new player ("","",21,"ISEN",0,0,true);
        player player4 = new player ("","",21,"ISEN",0,0,true);
        player player5 = new player ("","",21,"ISEN",0,0,true);
        player player6 = new player ("","",21,"HEI",0,0,true);
        player player7 = new player ("","",21,"HEI",0,0,true);
        player player8 = new player ("","",21,"HEI",0,0,true);
        player player9 = new player ("","",21,"HEI",0,0,true);
        player player10 = new player ("","",21,"HEI",0,0,true);
    }
    
    Integer points(){
        return this.points;
    }
    
    public void f5_player_points(player player, Integer points){
        player.points = points;
        team.f5_team_points(player.team, points);
    }
}
    