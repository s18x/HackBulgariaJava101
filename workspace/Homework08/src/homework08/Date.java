// Date.java 
// Date class declaration.
package  homework08;

import java.util.Calendar;

public class Date 
{
   private int month; // 1-12
   private int day;   // 1-31 based on month
   private int year;  // any year

   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // validate month
      year = theYear; // could validate year
      day = checkDay( theDay ); // validate day

     
   } // end Date constructor
   
   public Date(  )
   {
      this( 1,1,2000);
   } // end Date constructor
   
   public Date( Date d )
   {
      this(d.month,d.day,d.year);
   } // end Date constructor
   public void setMonth(int m){
       month = checkMonth( m ); // validate month
   }
    public int getMonth(){     
     return month;  
   }  
   
   public void setDay(int m){
       day = checkDay( m ); // validate day
   }
    
   public int getDay(){     
     return day;  
   }  
    
      public void setYear(int y){
       year = (y>= 2000)? y: 2000 ; // validate year
   }
    
   public int getYear(){     
     return year;  
   }  
   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid 
      { 
         System.out.printf( 
            "Invalid month (%d) set to 1.", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int daysPerMonth[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
   
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
   
      System.out.printf( "Invalid day (%d) set to 1.", testDay );
      return 1;  // maintain object in consistent state
   } // end method checkDay
   
   // return a String of the form month/day/year
   public String toString()
   { 
      return String.format( "%02d/%02d/%d", month, day, year ); 
   } // end method toString
} // end class Date

