package TASKBAR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuProject extends JFrame  {
//    using J frame class j menu
    JMenuBar menuBar;
    JMenu ArthmeticOperations,Area,SimpleInterest;
    JMenuItem Add,subtract,Multiplication,division,circle,triangle;
//constructor
    public MenuProject(){
        setTitle("task bar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,300,600,400);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setResizable(false);
//menubar in jframe
        menuBar = new JMenuBar();
        add(menuBar);
//menu in menu bar
        ArthmeticOperations = new JMenu("Arthemetic operation");
        menuBar.add(ArthmeticOperations);

        Area = new JMenu("area");
        menuBar.add(Area);

        SimpleInterest = new JMenu("simple interest");
        menuBar.add(SimpleInterest);
        setJMenuBar(menuBar);

        Add = new JMenuItem("add");
        subtract = new JMenuItem("subtract");
        Multiplication = new JMenuItem("multiply");
        division = new JMenuItem("divide");
        ArthmeticOperations.add(Add);
        ArthmeticOperations.add(subtract);
        ArthmeticOperations.add(Multiplication);
        ArthmeticOperations.add(division);
        circle = new JMenuItem("circle");
        Area.add(circle);
        triangle = new JMenuItem("triangle");
        Area.add(triangle);
        setJMenuBar(menuBar);
        SimpleInterest.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new SimpleInterest().setVisible(true);
            }
        });



    }

    public static void main(String[] args) {
        MenuProject menuProject = new MenuProject();
        menuProject.setVisible(true);

    }
}
