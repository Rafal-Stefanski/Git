package pl.sda.mini_project;

public class Starter {
    public static void main(String[] args) {
        BooksManager booksManager = new BooksManager();
        ManagerGui managerGui = new ManagerGui(booksManager);
        managerGui.runIt();
        System.exit(0);
    }
}