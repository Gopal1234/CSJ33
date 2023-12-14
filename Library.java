package enumpack;
 import java.util.*;
     public class Library
    {
         private ArrayList<Book> bookList= new ArrayList<Book>();
     
    	public ArrayList<Book> getBookList() {
    		return bookList;
    	}
    
    	public void setBookList(ArrayList<Book> bookList) {
    		this.bookList = bookList;
    	}
    	public void addBook(Book bobj)
    	{
    	    bookList.add(bobj);
    	}
    	public boolean isEmpty()
    	{
    	    if(bookList.isEmpty())
    	    return true;
    	    return false;
    	}
    	public ArrayList<Book> viewAllBooks()
    	{
    	    return bookList;
    	}
    	public ArrayList<Book> viewBooksByAuthor(String author)
    	{
    	    ArrayList<Book> b1=new ArrayList<Book>();
    	    for(int i=0;i<bookList.size();i++)
    	    {
    	        if(bookList.get(i).getAuthor().equals(author))
    	        b1.add(bookList.get(i));
    	        
    	    }
    	    return b1;
    	}
    	public int countnoofbook(String bname)
    	{ int count=0;
    	    for(int i=0;i<bookList.size();i++)
    	    {
    	        if(bookList.get(i).getBookName().equals(bname))
    	        count++;
    	        
   	    }
    	    return count;
    	}
    	
        
    }