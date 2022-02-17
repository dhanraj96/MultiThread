package multithread; 
class A extends Thread
{
	public void run()
	{
		System.out.println("current ID of A:" + Thread.currentThread().getId());
	
		
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("current ID of B:" + Thread.currentThread().getId());
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("current ID of C:" + Thread.currentThread().getId());
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
		

	}

}
