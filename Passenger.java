public class Passenger {
    
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
        c.addPassenger(this);
    }

    /**
     * removes a passenger from a specifc car
     * @param c a specifc car c from the Car class
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }

    /**
     * specifies how a passanger should print
     */
    public String toString(){
        return this.name;
    }

    

}
