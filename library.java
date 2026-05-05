class library {
     Storage = new Book[5];
     int totalBooks = 0;
     void addBook(Book b){
         if (totalBooks <5){
             Storage[totalBooks] = b;
             totalBooks++;
             System.out.println("Sahi hai! Book save ho gayi");
         } else {
             System.out.println("library full hai! jagah nahi hai:");
         }
     }
     void showAllBooks(){
         System.out.println("\n----- Aapki library ki list---");
         for(int i = 0; i< totalBooks; i++){
             Storage[i].display();
         }
     }
}