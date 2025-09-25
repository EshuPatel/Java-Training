package miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :11:44:17 AM
 * Project :Advanced Java
*/



public class Student {
	public List<String> listOfName()
    {
        ArrayList<String> listOfName = new ArrayList<>();
        listOfName.add("John");
        listOfName.add("Ram");
        listOfName.add("Mary");
        
        return listOfName;
    }

}
class Record extends Student{
	//CoVariant return type -subtype of super type
	@Override
	public ArrayList<String> listOfName() {
		ArrayList<String> listOfName = new ArrayList<String>();
        listOfName.add("Java");
        listOfName.add("Gosling");
        listOfName.add("Covariant");
    
        return listOfName;
	}
	 // This will cause a compilation error because String is not a subtype of List<String>
	public String listOfName1() {
      return "Invalid Return Type";
  }
}
