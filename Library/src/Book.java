public class Book {
    private final String title;
    private final String author;
    private final int pages;
    private final String dateOfRegister;

    public Book(String title, String author, int pages, String dataOfRegister) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateOfRegister = dataOfRegister;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }


    public String getDateOfRegister() {
        return dateOfRegister;
    }

    @Override
    public String toString(){
        return ("Title of book: " + this.getTitle() + "\n"+
                "Author: " + this.getAuthor() + "\n"+
                "Amount of pages: " + this.getPages() + "\n"+
                "Date of register: " + this.getDateOfRegister());
    }

}
