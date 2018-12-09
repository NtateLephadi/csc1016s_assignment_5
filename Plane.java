// Tumelo Lephadi
// Program that uses vehicle object with additional manufacturer
// 24 August 2015

public class Plane extends Vehicle{
   
   public String manufacturer;
   public int modelNumber;
   
   public Plane(String colour, int numberOfPassengers, String make, int ID){
      super(numberOfPassengers, colour);
      manufacturer = make;
      modelNumber = ID;
   }
   
   public String toString(){
      return super.toString() + " " + manufacturer + " " + modelNumber;
   }
}
