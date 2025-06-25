package Tasks.Task_Constructor;

public class Task_Book {
    public static void main(String[] args) {
        book b1=new book("The Girl in the train","Chetan Bhagat",500);
        book b2=new book("Rich Dad, Poor Dad", "Robert Kiyosaki",600);

        b1.display();
        System.out.println("--------------------------");
        b2.display();

    }
}

class book{
    String title;
    String author;
    int price;

    public book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Book title: " +title);
        System.out.println("Book author: " +author);
        System.out.println("Book price: " +price);
    }
}