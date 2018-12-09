// Tumelo Lephadi
// Program that uses vehicle object with additional number of doors
// 24 August 2015

public class Car extends Vehicle{
   
   private int numberOfDoors;
   
   public Car(String colour, int numberOfPassengers, int doors){
      super(numberOfPassengers, colour);
      this.numberOfDoors = doors;   
   }    
   
   public String toString(){
      return super.toString() + " "  + numberOfDoors + " doors";
   }       
}
