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
public class team {
    private player[] player;
    private coach coach;
    private String team_name;
    private String country;
    private stadium stadium;
    private Integer fault;
    private Integer points;


    
    public team (String team_name,coach coach ,String country, stadium stadium, int fault, int points) {
        this.team_name = team_name;
        this.country = country;
        this.coach = coach;
        this.stadium = stadium;
        this.fault = fault;
        this.points = points;
    }
    
    
    static team team1 = new team("ISEN", coach.coach1, "France",stadium.stadium1,0,0);
    static team team2 = new team("HEI",coach.coach2,"Belgique",stadium.stadium2,0,0);
    static team team3 = new team("ISA",coach.coach3,"USA",stadium.stadium3,0,0);
    static team team4 = new team("ICAM",coach.coach4,"CANADA",stadium.stadium4,0,0);
    
    
    
    
    player[] player(){
        return this.player;
    }
     
    public void f5_team_points(team team, Integer points){
        team.points += points;
    }
    
    /*ajoute les fautes a l equipe*/    
    Integer fault(){
        return this.fault;
    }
    
    public void f5_team_fault(team team, Integer faults){
        team.fault = faults;
    }
    
    Integer points(){
        return this.points;
    }
}
