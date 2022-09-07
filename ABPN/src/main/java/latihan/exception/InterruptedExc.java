package latihan.exception;

public class InterruptedExc extends Thread{
	public static void main(String[] args)
            throws InterruptedException
    {
		InterruptedExc thread = new InterruptedExc();
        thread.start();
        
        Thread.sleep(400);
		thread.interrupt();
		InterruptedExc threads = new InterruptedExc();
//		threads.start();
        System.out.println("Main thread execution completes");
    }
	
	public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread Dijalankan");
                Thread.sleep(100);
                System.out.println("Loading.....");
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}
