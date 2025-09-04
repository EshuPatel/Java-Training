package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :12:13:04 PM
 * Project :CoreJava
*/

public class AggregationDemo2 {
	public static void main(String[] args) {

		Author author = new Author("John", 42, "USA");

		Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");

		Book b = new Book  ("Java for Begginers", 800, author, publisher);

		b.display();
	}
}
