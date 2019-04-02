package cmsc335_project_2_elinkowski;

import java.util.Scanner;

/**
 * File name: Dock class
 * Date: 20181025 1450L
 * Author: Keith R. Elinkowski
 * Purpose: Extends Thing class.  Specifies which ships are docked.
 */

public class Dock extends Thing{
    private Ship ship;
    
    //Dock Constructor
    public Dock(Scanner scanner) {
        super(scanner);
    }
    
    //Getter and Setter for ship
    public Ship getShip() {
        return ship;
    }
    
    public void setShip(Ship s) {
        ship = s;
    }
    
    //toString method
    @Override
    public String toString() {
        String outDock = String.format("%s ", super.toString());
        if(ship != null) {
            outDock += ship.toString();
        }
        else {
            outDock = "";
        }
        return outDock;
    }
}