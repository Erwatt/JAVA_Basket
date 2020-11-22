/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;
import java.util.ArrayList;

/**
 *
 * @author erwan & adrien
 */
public class Team {
    private ArrayList<Player> player = new ArrayList<Player>();;
    private Coach coach;
    private String team_name;
    private String country;
    private Stadium stadium;
    private Integer fault;
    private Integer points;


    
    public Team (String team_name,Coach coach ,String country, Stadium stadium,ArrayList<Player> player, int fault, int points) {
        this.team_name = team_name;
        this.country = country;
        this.coach = coach;
        this.stadium = stadium;
        this.player = player;
        this.fault = fault;
        this.points = points;
    }
    
     
    public String team_name(){
        return team_name;
    }
    
         
    public void f5_team_points(Team team, Integer points){
        team.points += points;
    }
    
    /*ajoute les fautes a l equipe*/    
    Integer fault(){
        return this.fault;
    }
    
    ArrayList<Player> player(){
        return player;
    }
    
    public void f5_team_fault(Team team, Integer faults){
        team.fault = faults;
    }
    
    Integer points(){
        return this.points;
    }
}
