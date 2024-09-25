package opgave01;


public class book {
    public String title;
    public String author;
    public int pages;

    public book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    public void print(book[] books) {
        for (book book : books) {
            System.out.println(title + " " + author + " " + pages);

            }
        }
        }

