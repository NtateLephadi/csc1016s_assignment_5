// Tumelo Lephadi
// Program that makes a Vertical line.
// 31 August 2015

class VLine extends VectorObject
{
   private int id, x, y, y_length ;
   
   public VLine ( int id, int x, int y, int y_length )
   {
      super ( id, x, y ) ;
      this.y_length = y_length ;
   } 
  
   public void draw ( char [][] matrix )
   {
      for (int i = 0; i < y_length; i++ )
      {
         matrix [i + super.y][super.x] = '*' ;
      }   
   }
}