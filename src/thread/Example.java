package thread;
class Thread implements Runnable{
	public void run()
	{
		System.out.println("I love Nature...");
	}
}
public class Example {

	public static void main(String[] args) {
	Thread a1 = new Thread();
	Thread t = new thread (a1);
    t.start();
	System.out.println("Hello!!");

	}

}
