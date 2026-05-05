import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Library lib = new Library();
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("\n. AddBook\n2.Showlibrary\n3.Exit");
            System.out.print("kya karna chahte ho?(1/2/3)");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                System.out.println("Book ka naam dalo");
                String name = sc.nextLine();
                System.out.println("Author ka naam dalo:");
                String auth = sc.nextLine();
                Book nayiBook = new Book (name,auth);
                lib.addBook(nayiBook);
            } else if (choice ==2){
                lib.showAllBooks();
            } else if (choice ==3){
                System.out.println("Chalo Bhai milte hai!");
                break;
            }
        }
    }
}