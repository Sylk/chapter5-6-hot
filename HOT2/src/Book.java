
public class Book {

	private String name, publishDate, author;
	
	public Book(String nametitle, String pub, String auth){
		name = nametitle;
		publishDate = pub;
		author = auth;
	}
	
	public Book(Book object2){
		name = object2.name;
		publishDate = object2.publishDate;
		author = object2.author;
	}
	
	public void set (String nametitle, String pub, String auth){
		name = nametitle;
		publishDate = pub;
		author = auth;
	}
	
	
	public String toString(){
		String str = "Title >> "+name+"\nAuthor >> "+author+"\nPublisher >> "+publishDate;
		return str;
	}
}
