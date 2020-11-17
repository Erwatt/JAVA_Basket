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
public class team {
    private player player;
    private coach coach;
    private String team_name;
    private String firstname;
    private String country;
    private stadium stadium;
    private Integer fault;
    private Integer points;


    
    public team (String team_name, String firstname, String country, String paris, int stadium, int par1) {
        this.player=player;
        this.team_name = team_name;
        this.firstname = firstname;
        this.country = country;
       
        
    }
    public team (coach coach,String team_name,String country,stadium stadium,Integer fault,Integer points) {
    team team1 = new team("coach1","ISEN","France","Paris",0,0);
    team team2 = new team("coach2","HEI","Belgique","BRX",0,0);
    
    }
    
    
    public void f5_team_points(team team, Integer points){
        team.points += points;
    }
}
