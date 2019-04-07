package pl.sda.mini_project;

import com.google.common.collect.Lists;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;
import pl.sda.mini_project.books.Book;
import pl.sda.mini_project.books.BookType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Text IO driven GUI - documentation: http://text-io.beryx.org/releases/latest/#introduction
 */
public class ManagerGui {
    private static final String BEGIN_BOOKMARK = "BEGIN";
    private TextIO textIO = TextIoFactory.getTextIO();
    private BooksManager booksManager;

    public ManagerGui(BooksManager booksManager) {
        this.booksManager = booksManager;
    }

    public void runIt() {
        textIO.getTextTerminal().setBookmark(BEGIN_BOOKMARK);
        printMenu();
    }

    private void printMenu() {
        int option = 1;
        while (option > 0) {
            TextTerminal<?> textTerminal = textIO.getTextTerminal();
            textTerminal.resetToBookmark(BEGIN_BOOKMARK);
            textTerminal.println();
            textTerminal.print(Lists.newArrayList(
                    "Menu:",
                    "1. Lista wszystkich książek",
                    "2. Dodaj książkę",
                    "3. Usuń książkę",
                    "0. Zakończ",
                    ""
            ));
            textTerminal.println();

            option = textIO.newIntInputReader()
                    .withMinVal(0)
                    .withMaxVal(4)
                    .read("Twój wybór");

            switch (option) {
                case 1:
                    printBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    deleteBook();
                    break;
            }
        }
    }

    private void printBooks() {
        List<Book> books = booksManager.findBooks();
        printList(books);
    }

    private void addBook() {
        TextTerminal<?> textTerminal = textIO.getTextTerminal();
        textTerminal.resetToBookmark(BEGIN_BOOKMARK);

        String author = textIO.newStringInputReader()
                .read("Autor: ");
        String title = textIO.newStringInputReader()
                .read("Tytuł: ");
        BookType type = textIO.newEnumInputReader(BookType.class)
                .read("Rodzaj: ");

        booksManager.addBook(author, title, type);
    }

    private void deleteBook() {
        TextTerminal<?> textTerminal = textIO.getTextTerminal();
        textTerminal.resetToBookmark(BEGIN_BOOKMARK);

        int bookId = textIO.newIntInputReader().read("Podaj id książki:");
        booksManager.deleteBook(bookId);
    }

    private void printList(List<Book> list) {
        TextTerminal<?> textTerminal = textIO.getTextTerminal();
        textTerminal.resetToBookmark(BEGIN_BOOKMARK);
        List<String> messages = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            messages.add("Lista jest pusta.");
        } else {
            messages.addAll(list.stream()
                    .map(Object::toString)
                    .collect(Collectors.toList()));
        }

        textTerminal.println();
        textTerminal.print(messages);
        textTerminal.println();
        textTerminal.println();
        textTerminal.print(Lists.newArrayList(
                "Menu:",
                "1. Sortuj po autorze",
                "2. Sortuj po rodzaju",
                "0. Wróć do głównego menu",
                ""
        ));
        textTerminal.println();

        int option = textIO.newIntInputReader()
                .withMinVal(0)
                .withMaxVal(2)
                .read("Twój wybór");

        switch (option) {
            case 1:
                List<Book> books = booksManager.getSortedByAuthor();
                printList(books);
                break;
            case 2:
                books = booksManager.getSortedByType();
                printList(books);
                break;
        }
    }
}