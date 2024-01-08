class Demo1 { 
	static int a, b;
	 public static void main(String[] args) { 
	 	System.out.println("Using Demo1 class Main with int arg");
	 	 a =30;
	 	  b =40;
	 	   System.out.println("Product is: "+a*b);
	 	   
	 	} 
 	public static void main(String[] args) { 
 		System.out.println("Using Demo1 class Main with string arg");
 		 a =10; b =20; 
 		 System.out.println("Product is: "+a*b);
 		 for(String str : args){
 		 	System.out.println(str);
 		 }
 		
 	}
}