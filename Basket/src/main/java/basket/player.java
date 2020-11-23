
package basket;

/**
 *
 * @author erwan & adrien
 */

/*declaration des fonctions*/
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
    
    /*permet de savoir si le joueur joue*/
    boolean in_game(){
        return in_game;
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
    
    /*actualisation du nombre de point du joueur*/
    public void f5_player_points(Player player, Integer points, Team team){
        player.points += points;
        team.f5_team_points(team, points);
    }
    
    /*actualisation du nombre de fautes du joueur*/
    public void f5_player_fault(Player player, Integer fault){
        player.fault = fault;
    }
    
    /*indique si le joueur est sur le terrain*/
    public void f5_player_in_game(Player player, boolean playing){
        player.in_game = playing;
    }
}
    