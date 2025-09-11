package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :9:48:50 AM
 * Project :CoreJava
*/

public interface Shape {
	
	 //implicitly public, static and final
    public String LABEL="Shape";
     
    //interface methods are implicitly abstract and public
    void draw();
     
   public abstract double getArea();
}
