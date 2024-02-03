import javax.swing.*;
import java.awt.event.*;

public class anonymous {
    public static void main(String[] args) {
        JButton button = new JButton("Click Me");
        
        // Adding an ActionListener using an anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
