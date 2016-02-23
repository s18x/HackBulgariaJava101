// Fig. 17.3: List.java
// ListNode and List class definitions.
package homework08;

import java.util.LinkedList;

// class to represent one node in a list
class ListNode
{
   // package access members; List can access these directly
   AccountRecord data; // data for this node
   ListNode nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode( AccountRecord object ) 
   { 
      this( object, null ); 
   } // end ListNode one-argument constructor 

   // constructor creates ListNode that refers to 
   // Object and to next ListNode
   ListNode( AccountRecord object, ListNode node )
   {
      data = new AccountRecord(object);    
      nextNode = node;  
   } // end ListNode two-argument constructor

   // return reference to data in node
   Object getObject() 
   { 
      return data; // return Object in this node
   } // end method getObject

   // return reference to next node in list
   ListNode getNext() 
   { 
      return nextNode; // get next node
   } // end method getNext
} // end class ListNode

// class List definition
public class List 
{
   private ListNode firstNode;
   private ListNode lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty List with "list" as the name
   public List() 
   { 
      this( "list" ); 
   } // end List no-argument constructor

   List(List list) {
	   this.firstNode = list.firstNode;
	   this.lastNode = list.lastNode;
	   this.name = list.name;
   }

   public List(AccountRecord[] arrAccounts) {
	   LinkedList<AccountRecord> linkedlist = new LinkedList<>();
	   for (int i = 0; i < arrAccounts.length; i++) {
		   linkedlist.add(arrAccounts[i]);
	   }
   }

   // constructor creates an empty List with a name
   public List( String listName )
   {
      name = listName;
      firstNode = lastNode = null;
   } // end List one-argument constructor

   // insert Object at front of List
   public void insertAtFront( AccountRecord insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode( insertItem );
      else // firstNode refers to new node
         firstNode = new ListNode( insertItem, firstNode );
   } // end method insertAtFront

   // insert Object at end of List
   public void insertAtBack( AccountRecord insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same Object
         firstNode = lastNode = new ListNode( insertItem );
      else // lastNode's nextNode refers to new node
         lastNode = lastNode.nextNode = new ListNode( insertItem );
   } // end method insertAtBack

   // remove first node from List
   public Object removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      Object removedItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode 
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from List
   public Object removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      Object removedItem = lastNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else // locate new last node
      { 
         ListNode current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; // current is new lastNode
         current.nextNode = null;
      } // end else

      return removedItem; // return removed node data
   } // end method removeFromBack

   // determine whether list is empty
   public boolean isEmpty()
   { 
      return firstNode == null; // return true if list is empty
   } // end method isEmpty

   // output list contents
   public void print()
   {
      if ( isEmpty() ) 
      {
         System.out.printf( "Empty %s\n", name );
         return;
      } // end if

      System.out.printf( "The %s is: ", name );
      ListNode current = firstNode;

      // while not at end of list, output current node's data
      while ( current != null ) 
      {
         System.out.printf( "%s ", current.data );
         current = current.nextNode;
      } // end while

      System.out.println( "\n" );
   } // end method print

   private class ListIterator implements Iterator {
	   private ListNode current;

	   public ListIterator() {
		   this.current = firstNode;
	   }

	   public ListNode current() {
		   ListNode temp = current;
		   return temp;
	   }

	   public boolean end() {
		   if (current.equals(lastNode)) {
			return true;
		}
		   return false;
	   }

	   public boolean hasNext() {
		   if (current.equals(lastNode)) {
			return true;
		}
		   return false;
	   }

	   public void next() {
		   if (current.equals(lastNode)) {
			   System.out.println("NO");
			   return;
		   }
		   else {
			   //current = new ListNode();
		   }
	   }

   }

} // end class List
