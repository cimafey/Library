import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) {

        books.add(new Book("Хроники нарнии", "Клайв Стэплс Льюис", 734, "10.06.2005"));
        books.add(new Book("Хроники нарнии 2", "Клайв Стэплс Льюис", 526, "19.08.2009"));

        users.add(new User("Chuduk", "Mila", "20.02.2008", books.get(0)));
        users.add(new User("Prystauka", "Timothy", "19.08.2006", books.get(1)));

        while (true){
            System.out.println("1. Show books\n2.Show users\n3.Add book\n4.Add user\n0.Exit");
            Scanner scan = new Scanner(System.in);
            int select = scan.nextInt();
            switch (select){
                case 1:{
                    for (Book el : books){
                        System.out.println(el);
                        System.out.println();
                    }
                    break;
                }
                case 2:{
                    for (User el : users){
                        System.out.println(el);
                        System.out.println();
                    }
                    break;
                }
                case 3:{
                    scan = new Scanner(System.in);
                    System.out.println("Enter title ");
                    String title = scan.nextLine();
                    System.out.println("Enter author ");
                    String author = scan.nextLine();
                    System.out.println("Enter current date ");
                    String date = scan.nextLine();
                    System.out.println("Enter amount of pages ");
                    int pages = scan.nextInt();
                    addBook(title, author, pages, date);
                    break;
                }
                case 4:{
                    scan = new Scanner(System.in);
                    System.out.println("Enter second name ");
                    String secondName = scan.nextLine();
                    System.out.println("Enter first name ");
                    String firstName = scan.nextLine();
                    System.out.println("Enter date of birth ");
                    String dateOfBirth = scan.nextLine();
                    System.out.println("Enter number of book ");
                    int num = scan.nextInt();
                    addUser(secondName, firstName, dateOfBirth, books.get(num - 1));
                    break;
                }
                case 0:{
                    return;
                }


            }
        }



    }
    public static void addBook(String title, String author, int pages, String date){
        Book book = new Book(title, author, pages, date);
        Library.books.add(book);
    }

    public static void addUser(String secondName, String firstNme, String dateOfBirth, Book takeBooks){
        User user = new User(secondName, firstNme, dateOfBirth, takeBooks);
        Library.users.add(user);
    }
}
