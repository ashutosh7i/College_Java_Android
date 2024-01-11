// Importing classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form1{
    public static void main(String args[]){
        MyFrame obj = new MyFrame();
        obj.setSize(300,400);
        obj.setLayout(null);
        obj.setVisible(true);
        
    }
}

class MyFrame extends JFrame{
static JTextField t1 = new JTextField("Enter name");
static JLabel l1 = new JLabel("Hello");
JButton b1 = new JButton("Click");

B b = new B();

MyFrame(){
    add(t1);
    add(l1);
    add(b1);
    t1.setBounds(50,100,180,30);    //x,y,heigh, weight
    l1.setBounds(50,140,80,40);
    b1.setBounds(100,200,100,50);    

    //event listener
    b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
        MyFrame.l1.setText("Hello " + MyFrame.t1.getText());
    }
    });
}
};

// to run
// javac Form1.java
// java Form1