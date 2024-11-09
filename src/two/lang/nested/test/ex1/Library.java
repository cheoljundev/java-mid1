package two.lang.nested.test.ex1;

public class Library {
    // 코드 작성

    private Book[] books;
    private int count;
    public Library(int maxBooks) {
        books = new Book[maxBooks];
    }

    public void addBook(String title, String author) {
        if (count == books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            Book book = new Book(title, author);
            books[count++] = book;
        }
    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
