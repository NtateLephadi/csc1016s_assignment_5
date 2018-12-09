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
      
      int dx = Math.abs ( super.x - x1 ) ;
      int dy = Math.abs ( super.y - y1 ) ;      
      int offset = 0 ;  
      
      if ( dx == 0 ) 
      {
         if ( super.y <= y1 )
         {
            for ( int i = super.y; i <= y1; i ++ )
            {
               matrix [i][super.x] = '*' ;
            }
         }
         
         if ( super.y > y1 )
         {
            for ( int i = y1; i <= super.y; i ++ )
            {
               matrix [i][super.x] = '*' ;
            }
         }
      }
        
      if ( dy == 0 )
      {
         if ( super.x <= x1 )
         {
            for ( int i = super.x; i <= x1; i ++ )
            {
               matrix [super.y][i] = '*' ;
            }
         }
         if ( super.x > x1 )
         {
            for ( int i = x1; i <= super.x; i ++ )
            {
               matrix [super.y][i] = '*' ;
            }
         }
      }      
   
            
      if (dy != 0 )
      {
         double m1 = ( x1 - super.x ) / ( y1 - super.y ) ;
      }
      
      if ( dx != 0 )
      {
         double m = ( y1 - super.y ) / ( x1 - super.x ) ;
      
         if ( m == 1 || m == -1 )
         {
            if ( m == 1 )
            {
               if ( super.x <= x1 && super.y <= y1 )
               {
                  for ( int i = 0; i <= dx; i ++ )
                  {
                     matrix [super.y + i][super.x + i] = '*' ; 
                  }
               }
               if ( super.x > x1 && super.y > y1 )
               {
                  for ( int i = 0; i <= dx; i ++ )
                  {
                     matrix [super.y - i][super.x + i] = '*' ;
                  }
               }
            }
         
            if ( m == -1 )
            {
               if ( super.x <= x1 && super.y >= y1 )
               {
                  for ( int i = 0; i <= dx; i ++ )
                  {
                     matrix [super.y - i][super.x + i] = '*' ; 
                  }
               }
               if ( super.x >= x1 && super.y <= y1 )
               {
                  for ( int i = 0; i <= dx; i ++ )
                  {
                     matrix [super.y + i][super.x - i] = '*' ;
                  }
               }
            } 
         }
      
      
         if ( m < 1 && m > 0 )
         {
            int y = super.y ;
            double epsilon = 0 ;
            for ( int i = super.x; i <= x1; i ++ )
            {
               matrix [y][i] = '*' ;
               epsilon += Math.abs ( m ) ;
               while ( epsilon >= 0.5 )
               {
                  matrix [y][i] = '*' ;
                  y += dy ;
                  epsilon -- ;
               }
            }
         }
      }
   } 
}
