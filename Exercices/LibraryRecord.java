

public class LibraryRecord  {
	
	public LibraryRecord ( String name, int catalogId){
		bookTitle = name;
		bookCatalogNmber = catalogId;
	}
	
	public String getName(){
		return bookTitle;
	}

	public int getId(){
		return bookCatalogNmber;
	}
	
	
	public void setAuthor (String author){
		bookAuthor = author;
	}
	
	public String getAuthor(){
		return bookAuthor;
	}
	
	
	public void setPublisher (String publisher){
		bookPublisher = publisher;
	}
	
	public String getPublisher(){
		return bookPublisher;
	}
	
	
	public void setYear (int year){
		bookYearOfProduction = year;
	}
	
	public int getYear(){
		return bookYearOfProduction;
	}
	
	
	public void setbookCirculation( boolean flag){
		bookCirculation = flag;
	}
	
	public boolean isbookCirculation(){
		return bookCirculation;
	}
	
	public String toString(){
		return bookTitle + "Author: " + bookAuthor + "#" + bookCatalogNmber + "Publisher: " + bookPublisher + "Year: " + bookYearOfProduction;
	}

	private String bookTitle;
	private String bookAuthor;
	private int bookCatalogNmber;
	private String bookPublisher;
	private int bookYearOfProduction;
	private boolean bookCirculation;
	
}
	
/* the title 
the autor 
the Library of Congress catalog number
the publisher
the year of pubication
whether the book is circulating of noncirculating

*/