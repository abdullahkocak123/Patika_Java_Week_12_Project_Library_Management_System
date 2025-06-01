import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // Insert authors
        Author author1 = new Author();
        author1.setName("Halide Edip Adıvar");
        author1.setBirthDate(1884);
        author1.setCountry("Türkiye");
        entityManager.persist(author1);

        Author author2 = new Author();
        author2.setName("Peyami Safa");
        author2.setBirthDate(1899);
        author2.setCountry("Türkiye");
        entityManager.persist(author2);

        //Insert publishers
        Publisher publisher1 = new Publisher();
        publisher1.setName("Kitapçı-1");
        publisher1.setEstablishmentYear(2000);
        publisher1.setAddress("adres-1");
        entityManager.persist(publisher1);

        Publisher publisher2 = new Publisher();
        publisher2.setName("Kitapçı-2");
        publisher2.setEstablishmentYear(1999);
        publisher2.setAddress("adres-2");
        entityManager.persist(publisher2);

        //Insert categories
        Category category1 = new Category();
        category1.setName("Roman");
        category1.setDescription("Türk Edebiyatı romanları");
        entityManager.persist(category1);

        Category category2 = new Category();
        category2.setName("Polisiye Roman");
        category2.setDescription("Polisiye dizi roman ve hikayeleri");
        entityManager.persist(category2);

        Category category3 = new Category();
        category3.setName("Hikaye");
        category3.setDescription("hikaye ve türevleri");
        entityManager.persist(category3);

        // Insert books
        Book book1 = new Book();
        book1.setName("Sinekli Bakkal");
        book1.setPublicationYear(1936);
        book1.setStock(12);
        book1.setAuthor(author1);
        book1.setPublisher(publisher1);
        book1.setCategoryList(List.of(category1,category2));
        entityManager.persist(book1);

        Book book2 = new Book();
        book2.setName("Yeni Turan");
        book2.setPublicationYear(1912);
        book2.setStock(8);
        book2.setAuthor(author1);
        book2.setPublisher(publisher2);
        book2.setCategoryList(List.of(category2));
        entityManager.persist(book2);

        Book book3 = new Book();
        book3.setName("Dokuzuncu Hariciye Koğuşu");
        book3.setPublicationYear(1930);
        book3.setStock(10);
        book3.setAuthor(author2);
        book3.setPublisher(publisher1);
        book3.setCategoryList(List.of(category3, category1));
        entityManager.persist(book3);

        //Insert BookBorrowings
        BookBorrowing bookBorrowing1 = new BookBorrowing();
        bookBorrowing1.setBorrowerName("Ali Yılmaz");
        bookBorrowing1.setBorrowingDate(LocalDate.now());
        bookBorrowing1.setReturnDate(null);
        bookBorrowing1.setBook(book2);
        entityManager.persist(bookBorrowing1);

        BookBorrowing bookBorrowing2 = new BookBorrowing();
        bookBorrowing2.setBorrowerName("Ayşe Çelik");
        bookBorrowing2.setBorrowingDate(LocalDate.now());
        bookBorrowing2.setReturnDate(null);
        bookBorrowing2.setBook(book3);
        entityManager.persist(bookBorrowing2);

        transaction.commit();

    }
}
