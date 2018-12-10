// Tumelo Lephadi
// Program that makes a pythagoras line.
// 31 August 2015

class PtLine extends VectorObject
{
   private int id, x, y, x1, y1 ;

   public PtLine ( int id, int x, int y, int x1, int y1 )
   {
      super ( id, x, y ) ;
      this.x1 = x1 ;
      this.y1 = y1 ;
   }
   public void draw ( char [][] matrix ){

      int dx = Math.abs ( x1 - super.x ) ;
      int dy = Math.abs ( y1 - super.y ) ;
      int offset = Math.abs(dx/dy) ;
      double error = 0;
      for (int i = super.x; i < x1 + 1; i++){
        matrix [super.y][super.x] = '*' ;
        error += offset;
        if (error >= 0.5){
          super.y = super.y + 1;
          error =- 1;
        }
      }
   }
}
