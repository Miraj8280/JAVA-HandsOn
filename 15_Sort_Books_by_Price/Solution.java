import java.util.Scanner;
import java.util.Arrays;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return id + " " + title + " " + author + " " + price;
    }
}

public class Solution {
    private static Book[] sortBooksByPrice(Book[] books) {
        Arrays.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
        return books;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];
        
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            
            books[i] = new Book(id, title, author, price);
        }
        
        Book[] sortedBooks = sortBooksByPrice(books);
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
        
        sc.close();
    }
}