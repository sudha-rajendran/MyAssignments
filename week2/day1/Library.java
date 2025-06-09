package week2.day1;

public class Library {
	
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully: "+bookTitle);
		return bookTitle;
	}

	public void isssueBook() {
		System.out.println("Book issued sccessfully");
		
		
	}
	public static void main(String[] args) {
		Library bookOptions=new Library();
		bookOptions.addBook("bookTitle");
		bookOptions.isssueBook();

	}

}
