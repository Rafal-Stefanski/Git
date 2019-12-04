package udemy.java_programming_masterclass.section7.composition.house;

public class Window {
    private boolean isOpen;

    public Window(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

//    public boolean setIsOpen()

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

