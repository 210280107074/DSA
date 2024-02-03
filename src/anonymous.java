import javax.swing.*;
import java.awt.event.*;

public  class anonymous {
    public static void swing1(){
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
    public static void main(String[] args) {
        Runnable obj1 = new Runnable(){
            public  void run(){
                for(int i=0;i<10;i++){
                    try{Thread.sleep(1000);}catch(Exception e){System.out.println(e.getMessage());}
                    System.out.println("hi");
                }
            }
        } ;
        Runnable obj2 = new Runnable(){
            public  void run(){
                for(int i=0;i<10;i++){
                    try{Thread.sleep(1000);}catch(Exception e){System.out.println(e.getMessage());}
                    System.out.println("hello");
                }
            }
        } ;
        Thread t1 = new Thread(obj1);
        t1.run();
        Thread t2 = new Thread(obj2);
        t2.run();

    }
}
