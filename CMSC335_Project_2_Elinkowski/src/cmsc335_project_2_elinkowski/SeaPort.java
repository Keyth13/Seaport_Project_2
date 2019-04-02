package cmsc335_project_2_elinkowski;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * File name: SeaPort class
 * Date: 20181025 1025L
 * Author: Keith R. Elinkowski
 * Purpose: Extends Thing class.  Holds lists for all docks, ships, and people 
 * of a specific port.  Also holds a queue list of ships waiting to dock at a 
 * specific port.
 */

public class SeaPort extends Thing{
    private ArrayList<Dock> docks;        
    private ArrayList<Ship> queues;       
    private ArrayList<Ship> ships;        
    private ArrayList<Person> people;  
    private ArrayList<Ship> cargo;
    
    //SeaPort Constructor
    public SeaPort(Scanner scanner) {
        super(scanner);
        docks = new ArrayList<>();
        queues = new ArrayList<>();
        ships = new ArrayList<>();
        people = new ArrayList<>();
        cargo = new ArrayList<>();
    }
    
    //Getter and Setter for docks
    public ArrayList<Dock> getDocks() {
        return docks;
    }
    
    public void setDocks(ArrayList<Dock> dock) {
        docks = dock;
    }
    
    //Getter and Setter for queue
    public ArrayList<Ship> getQueue(){
        return queues;
    }
    
    public void setQueue(ArrayList<Ship> queue) {
        queues = queue;
    }
    
    //Getter and Setter for ships
    public ArrayList<Ship> getShips() {
        return ships;
    }
    
    public void setShips(ArrayList<Ship> ship) {
        ships = ship;
    }
    
    //Getter and Setter for persons
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public void setPersons(ArrayList<Person> person) {
        people = person;
    }
    
    public ArrayList<Ship> getCargoShips(){
        return cargo;
    }
    
    public void setCargoShips(ArrayList<Ship> cShip){
        cargo = cShip;
    }
    
    
    //toString method
    @Override
    public String toString() {
        String outPorts = "<<<------------Port-------------->>>\n";
        String outDocks = "<<<------------Piers------------>>>\n";
        String outQueue = "<<<------------Queue------------>>>\n";
        String outShips = "<<<------------Ships------------>>>\n";
        String outPersons = "<<<------------People------------>>>\n";
        for(Dock dock : docks) {
            outDocks += String.format(">>> %s\n", dock.toString());
        }
        
        for(Ship queue : queues) {
            outQueue += String.format(">>> %s\n", queue.toString());
        }
        
        for(Ship ship : ships) {
            outShips += String.format(">>> %s\n", ship.toString());
        }
        
        for(Person person : people) {
            outPersons += String.format(">>> %s\n", person.toString());
        }
        outPorts += String.format(">>> %s\n", super.toString());
        return outPorts + outDocks + outQueue + outShips + outPersons;
    }
}