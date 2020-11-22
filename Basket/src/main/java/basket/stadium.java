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
public class stadium {
    private String stadium_name;
    private String country;
    
    public stadium (String stadium_name,String country) {
        this.stadium_name = stadium_name;
        this.country = country;
    
}
    static stadium stadium1 = new stadium("Paris","France");
    static stadium stadium2 = new stadium("Bruxelles","Belgique");
    static stadium stadium3 = new stadium("Los Angeles","USA");
    static stadium stadium4 = new stadium("Montreal","CANADA");
}
