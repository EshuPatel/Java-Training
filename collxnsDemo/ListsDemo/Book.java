package collxnsDemo.listDemo;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :11:35:42 AM
 * Project :CoreJava
*/

public class Book {
	//attributes
	private int id; 
	private String name, author, publisher;
	private int quality;
	
	
	//constructors
	public Book(int id, String name, String author, String publisher, int quality) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quality = quality;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getQuality() {
		return quality;
	}
	
	
	
}
