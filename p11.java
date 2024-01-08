class p11{
	void fun(int... a){ // (...)  variable length argument
		System.out.println("first fun");
		System.out.println("length of array = "+a.length);
		for(int val : a){
			System.out.println(val);
		}
		System.out.println("  ");
	}
	void fun(String a, int... arr){
		System.out.println("second fun");
		System.out.println("value of a = "+a);
		for(int val : arr){
			System.out.println(val);
		}
		System.out.println("  ");
	}
	void fun(boolean... b){
		System.out.println("third fun");
		System.out.println("length of array = "+b.length);
		for(boolean val : b){
			System.out.println(val);
		}
		System.out.println("  ");
	}
}
class Main{
	public static void main(String[] args) {
		p11 obj = new p11();
		obj.fun(2,3,4,5,6,7,7);
		obj.fun(12,12,44,66,888,865);
		obj.fun(121,232,454,5656,6767);
		obj.fun(true,false,false,false,true);
		obj.fun(2,32);
		obj.fun("harsh",74837,347,473,34893);
	}
}