// Tumelo Lephadi
// Program that stores details of curries
// 24 August 2015

class Curry extends Food{
   
   private String curryType;
   
   public Curry(String menuItemNumber, String size, String curryType){
      super(menuItemNumber, size);
      this.curryType = curryType;
   }
   
   public String displayList(){
      return "Curry: " + super.displayList() + curryType;
   }
   
   public String getMenuItemNumber(){
      return super.getMenuItemNumber();
   }
   
}