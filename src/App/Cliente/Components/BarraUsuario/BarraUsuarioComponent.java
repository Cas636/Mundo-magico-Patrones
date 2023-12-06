package src.App.Cliente.Components.BarraUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;

import src.App.Cliente.Components.Inicio.InicioComponent;
import src.App.Cliente.Login.LoginComponent;
import src.App.Cliente.VistaPrincipal.VistaPrincipalComponent;
import src.App.Services.GraphicServices.RecursosService;
import src.App.Services.GraphicServices.SClip;

public class BarraUsuarioComponent extends MouseAdapter implements ActionListener{
    private BarraUsuarioTemplate barraUsuarioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private SClip musica;
    private RecursosService sRecursos;

    public BarraUsuarioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        sRecursos= RecursosService.getService();
        this.vistaPrincipalComponent= vistaPrincipalComponent;
        barraUsuarioTemplate = new BarraUsuarioTemplate(this);
    }

    public BarraUsuarioTemplate getContenidoUsuarioTemplate() {
        return barraUsuarioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.vistaPrincipalComponent.mostrarMenu(e.getActionCommand().trim());
        if(e.getSource().equals(barraUsuarioTemplate.getBotonHome()))
            reproducirMusicaDeFondo();
        if(e.getSource().equals(barraUsuarioTemplate.getBotonSalir()))
            LoginComponent.detenerMusicaMapa();
            InicioComponent.detenerMusicaPelea();
    }
    public void reproducirMusicaDeFondo() {
        musica = sRecursos.getMusicaMapa();
        musica.loop();
        InicioComponent.detenerMusicaPelea();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = ((JButton)e.getSource());
        boton.setIcon(barraUsuarioTemplate.getIBlanca(boton));
        //boton.setForeground(Color.WHITE);
        }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = ((JButton)e.getSource());
        boton.setIcon(barraUsuarioTemplate.getIGris(boton));
        //boton.setForeground(Color.DARK_GRAY);
        }

    }

    


