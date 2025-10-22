
public class Engine implements EngineRequirements{

    private FuelType FuelType1; //uses FuelType class and defines attribute FuelType1
    private double CurrentFuel; //defines a current fuel value
    private double MaxFuel; //defines a current fuel value

    /**
     * Constructor initializing the attributes of the class
     * @param FuelType1 type of fuel engine uses: fuel types found in fueltype.java
     * @param CurrentFuel amount of fuel currently in tank
     * @param MaxFuel fuel tank capacity
     */
    public Engine(FuelType FuelType1, double CurrentFuel, double MaxFuel){
        this.FuelType1 = FuelType1;
        this.CurrentFuel = CurrentFuel;
        this.MaxFuel = MaxFuel;
    }

    /**
     * Makes the FuelType information public to other classes for use
     * @return FuelType that states the FuelType of the Car
     */
    public FuelType getFuelType1(){
        return this.FuelType1;
    }
    
    /**
     * Makes the Max Fuel information public to other classes for use
     * @return double that states the max fuel of the Car
     */
    public double getMaxFuel(){
        return this.MaxFuel;
    }

    /**
     * Makes the Current Fuel information public to other classes for use
     * @return double that states the current fuel of the Car
     */
    public double getCurrentFuel(){
        return this.CurrentFuel;
    }

    /**
     * updates current fuel to max fuel
     */
    public void refuel(){
        this.CurrentFuel = this.MaxFuel;
    }

    /**
     * 
     * @return T/F: if the current fuel is greater than 0, then decrease the fuel by 1 at a time
     */
    public Boolean go(){
        if (this.CurrentFuel > 0) { //checks if current fuel is greater than 0
            this.CurrentFuel -= 1; //decreases fuel by 1
            return true;
        }
        return false;
    }

    

}