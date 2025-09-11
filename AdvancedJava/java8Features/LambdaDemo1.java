package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :12:55:06 PM
 * Project :Advanced Java
*/
@FunctionalInterface
interface MyFI{
	public String sayHello();	 //by default abstract
	
	
//	public String sayBello();
}



public class LambdaDemo1 {

	public static void main(String[] args) {
		MyFI m1= () ->{return "Hello";};
		
		MyFI m2= () -> {return "Java 8";};
		
		MyFI m3= () -> {return "Coforge";};
		
		MyFI m4= () -> {return "Coforge"+ 45+12+ "Technologies";};
		
		System.out.println(m1.sayHello());
		System.out.println(m2.sayHello());
		System.out.println(m3.sayHello());
		System.out.println(m4.sayHello());
		
	}

}
