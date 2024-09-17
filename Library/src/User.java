
public class User {
    private final String secondName;
    private final String firstName;
    private final String dateOfBirth;
    private final Book takeBooks;

    public User(String secondName, String firstName, String dateOfBirth, Book takeBooks) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.takeBooks = takeBooks;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public Book getTakeBooks() {
        return takeBooks;
    }


    @Override
    public String toString(){
        return ("Second name: " + this.getSecondName() + "\n"+
                "First name: " + this.getFirstName() + "\n"+
                "Date of birth: " + this.getDateOfBirth() + "\n"+
                "Books: \n" + this.getTakeBooks());
    }
}
