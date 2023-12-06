package src.App.Cliente.Start;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import src.App.Cliente.Login.LoginComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;

public class StartComponent extends MouseAdapter implements ActionListener{
    private StartTemplate startTemplate;
    //private String[] placeholder={"  Email o número de Teléfono", "  Contraseña"};
    LoginComponent lg;
    public StartComponent(){
        startTemplate= new StartTemplate(this);
    }
    public StartTemplate getStartTemplate(){
        return startTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(startTemplate.getInicio())){
            entrar();
        }
    }
    
    public void entrar(){
        if (lg==null)
            lg= new LoginComponent(this);
        else
            lg.getLoginTemplate().setVisible(true);
        startTemplate.setVisible(false);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = ((JButton)e.getSource());
        boton.setIcon(startTemplate.getIBlanca(boton));
    }
    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = ((JButton)e.getSource());
        boton.setIcon(startTemplate.getINegro(boton));        
    }
    


}