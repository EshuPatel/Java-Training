package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:27:16 PM
 * Project :CoreJava
*/

class Faculty {
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}


public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty[] obj = new Faculty[3];
		
		for(int i=0; i<3; i++) {
			obj[i]= new Faculty();
		}
		
//		assign data to Faculty objects
		obj[0].setData(11, "A");
		obj[1].setData(12, "B");
		obj[2].setData(13, "C");

		
//		display obj data
		System.out.println("*********** Faculty Details *************");
		for(int i=0; i<3; i++) {
			obj[i].showData();
		}

	}

}