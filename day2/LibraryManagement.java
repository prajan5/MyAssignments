package week1.day2;

public class LibraryManagement {
	
	public static void main(String[] args)
	{
		Library lbm = new Library();
		//way1 for return type
		String book = lbm.addBook("Dream can come True");
		System.out.println(book);
		//Way 2 for return type 
		System.out.println(lbm.addBook("Dream can come True"));
		//Calling Void function
		lbm.issueBook();
	}

}
