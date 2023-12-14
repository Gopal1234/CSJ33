package enumpack;
import java.util.*;
     public class Main 
    {
         public static void main (String[] args) {
             Scanner sc=new Scanner(System.in);
             Library lib=new Library();
            int choice=0;
             int isbn;
             String bookname,authorname;
            
            
            while(true)
            {
       System.out.println("1.Add Book");
      System.out.println("2.Display all book details");
      System.out.println("3.Search Book by author");
   System.out.println("4.Count number of books - by book name");
     System.out.println("5.Exit");
     System.out.println("Enter your choice:");
      choice=sc.nextInt();
             if(choice==5)
             break;
          switch(choice)
                {
         case 1:System.out.println("Enter the isbn no:");
          isbn=sc.nextInt();
            System.out.println("Enter the book name:");
          bookname=sc.next();
         System.out.println("Enter the author name:");
          authorname=sc.next();
          Book b1=new Book();
          b1.setIsbnno(isbn);
          b1.setBookName(bookname);
         b1.setAuthor(authorname);
          lib.addBook(b1);
           break;
                case 2:
      ArrayList<Book> b2=new ArrayList<Book>();
      b2=lib.viewAllBooks();
       for(int i=0;i<b2.size();i++)
                {
  System.out.println("ISBN no: "+b2.get(i).getIsbnno());
 System.out.println("Book name: "+b2.get(i).getBookName());
 System.out.println("Author name: "+b2.get(i).getAuthor());
                    }
           break;
 case 3:System.out.println("Enter the author name:");
 authorname=sc.next();
ArrayList<Book> b3=lib.viewBooksByAuthor(authorname);
 for(int i=0;i<b3.size();i++)
   {
System.out.println("ISBN no: "+b3.get(i).getIsbnno());
System.out.println("Book name: "+b3.get(i).getBookName());
System.out.println("Author name: "+b3.get(i).getAuthor());
   }
                break;
         case 4:System.out.println("Enter the book name:");
      bookname=sc.next();
      System.out.println(lib.countnoofbook(bookname));
          break;
                
                    
                }
              
            }
        }
    }