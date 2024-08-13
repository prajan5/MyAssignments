package week1.day2;

public class Library {
	public String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook()
	{
		System.out.println("Book issued successfully");
		
	}
	
	
	public static void main(String[] args)
	{
		
		Library Lib = new Library();
		//Way1 for return type
		String book = Lib.addBook("The Angel");
		System.out.println(book);
		//Way1 for return type
		System.out.println(Lib.addBook("The Angel"));
		
		Lib.issueBook();
	}

}
