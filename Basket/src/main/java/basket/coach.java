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
public class coach {
    private String name;
    private String firstname;
    private Integer fault;
    private team teams;
    
  public coach (String name, String firstname, int fault, String teams) {
    coach coach1 = new coach("Bionne","Maxence",0,"ISEN");
    coach coach2 = new coach("Chevillion","Tanguy",0,"HEI");
    coach coach3 = new coach("Declercq","Gregoire",0,"ISA");
    coach coach4 = new coach("Ducornait","Julien",0,"ICAM");
  } 
}
