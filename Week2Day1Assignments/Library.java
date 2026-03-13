package org.amazon.week2day1assignments;

public class Library {

public String addBook(String bookTitle){
System.out.println("Book added Suscessfully");
return bookTitle;

    }

public void  issueBook(){
System.out.println("Book issued susceesfully");


}
public static void main(String[] args) {
Library obj1=new Library();
String returnBook=obj1.addBook("Davinci code");
System.out.println(returnBook);
obj1.issueBook();
}


}
