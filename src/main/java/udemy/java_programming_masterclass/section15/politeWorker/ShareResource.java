package udemy.java_programming_masterclass.section15.politeWorker;

public class ShareResource {
    private Worker owner;

    public ShareResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public void setOwner(Worker owner) {
        this.owner = owner;
    }
}
