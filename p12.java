import java.util.*;
class p12 extends Thread{
	int i;
	Scanner in = new Scanner(System.in);
	public void run(){
		fun();
	}
	void fun(){
		i = in.nextInt();
	}
}
class other extends Thread{
	public void run(){
		meth();
	}
	void meth(){
		for(int i = 0; i<1000; i++){
			System.out.println("value of i = "+i);
		}
	}
}
class Main{
	public static void main(String[] args) {
		p12 obj = new p12();
		other obj2 = new other();
		obj.start();
		obj2.start();
	}
}