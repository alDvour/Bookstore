/**
 * 
 */
package com.bookutil;


import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

/**
 * @author Soundarya V L
 *
 */
public class BookUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bs = new BookStore();
		Scanner sc = new Scanner(System.in);
		int option =0;
		while(option!=8) {
			System.out.println(" 1.Add\n 2.Modify\n 3.Delete\n 4.Display All\n 5.Display specific book\n 6.Search book by title\n 7.Search by author\n 8.Exit");
			option= sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:System.out.println("Enter Book Id:");
			String bookID = sc.nextLine();
			System.out.println("Enter Book Title:");
			String title = sc.nextLine();
			System.out.println("Enter Book category:");
			String category = sc.nextLine();
			System.out.println("Enter Book Author:");
			String author = sc.nextLine();
			System.out.println("Enter Book Price:");
			float price = sc.nextFloat();
			Book b = new Book(bookID,title,category,author,price);
			bs.addBook(b);
			
			break;
			case 2:System.out.println("Enter Book ID to be modified:");
			String bookID1 = sc.nextLine();
			bs.modifyBook(bookID1);
			break;
			case 3:System.out.println("Enter Book ID to be removed:");
			String bookID3 = sc.nextLine();
			bs.delete(bookID3);
			break;
			case 4:bs.displayAll();
				 break;
			case 5:System.out.println("Enter Book ID to be displayed:");
			String bookID2 = sc.nextLine();
			bs.displaySpecific(bookID2);
			break;
			case 6:System.out.println("Enter title of the book:");
			String title1 = sc.nextLine();
			bs.searchByTitle(title1);
			break;
			case 7:System.out.println("Enter author of book:");
			String author1 = sc.nextLine();
			bs.searchByAuthor(author1);
			break;
 			case 8:return;
	}

}
}
}