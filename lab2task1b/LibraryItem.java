package lab2task1b;

public abstract class LibraryItem {
	protected String title;
	protected String author;
	protected int publicationYear;
	
	public LibraryItem() {
		
	}
	
	public LibraryItem(String title, String author, int publicationYear) {
		this.author = author;
		this.title = title;
		this.publicationYear = publicationYear;
	}
	public abstract String getTitle();
	
	public abstract String getAuthor();
	
	public abstract int getPublicationYear();
	
	public abstract String getInfo();
	public String toString() {
		return "Author: " + author + " Title: " + title + " Publication year " + publicationYear;
	}
}
