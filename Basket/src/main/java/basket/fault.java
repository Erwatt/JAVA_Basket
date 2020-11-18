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
public class fault {
    private team team;
    private player player;
    private Boolean lancer;
    private Integer Nbr_lancer;
    
    public fault new_fault(team team, player player, Boolean lancer, Integer Nbr_lancer){
        fault fault = new fault()/*(team, player, lancer, Nbr_lancer)*/;
        fault.player = player;
        fault.team = team;
        fault.lancer = lancer;
        fault.Nbr_lancer = Nbr_lancer;
        return fault;
    }
}
