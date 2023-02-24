public class Book {

    static String name;

    static Author author;

    static double price;

    static int quantity;


    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }


    public static String getName() {
        return name;

    }

    public static Author getAuthor() {
        return author;
    }



    public static double getPrice() {
        return price;
    }


    public static int getQty() {
        return quantity;
    }


    public void setQty(int A) {
        Book.quantity = A;
    }

    public void setPrice(double A) {
        Book.price = A;
    }

    public String toString() {
        return ("'" + Book.name + "' " + "by " + Book.author.name + " (" + Book.author.gender + ")" + " at " + Book.author.email);
    }

}