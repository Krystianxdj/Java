import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JButton jeden,dwa,trzy,cztery,piec,szesc,siedem,osiem,dziewiec,zero,plus,minus,rowna_sie;


    public Calculator()
    {
        setSize(400,400);
        setTitle("DEC Calculator 1v0 @Krystian Wolski");
        setLayout(null);

        jeden = new JButton("1");
        jeden.setBounds(20,100,50,50);
        jeden.setFont(new Font("Tahoma",Font.BOLD,20));
        add(jeden);
        jeden.addActionListener(this);

        dwa = new JButton("2");
        dwa.setBounds(75,100,50,50);
        dwa.setFont(new Font("Tahoma",Font.BOLD,20));
        add(dwa);
        dwa.addActionListener(this);

        trzy = new JButton("3");
        trzy.setBounds(130,100,50,50);
        trzy.setFont(new Font("Tahoma",Font.BOLD,20));
        add(trzy);
        trzy.addActionListener(this);

        cztery = new JButton("4");
        cztery.setBounds(20,155,50,50);
        cztery.setFont(new Font("Tahoma",Font.BOLD,20));
        add(cztery);
        cztery.addActionListener(this);

        piec = new JButton("5");
        piec.setBounds(75,155,50,50);
        piec.setFont(new Font("Tahoma",Font.BOLD,20));
        add(piec);
        piec.addActionListener(this);

        szesc = new JButton("6");
        szesc.setBounds(130,155,50,50);
        szesc.setFont(new Font("Tahoma",Font.BOLD,20));
        add(szesc);
        szesc.addActionListener(this);

        siedem = new JButton("7");
        siedem.setBounds(20,210,50,50);
        siedem.setFont(new Font("Tahoma",Font.BOLD,20));
        add(siedem);
        siedem.addActionListener(this);

        osiem = new JButton("8");
        osiem.setBounds(75,210,50,50);
        osiem.setFont(new Font("Tahoma",Font.BOLD,20));
        add(osiem);
        osiem.addActionListener(this);

        dziewiec = new JButton("9");
        dziewiec.setBounds(130,210,50,50);
        dziewiec.setFont(new Font("Tahoma",Font.BOLD,20));
        add(dziewiec);
        dziewiec.addActionListener(this);
    }



    public static void main(String[] arq)
    {
        Calculator aplikacja = new Calculator();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);

        //System.out.println("test");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
