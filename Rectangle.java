// Tumelo Lephadi
// Program that makes a Rectangle.
// 31 August 2015

class Rectangle extends VectorObject
{
   private int id, x, y, x_length, y_length ;
   
   public Rectangle ( int id, int x, int y, int x_length, int y_length )
   {
      super ( id, x, y ) ;
      this.x_length = x_length ;
      this.y_length = y_length ;      
   } 
 
   public void draw ( char [][] matrix )
   {
      for ( int i = 0; i < y_length; i++ )
      {
         for ( int j = 0; j < x_length; j++ )
         {
            matrix [i + super.y][j + super.x] = '*' ;
         }
      }

   }
}