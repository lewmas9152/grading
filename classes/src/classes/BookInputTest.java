package classes;
import java.util.Scanner;
public class BookInputTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Book book = new Book();
		System.out.println("Please enter the title of the book");
		book.title = input.nextLine();
		System.out.println("Please enter the title of the book");
		book.author = input.nextLine();
		System.out.println("Please enter the title of the book");
		book.numberOfPages = input.nextInt();
		System.out.println("The book title is: " + book.title);
		System.out.println("The book author is: " + book.author);
		System.out.println("The book has: " + book.numberOfPages + " pages");

	}

}
