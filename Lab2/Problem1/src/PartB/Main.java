package PartB;

public class Main {
     public static void main(String[] args) {
         Book book1 = new Book("Name", "Author", 2008, 416);

         System.out.println("Book details: " + book1.toString());

         System.out.println("Title: " + book1.getTitle());
         System.out.println("Author: " + book1.getAuthor());
         System.out.println("Publication year: " + book1.getPublicationYear());
         System.out.println("Number of pages: " + book1.getNumOfPages());
     }

}
