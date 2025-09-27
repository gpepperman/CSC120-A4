import java.util.ArrayList;

public class Train {

    private Engine engine; //engine form Engine class
    private ArrayList<Car> car; //list of cars from Car class

    /**
     * Constructor initializing the attributes of the class
     * @param engine engine from Engine class
     */
    public Train(Engine engine){
        this.engine = engine;
        this.car = new ArrayList<>();
    }

    /**
     * Makes the engine information public to other classes for use
     * @return engine from Engine class
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Makes the car information public to other classes for use
     * @param i a specific car inside the train
     * @return
     */
    public Car getCar(int i){
        return this.car.get(i);
    }

    /**
     * The max capacity from Car class for each car
     * @return an integer which states the max capacity
     */
    public int getMaxCapacity(){
        int total = 0;
        for (Car c : car) {
            total += c.getCapacity();
        }
        return total;
    }

    /**
     * Calculates how many seats are remaining for a specific car.
     * @return int of seats remaining per a car
     */
    public int seatsRemaining(){
        int total = 0;
        for (Car c : car) {
            total += c.seatsRemaining();
        }
        return total;

    }

    // prints the list of all the passenger for each car
    public void printManifest(){
        for (Car c : car) {
        c.printManifest();
    }
    } 


    /**
     * Runs the code and performs opperations
     * @param args the code written inside
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 5.0);//creates engine
        Car Car1 = new Car("1", 3); //creates cars
        Car Car2 = new Car("2", 3);

        Passenger Grace = new Passenger("Grace");//creates passengers
        Passenger Emily = new Passenger("Emily");
        Passenger Greta = new Passenger("Greta");
        Passenger Sam = new Passenger("Sam");
        Passenger Henry = new Passenger("Henry");
        Passenger George = new Passenger("George");
        Passenger Manny = new Passenger("Manny");

        
        System.out.println(); //header for adding passengers to car
        System.out.println("-----Passengers Boarding the train----");

        Car1.addPassenger(Grace); //adding and removing passengers to and from specific cars
        Car1.addPassenger(Emily);
        Car1.addPassenger(Greta);
        Car1.addPassenger(Sam);

        Car2.addPassenger(Sam);
        Car2.addPassenger(Henry);
        Car2.addPassenger(George);

        Car1.removePassenger(Emily);
        Car1.addPassenger(Manny);

        System.out.println(); //header for printing manifest
        System.out.println("-----List of passengers per car----");
        Car1.printManifest();//the passengers in each car
        Car2.printManifest();

        System.out.println("-----Train refuels and leaves the station----"); //header for train going
        myEngine.refuel(); //start with full engine
        while (myEngine.go()) { //loop that keeps using fuel until empty
            System.out.println("Choo choo!"); //prints for each go
        }
        System.out.println("Out of fuel."); //prints when no fuel is remaining
    }
}
