import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void run(){
        JFrame f = new JFrame("New application");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello");
        label.setBounds(0,0,50,50);
        label.setName("TestLabel");
        f.add(new JLabel("Hello!"));
        Button button =new Button("Try and click me");
        button.addActionListener(e -> System.exit(0));
        f.add(button);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        run();

    }
}
