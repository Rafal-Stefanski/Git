package udemy.udemy_java_courses;

import javax.swing.*;

public class TaskUdemyObjects1 {
    public static void main(String[] args) {
        int number = 5;

        //Create window
        JFrame window = new JFrame();           // zmienna window która zawiera obiekt JFrame i tworzymy nowy JFrame do przypisania do zmiennej window
        window.setSize(800, 600);   // Wywołujemy motody na naszym obiekcie JFrame aby go skonfigurować
        window.setVisible(true);

        JLabel label = new JLabel();            // zmienna label zawiera obiekty JLabel i tworzy nowy JLabel to przypisania do metody
        label.setText("My Label");              // wywołujemy metodę setText aby ustawić właściwości tekstu

        window.add(label);                      // Wywołujemy metodę add na obiekcie JFrame aby dodać metodę label do window.
    }
}
