package cmsc335_project_2_elinkowski;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * File name: Job class
 * Date: 2018102 0715L
 * Author: Keith R. Elinkowski
 * Purpose: Extends Thing class.  Class holds various Jobs and gets their 
 * requirements and tracks how long they took to complete.
 */

public class Job extends Thing {
    private double duration;
    private ArrayList<String> requirements;
    
    //Job Constructor
    public Job(Scanner scanner) {
        super(scanner);
        if(scanner.hasNextDouble()){
            duration = scanner.nextDouble();
        }
        else {
            duration = 0.0;
        }
        requirements = new ArrayList<>();
        while(scanner.hasNext()) {
            requirements.add(scanner.next());
        }
    }
    
    //Getter and Setter for duration
    public double getDuration() {
        return duration;
    }
    
    public void setDuration(double jobDuration){
        if(jobDuration >= 0.0) {
            duration = jobDuration;
        }
    }
    
    //Getter and Setter for requirements
    public ArrayList<String> getRequirements(){
        return requirements;
    }
    
    public void setRequirements(ArrayList<String> jobRequirement){
        requirements = jobRequirement;
    }
    
    //toString Method
    @Override
    public String toString() {
        String outJob = String.format("%s ", super.toString());
        outJob += String.format("%.2f Hours, ", duration);
        outJob += String.format("Requirements: ");
        for(String string : requirements) {
            outJob += String.format("%s, ", string);
        }
        outJob += String.format(" ");
        return outJob;
    }
}