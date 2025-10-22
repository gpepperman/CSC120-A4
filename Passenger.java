public class Passenger implements PassengerRequirements{
    
    private String name; // name of passenger is a string

    /**
     * Constructor initializing the attributes of the class
     * @param name a name for each passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * adds a passenger to a specific car
     * @param c a specific car c from the Car class
     */
    public void boardCar(Car c){
        if( c == null){
            System.out.println("Car does not exist");
        } else{
            c.addPassenger(this);
        }
        
    }

    //need to make note of what if car doesn't exits

    /**
     * removes a passenger from a specifc car
     * @param c a specifc car c from the Car class
     */
    public void getOffCar(Car c){
     if (c == null){ //checks if car exits
            System.out.println("Car does not exist"); //prints car is empty
        }else{ //car exists
            c.removePassenger(this);
        }

    }

    /**
     * specifies how a passanger should print
     */
    public String toString(){
        return this.name;
    }

    

}
