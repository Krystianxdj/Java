import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JButton jeden,dwa,trzy,cztery,piec,szesc,siedem,osiem,dziewiec,zero,plus,minus,rowna_sie,kasuj;
    private JTextField tOknoTekstowe;



   private double wartosc_pierwsza;
   private double wartosc_druga;
   private double wynik_operacji;
   private String operacja;
   private String wynik;


    public Calculator()
    {
        setSize(290,400);
        setTitle("Calculator");
        setLayout(null);

        jeden = new JButton("1");
        jeden.setBounds(30,100,50,50);
        jeden.setFont(new Font("Tahoma",Font.BOLD,20));
        add(jeden);
        jeden.addActionListener(this);

        dwa = new JButton("2");
        dwa.setBounds(85,100,50,50);
        dwa.setFont(new Font("Tahoma",Font.BOLD,20));
        add(dwa);
        dwa.addActionListener(this);

        trzy = new JButton("3");
        trzy.setBounds(140,100,50,50);
        trzy.setFont(new Font("Tahoma",Font.BOLD,20));
        add(trzy);
        trzy.addActionListener(this);

        cztery = new JButton("4");
        cztery.setBounds(30,155,50,50);
        cztery.setFont(new Font("Tahoma",Font.BOLD,20));
        add(cztery);
        cztery.addActionListener(this);

        piec = new JButton("5");
        piec.setBounds(85,155,50,50);
        piec.setFont(new Font("Tahoma",Font.BOLD,20));
        add(piec);
        piec.addActionListener(this);

        szesc = new JButton("6");
        szesc.setBounds(140,155,50,50);
        szesc.setFont(new Font("Tahoma",Font.BOLD,20));
        add(szesc);
        szesc.addActionListener(this);

        siedem = new JButton("7");
        siedem.setBounds(30,210,50,50);
        siedem.setFont(new Font("Tahoma",Font.BOLD,20));
        add(siedem);
        siedem.addActionListener(this);

        osiem = new JButton("8");
        osiem.setBounds(85,210,50,50);
        osiem.setFont(new Font("Tahoma",Font.BOLD,20));
        add(osiem);
        osiem.addActionListener(this);

        dziewiec = new JButton("9");
        dziewiec.setBounds(140,210,50,50);
        dziewiec.setFont(new Font("Tahoma",Font.BOLD,20));
        add(dziewiec);
        dziewiec.addActionListener(this);

        plus = new JButton("+");
        plus.setBounds(30,265,50,50);
        plus.setFont(new Font("Tahoma",Font.BOLD,20));
        add(plus);
        plus.addActionListener(this);

        minus = new JButton("-");
        minus.setBounds(85,265,50,50);
        minus.setFont(new Font("Tahoma",Font.BOLD,20));
        add(minus);
        minus.addActionListener(this);

        rowna_sie = new JButton("=");
        rowna_sie.setBounds(140,265,50,50);
        rowna_sie.setFont(new Font("Tahoma",Font.BOLD,20));
        add(rowna_sie);
        rowna_sie.addActionListener(this);

        kasuj = new JButton("C");
        kasuj.setBounds(195,100,50,50);
        kasuj.setFont(new Font("Tahoma",Font.BOLD,20));
        add(kasuj);
        kasuj.addActionListener(this);

        tOknoTekstowe = new JTextField("");
        tOknoTekstowe.setBounds(30,20,215,50);
        tOknoTekstowe.setFont(new Font("Tahoma",Font.BOLD,20));
        add(tOknoTekstowe);
        tOknoTekstowe.addActionListener(this);
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

        Object zrodlo = e.getSource();

        if(zrodlo==jeden)
        {
            String liczba = tOknoTekstowe.getText() + jeden.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==dwa)
        {
            String liczba = tOknoTekstowe.getText() + dwa.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==trzy)
        {
            String liczba = tOknoTekstowe.getText() + trzy.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==cztery)
        {
            String liczba = tOknoTekstowe.getText() + cztery.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==piec)
        {
            String liczba = tOknoTekstowe.getText() + piec.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==szesc)
        {
            String liczba = tOknoTekstowe.getText() + szesc.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo==siedem)
        {
            String liczba = tOknoTekstowe.getText() + siedem.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo == osiem)
        {
            String liczba = tOknoTekstowe.getText() + osiem.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo == dziewiec)
        {
            String liczba = tOknoTekstowe.getText() + dziewiec.getText();
            tOknoTekstowe.setText(liczba);
        }
        if(zrodlo == zero)
        {
            String liczba = tOknoTekstowe.getText() + zero.getText();
            tOknoTekstowe.setText(liczba);
        }


        if(zrodlo == plus)
        {
            wartosc_pierwsza = Double.parseDouble(tOknoTekstowe.getText());
            tOknoTekstowe.setText("");
            operacja = "+";
        }
        if(zrodlo == minus)
        {
            wartosc_pierwsza = Double.parseDouble(tOknoTekstowe.getText());
            tOknoTekstowe.setText("");
            operacja = "-";
        }
        if(zrodlo == kasuj)
        {
            tOknoTekstowe.setText(null);
        }





        if(zrodlo==rowna_sie)
        {
            wartosc_druga = Double.parseDouble(tOknoTekstowe.getText());
            if(operacja =="+")
            {
                wynik_operacji = wartosc_pierwsza+wartosc_druga;
                wynik = String.format("%.0f",wynik_operacji);
                tOknoTekstowe.setText(wynik);
            }
            else if (operacja=="-")
            {
                wynik_operacji = wartosc_pierwsza-wartosc_druga;
                wynik = String.format("%.0f",wynik_operacji);
                tOknoTekstowe.setText(wynik);
            }

        }



    }
}
