package opgave01;

public class Books {
    public static void main(String[] args) {
        book[] book = new book[2];
        book[0] = new book("Bøv1", "Bøv bøvsen",  2);
        book[1] = new book("Beast2", "Beasty author2", 4);

        System.out.println("bog1s titel er " + book[0].title);
        System.out.println("Bog1s forfatter er " + book[0].author);
        System.out.println("Bog1's sideantal er " + book[0].pages);

        System.out.println("bog2s titel er " + book[1].title);
        System.out.println("Bog2s forfatter er " + book[1].author);
        System.out.println("Bog2's sideantal er " + book[1].pages);
    }
}
