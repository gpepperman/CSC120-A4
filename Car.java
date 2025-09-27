import java.util.ArrayList;

public class Car {

    private String CarID; //defines an attribute CarID which I use for referencing when printing
    private ArrayList<Passenger> passengers; //each car has a list of passengers
    private int CarCapacity; //every car has a capacity
    
    /**
     * Constructor initializing the attributes of the class
     * @param CarID a number attatched to each car
     * @param CarCapacity how many passengers are allowed in each car
     */
    public Car(String CarID, int CarCapacity){
        this.CarID = CarID;
        this.CarCapacity = CarCapacity;
        this.passengers = new ArrayList<>();
    }

    /**
     * Makes the CarID information public to other classes for use
     * @return String that states the numerical ID of the Car
     */
    public String getID(){
        return this.CarID;
    }

    /**
     * Makes the car capacity information public to other classes for use
     * @return int states the capacity of the car
     */
    public int getCapacity(){
        return this.CarCapacity;
    }

    /**
     * Checks how many seats are remaining
     * @return int that states how many cars are remaining
     */
    public int seatsRemaining(){
        return this.CarCapacity -= passengers.size(); //subtracts amount of passengers from car capacity
    }

    /**
     * Adds a passenger to a car and prints 
     * @param p a specific passenger from the array list of passengers
     * @return T/F: checks is the car has capacity or not
     *              true: passenger is added to car and staement is printed out saying so. 
     *              false: passenger is not added to car and staement is printed out saying car is full
     */
    public Boolean addPassenger(Passenger p){
        if (passengers.size() < CarCapacity) {//checks to make sure car has capacity for extra passenger
            passengers.add(p); //add passenger because capacity
            System.out.println(p + " added to Car " + CarID +"." ); //print statement out saying passenger added
            return true;  // boolean statement
            } else { //if no capacity in car
                System.out.println("Car is full! " + p + " cannot be added to Car " + CarID +"."  ); //print statement that car is full
                return false; // boolean statement
                }
    }

    /**
     * 
     * @param p a specific passenger from the array list of passengers
     * @return T/F: checks is the passenger is in the car or not
     *              true: passenger is removed from car and staement is printed out saying so. 
     *              false: passenger is not in car and staement is printed out saying so.
     */
    Boolean removePassenger(Passenger p){
        if (passengers.contains(p)) { //checks if the passenger is in the list of passengers in car
            passengers.remove(p); // if so then remove passenger from car
            System.out.println(p + " removed from Car " + CarID +"." ); //print out a message saying passenger was removed from car
            return true;  // boolean statement
            } else { // if passenger is not in car
                System.out.println(p + " not in Car " + CarID +"."  ); // print out a message saying passenger is not in car
                return false; // boolean statement
                }
    }


    //prints out the manifest of each car:
    public void printManifest(){
        if (passengers.isEmpty()){ //checks if car is empty
            System.out.println("Car " + CarID + " is empty..."); //prints car is empty
        } else{ //car is not empty
            System.out.println("Car " + CarID + " manifest:"); //prints header for specific card manifest
            System.out.println(passengers); //prints passenger
            System.out.println(); //prints an empty line so multiple car manifests aren't on top of each other
        }

    }
}