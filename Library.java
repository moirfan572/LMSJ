import java.util.ArrayList;
public class Library {
     ArrayList<Book> Storage = new ArrayList<>();
    int totalBooks = 0;
    void addBook(Book b){
        if (totalBooks <5){
            Storage.add(b);
            totalBooks++;
            System.out.println("Sahi hai! Book save ho gayi");
        } else {
            System.out.println("library full hai! jagah nahi hai:");
        }
    }
    void showAllBooks(){
        System.out.println("\n----- Aapki library ki list---");
        for(int i = 0; i< Storage.size(); i++){
            Storage.get(i).display();
        }
    }
}