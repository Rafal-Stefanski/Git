package pl.sda.testy_i_próby.udemy.overriding;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JFrame {
    public static void main(String[] args) {
        new Drawing();
    }

    public Drawing() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.drawRect(50,50,100,25);
        g.setColor(new Color(0,0,225));
        g.drawOval(200,200,50,50);

        g.setColor(Color.GREEN);
        g.fillRect(50,200,100,25);

        g.setColor(Color.BLACK);
        g.drawString("My string",200,200);
    }
}
