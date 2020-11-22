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
public class Player {
    private String name;
    private String firstname;
    private Integer age;
    private Team team;
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
    
    

    public Player(String name, String firstname, int age, int points, int fault, boolean in_game) {
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.points = points;
        this.fault = fault;
        this.in_game = in_game;

    }
    
    
    Integer points(){
        return this.points;
    }
    
    String name(){
        return this.name;
    }
    
    Integer fault(){
        return this.fault;
    }
    
    public void f5_player_points(Player player, Integer points){
        player.points += points;
        team.f5_team_points(player.team, points);
    }
    
    public void f5_player_fault(Player player, Integer fault){
        player.fault = fault;
    }
}
    