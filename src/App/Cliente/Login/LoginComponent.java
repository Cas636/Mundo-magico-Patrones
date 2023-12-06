package src.App.Cliente.Login;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import src.App.Cliente.Start.StartComponent;
import src.App.Cliente.VistaPrincipal.VistaPrincipalComponent;
import src.App.Services.GraphicServices.RecursosService;
import src.App.Services.GraphicServices.SClip;
import src.App.Services.LogicServices.UsuarioService;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class LoginComponent extends MouseAdapter implements ActionListener{
    private LoginTemplate loginTemplate;
    private UsuarioService sUsuario;
    private static SClip musica;
    private RecursosService sRecursos;
    private String[] placeholder = { "  Email o número de Teléfono", "  Contraseña" };
    VistaPrincipalComponent vp;

    public LoginComponent(StartComponent startComponent) {
        sUsuario=UsuarioService.getService();
        sRecursos = RecursosService.getService();
        loginTemplate = new LoginTemplate(this);
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginTemplate.getInicio())) {
           // mostrarDatos();
            enviarDatosUsuario();
            
        }
        if (e.getSource().equals(loginTemplate.getCerrar())) {
            System.exit(0);
        }
    }
    public void enviarDatosUsuario() {
        String usuario = loginTemplate.getTextoUsuario().getText();
        String clave = new String(loginTemplate.getPass().getPassword());
        if(sUsuario.verificarDatosUsuario(usuario, clave)){
            entrar();
            JOptionPane.showMessageDialog(null,"el ingreso fue exitoso","Advertencia",2);
            reproducirMusicaDeFondo();
        }else{
            JOptionPane.showMessageDialog(null,"algo quedo mal","Advertencia",2);
        }
        
        
    }

    public void mostrarDatos() {
        String usuario = loginTemplate.getTextoUsuario().getText();
        String clave = new String(loginTemplate.getPass().getPassword());
        JOptionPane.showMessageDialog(null, "Usuario: " + usuario + "\n" + "Clave: " + clave + "\n" + "\n",
                "Advertencia", 2);
    }

    public void entrar() {
        if (vp == null)
            vp = new VistaPrincipalComponent(this);
        else
            vp.getVistaPrincipalTemplate().setVisible(true);
        loginTemplate.setVisible(false);

    }

    public void reproducirMusicaDeFondo() {
        musica = sRecursos.getMusicaMapa();
        musica.loop();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() instanceof JTextField){ 
            JTextField text = ((JTextField) e.getSource());
            text.setForeground(Color.WHITE);
            text.setBackground(Color.GRAY);
            if (text.getText().equals(placeholder[0]))
                text.setText("  ");
            if (text.getText().equals(placeholder[1]))
                text.setText("");
            }
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton){ 
        JButton boton = ((JButton)e.getSource()); 
        boton.setIcon(loginTemplate.getIBlanca(boton));
        }
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() instanceof JButton){ 
            JButton boton = ((JButton)e.getSource()); 
            boton.setIcon(loginTemplate.getIGris(boton));
            }
            }
    

    public static void detenerMusicaMapa() {musica.stop();}
   
    
    

    
}
