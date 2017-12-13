package it.progetto.actionlisteners;

import it.progetto.view.MyHomeFrame;
import it.progetto.view.MyLoginFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener{



    private MyLoginFrame finestra3;


    public LoginListener(MyLoginFrame finestra3) {
        this.finestra3 = finestra3;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento catturato!");
    }
}
