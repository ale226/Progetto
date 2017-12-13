package it.progetto.view;

import it.progetto.actionlisteners.LoginListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLoginFrame extends JFrame {


    private JTextField txtUsername = new JTextField();
    private JPasswordField txtPassword = new JPasswordField();

    public MyLoginFrame() {




        super("Effettua il Login");
        Container c = getContentPane();


        c.setLayout(new BorderLayout());

        LoginListener listener = new LoginListener(this);

        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(2, 2));
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");

        centro.add(lblUsername);
        centro.add(txtUsername);

        centro.add(lblPassword);
        centro.add(txtPassword);
        txtUsername.addActionListener(listener);
        txtPassword.addActionListener(listener);


        JPanel sud = new JPanel();
        sud.setLayout(new FlowLayout());
        sud.add(new JLabel("Benvenuto"));
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(listener);
        sud.add(btnLogin);


        c.add(centro, BorderLayout.CENTER);
        c.add(sud, BorderLayout.SOUTH);



        setSize(400, 150);
        setVisible(true);
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }


}
