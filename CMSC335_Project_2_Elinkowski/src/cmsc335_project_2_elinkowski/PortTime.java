package cmsc335_project_2_elinkowski;

/**
 * File name: PortTime class
 * Date: 20181025 1012L
 * Author: Keith R. Elinkowski
 * Purpose: Extends Thing class.  Timestamps when a ship arrives to a port and 
 * when it is docked.
 */

public class PortTime {
    private int time;
    
    //PortTime Constructor
    public PortTime() {
        time = 0;
    }
    
    //Getter and Setter for time
    public int getPortTime() {
        return time;
    }
    
    public void setPortTime(int t) {
        if (t >= 0) {
            time = t;
        }
    }
    
    //toString Method
    @Override
    public String toString(){
        return String.format("Time = %d\n", time);
    }
}