/**
 * 
 */
package com.book;

import com.book.exception.*;

/**
 * @author Soundarya V L
 *
 */
public class Book extends Exception {

	/**
	 * @param args
	 */
	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String title, String category, String author, float price) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		try {
			String S = "Science";
			String F ="Fiction";
			String T = "Technology";
			String O ="Others";
			try {
				if(category.equals(S)|| category.endsWith(F)|| category.equals(T)|| category.equals(O)) {
					this.category = category;
				}
				else {
					String msg = "Category either be Fiction or Technology or Others";
					throw new InvalidBookException(msg);
				}
			}
			catch(InvalidBookException msg) {
				System.out.println(msg);
			}
			try {
				if(price<0) {
					String msg= "price should be in positive";
					throw new InvalidBookException(msg);
				}
			}
			catch(InvalidBookException msg) {
				System.out.println(msg);
			}
			try {
				char C = bookID.charAt(0);
				if((C!= 'B')&&(bookID.length()!=4)) {
					String msg="BookID must start with B and length must be of 4";
					throw new InvalidBookException(msg);
				}
			}
			catch(InvalidBookException msg) {
				System.out.println(msg);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

		public String getbookID() {
			return bookID;
		}
		
		public String gettitle() {
			return title;
		}

		public String getcategory() {
			return category;
		}

		public String getauthor() {
			return author;
		}

		public float getprice() {
			return price;
		}

		public void setbookID(String modID) {
			// TODO Auto-generated method stub
			
		}

		public void settitle(String modTi) {
			// TODO Auto-generated method stub
			
		}

		public void setcategory(String modC) {
			// TODO Auto-generated method stub
			
		}

		public void setauthor(String modA) {
			// TODO Auto-generated method stub
			
		}

		public void setprice(float modP) {
			// TODO Auto-generated method stub
			
		}



	}



