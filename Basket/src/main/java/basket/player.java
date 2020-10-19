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
    
    public player (String name,String firstname,Integer age,team team,Integer points,Integer fault,Boolean in_game){
        this.name = name;
        this.firstname = firstname;
        this.age = age;       
        this.team = team;
        this.points = points;
        this.fault = fault;
        this.in_game = in_game;        
}
    public boolean in_game(){
        return in_game;
    }
    
    public String name() {
        return this.name;
    }
    
    public String firstname() {
        return this.firstname;
    }
    
    public Integer age() {
        return this.age;
    }
    
    public team team() {
        return this.team;
    }    
    
    public Integer points() {
        return this.points;
    }
    
    public Integer fault() {
        return this.fault;
    }
    
    public void name(String name) {
        this.name = name;
    }
    
    public void firstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void age(Integer age) {
        this.age = age;
    }
    
    public void team(team team) {
        this.team = team;
    }
    
    public void points(Integer points) {
        this.points = points;
    }
    
    public void fault(Integer fault) {
        this.fault = fault;
    }
    

}
