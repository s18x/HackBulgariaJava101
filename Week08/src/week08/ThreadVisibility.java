package week08;

public class ThreadVisibility extends Thread {

	 volatile boolean keepRunning = true;

	 public void setToFalse() {
		 keepRunning = false;
	 }
	
	 public boolean getValue() {
		 return keepRunning;
	 }

	 public void run() {
		 while (keepRunning) {
			 System.err.println(keepRunning);
		 }
		 System.out.println("I'm done.");
	 }
}
