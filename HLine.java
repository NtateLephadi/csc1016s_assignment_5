// Tumelo Lephadi
// Program that makes a Horizontal line.
// 31 August 2015

class HLine extends VectorObject
{
   private int id, x, y, x_length ;
   
   public HLine ( int id, int x, int y, int x_length )
   {
      super ( id, x, y ) ;
      this.x_length = x_length ;
   } 
  
   public void draw ( char [][] matrix )
   {      
      for ( int i = 0; i < x_length; i++ )
      {
         matrix [super.y][i + super.x] = '*' ;
      }
   }
}