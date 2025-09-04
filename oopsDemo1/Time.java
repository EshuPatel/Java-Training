package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:43:14 PM
 * Project :CoreJava
 * 
 * 
 * Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented by1 & sec -60,,
 *   if min> 60  ... hrs should be incremented by1 & min -60
*/

public class Time {
	private int hrs, min, sec,day;

	
	
//	gen consr
	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
		this.day=day;
	}
	
	
//	add method
	public void add(Time t1) {
		this.sec+=t1.sec;
		this.min+=t1.min;
		this.hrs+= t1.hrs;
		
		if(this.sec>60) {
			this.sec= this.sec-60;
			this.min++ ;
		}
		
		if(this.min>60) {
			this.min= this.min-60;
			this.hrs++ ;
		}
		
		if (this.hrs>24){
			this.hrs=this.hrs-24;
			this.day++;
			
		}
	}
	
	
//	display time
	public void display() {
		System.out.println("time is: "+this.day+": "+ this.hrs+ " : "+ this.min+ " : "+ this.sec);
	}
	
}
