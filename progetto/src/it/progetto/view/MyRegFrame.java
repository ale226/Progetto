package it.progetto.view;

import it.progetto.actionlisteners.RegListener;

import javax.swing.*;
import java.awt.*;

public class MyRegFrame extends JFrame {

    private JTextField txtMail = new JTextField();
    private JPasswordField txtPassword = new JPasswordField();


    public MyRegFrame(){

        super("Effettua la Registrazione");
        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(2,2));
        JLabel lblMail = new JLabel("Mail");
        JLabel lblPassword = new JLabel("Password");
        centro.add(lblMail);
        centro.add(txtMail);
        centro.add(lblPassword);
        centro.add(txtPassword);


        c.add(centro, BorderLayout.CENTER);


        setSize(500,200);
        setVisible(true);
    }
}
