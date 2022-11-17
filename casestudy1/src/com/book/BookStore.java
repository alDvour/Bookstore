/**
 * 
 */
package com.book;
import com.book.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;

/**
 * @author Soundarya V L
 *
 */
public class BookStore {

	/**
	 * @param args
	 */
	ArrayList<Book> books;
	Scanner sc = new Scanner(System.in);
	public BookStore() {
		books = new ArrayList<Book>();
	}

	public void addBook(Book bookToAdd) {
		books.add(bookToAdd);
		System.out.println("Book added successfully!!!");
	}

	public ArrayList<Book> searchByTitle(String title1) {

		for (Book x: books) {
			String bookID = x.getbookID();
			String title =  x.gettitle(); 
			String category = x.getcategory();
			String author = x.getauthor();
			float price= x.getprice();
			if (title.equals(title)) {
				System.out.println("\nBook ID:" + bookID+ "\nTitle:" + title + "\nCategory:" + category + "\nAuthor:" +author + "\nPrice:" + price);

			}
		}
		return null;
	}

	public ArrayList<Book> searchByAuthor(String author) {

		for (Book x: books) {
			String bookID = x.getbookID();
			String title =  x.gettitle(); 
			String category = x.getcategory();
			String author1 = x.getauthor();
			float price= x.getprice();
			if (author1.equals(author)) {
				System.out.println("\nBook ID:" + bookID+ "\nTitle:" + title + "\nCategory:" + category + "\nAuthor:" +author1 + "\nPrice:" + price);

			}
		}
		return null;
	}

	public void displayAll() {
		for(Book x:books)
			System.out.println("\nBook ID:" + x.getbookID()+ "\nTitle:" + x.gettitle() + "\nCategory:" + x.getcategory() + "\nAuthor:" + x.getauthor() + "\nPrice:" + x.getprice());
	}

	public void modifyBook(String bookID) {
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			Book st = itr.next();
			String bo = st.getbookID();
			if(bo.equals(bookID)) {
				System.out.println("Enter field to be modified ");
				String field = sc.nextLine();
				switch(field) {
				case "bookID":System.out.println("Enter  modified ID:");
				String modID = sc.nextLine();
				st.setbookID(modID);
				break;
				case "title":System.out.println("Enter  modified title:");
				String modTi = sc.nextLine();
				st.settitle(modTi);
				break;
				case "category":System.out.println("Enter  modified ID:");
				String modC = sc.nextLine();
				st.setcategory(modC);
				break;
				case "author":System.out.println("Enter  modified ID:");
				String modA = sc.nextLine();
				st.setauthor(modA);
				break;
				case "price":System.out.println("Enter  modified ID:");
				float modP = sc.nextFloat();
				st.setprice(modP);
				break;
				}
			}

		}
	}
		public void displaySpecific(String bookID2)
		{
			for (Book x: books) {
				String bookID = x.getbookID();
				String title =  x.gettitle(); 
				String category = x.getcategory();
				String author = x.getauthor();
				float price= x.getprice();
				if (bookID2.equals(bookID)) {
					System.out.println("\nBook ID:" + bookID+ "\nTitle:" + title + "\nCategory:" + category + "\nAuthor:" +author + "\nPrice:" + price);

				}
			}
			return;
		}
		public void delete(String bookID3) {
			Iterator<Book> itr = books.iterator();
			while(itr.hasNext()) {
				Book st = itr.next();
				String bo = st.getbookID();
				if(bo.equals(bookID3)) {
					itr.remove();
				}
			}

		}

	}
