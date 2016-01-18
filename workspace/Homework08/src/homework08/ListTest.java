// Fig. 17.5: ListTest.java
// ListTest class to demonstrate List capabilities.
package homework08;


public class ListTest 
{
   public static void main( String args[] )
   {
      List list = new List(); // create the List container

      // insert integers in list
      list.insertAtFront( new AccountRecord(1,"Ivan Ivanov", new Date(), 0.00) );
      list.print();
      list.insertAtFront( new AccountRecord(2,"Ivan Ivanovich", new Date(), 10.00) );
      list.print();
      list.insertAtBack( new AccountRecord(3,"Ivan Petrov", new Date(), 20.00) );
      list.print();
      list.insertAtBack( new AccountRecord(4,"Ivan Petrovich", new Date(), 30.00) );
      list.print();

      // remove objects from list; print after each removal
      try 
      { 
         Object removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class ListTest

