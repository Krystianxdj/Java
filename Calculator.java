import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JButton jeden,dwa,trzy,cztery,piec,szesc,siedem,osiem,dziewiec,zero,plus,minus,rowna_sie;


    public Calculator()
    {
        setSize(400,300);
        setTitle("DEC Calculator v1.0 @KTW");
        setLayout(null);

        jeden = new JButton("1");
        jeden.setBounds(20,80,50,50);
        add(jeden);
        jeden.addActionListener(this);

        dwa = new JButton("2");
        dwa.setBounds(80,80,50,50);
        add(dwa);
        dwa.addActionListener(this);

        trzy = new JButton("3");
        trzy.setBounds(140,80,50,50);
        add(trzy);
        trzy.addActionListener(this);

        cztery = new JButton("4");
        cztery.setBounds(200,80,50,50);
        add(cztery);
        cztery.addActionListener(this);

        piec = new JButton("5");
        piec.setBounds(260,80,50,50);
        add(piec);
        piec.addActionListener(this);

        szesc = new JButton("6");
        szesc.setBounds(20,140,50,50);
        add(szesc);
        szesc.addActionListener(this);

        siedem = new JButton("7");
        siedem.setBounds(80,140,50,50);
        add(siedem);
        siedem.addActionListener(this);
    }





    public static void main(String[] args)
    {
        Calculator aplikacja = new Calculator();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
