
public class TEST {

    public static void main(String[] args) {
    
    // Print out the name of the main thread
    
        System.out.println("Main thread name: " + Thread.currentThread().getName());
    
    // Your program logic goes here...
    
    // Simulate some work
    
    for (int i = 0; i < 5; i++) {
    
        System.out.println("Working in the main thread...");
    
    try {
        Thread.sleep(1000); // Sleep for 1 second

    } catch (InterruptedException e) {
    e.printStackTrace(); } }
    
    // End of program
    
    System.out.println("Main thread exiting..."); } }