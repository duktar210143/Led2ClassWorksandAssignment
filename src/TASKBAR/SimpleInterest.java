package TASKBAR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterest extends JFrame implements ActionListener {
    JButton jb1;
    JLabel lbl1,lbl2,lbl3,lbl4;
    JTextField jt1,jt2,jt3;
    JMenuBar menubar;
    JButton  back;
    SimpleInterest(){
        lbl1 = new JLabel("PRINCIPLE");
        lbl1.setBounds(90,60,100,30);
        add(lbl1);

        jt1 = new JTextField();
        jt1.setBounds(90,80,150,30);
        add(jt1);

        lbl2 = new JLabel("TIME");
        lbl2.setBounds(90,100,100,30);
        add(lbl2);

        jt2 = new JTextField();
        jt2.setBounds(90,120,150,30);
        add(jt2);

        lbl3 = new JLabel("RATE");
        lbl3.setBounds(90,140,100,30);
        add(lbl3);

        jt3 = new JTextField();
        jt3.setBounds(90,160,150,30);
        add(jt3);

        lbl4 = new JLabel("RESULT");
        lbl4.setBounds(90,180,100,30);
        add(lbl4);


        jb1 = new JButton("SI");
        jb1.setBounds(90,200,150,30);
        add(jb1);

        jb1.addActionListener(this);

        menubar = new JMenuBar();
        add(menubar);

        back = new JButton("BACK");
        menubar.add(back);

        back.addActionListener(this);

        setJMenuBar(menubar);



        setLayout(null);
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {


        if(e.getSource().equals(jb1)){
            Float p = Float.parseFloat(jt1.getText());
            Float t = Float.parseFloat(jt2.getText());
            Float r = Float.parseFloat(jt3.getText());
            Float si;
            si = (p*t*r)/100;
            lbl4.setText(String.valueOf(si));
        }


        if(e.getSource().equals(back)){
            dispose();
            new MenuProject().setVisible(true);
        }


    }

    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        simpleInterest.setVisible(true);
    }
}
