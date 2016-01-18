package homework09;

public class IntList extends List {

	private List intList;
	
	ListNode curr = intList.
	
	public int totalList() {
		deph++;
		if(deph == 0){
			curr  = firstNode;
		}
		if(curr == null){
			deph--;
			return 0;			
		}
		else {
			ListNode temp = curr;
			curr = curr.nextNode;
			int count = 1 + size();
			curr = temp;
			deph--;
			return count;
		}
	}
}
