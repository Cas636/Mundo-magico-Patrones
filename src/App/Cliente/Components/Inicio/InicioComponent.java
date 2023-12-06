package src.App.Cliente.Components.Inicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import src.App.Cliente.Login.LoginComponent;
import src.App.Cliente.VistaPrincipal.VistaPrincipalComponent;
import src.App.Services.GraphicServices.RecursosService;
import src.App.Services.GraphicServices.SClip;

import java.awt.event.MouseAdapter;
public class InicioComponent extends MouseAdapter implements ActionListener{
    private InicioTemplate inicioTemplate;
   // private LoginComponent loginComponent;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private static SClip musica;
    private RecursosService sRecursos;

    public InicioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        sRecursos = RecursosService.getService();
        this.inicioTemplate = new InicioTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    public InicioTemplate getInicioTemplate() {
        return inicioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.vistaPrincipalComponent.mostrarPelea(e.getActionCommand());
        reproducirMusicaDeFondo();
    }

    public void reproducirMusicaDeFondo() {
        musica = sRecursos.getMusicaPelea();
        musica.loop();
        LoginComponent.detenerMusicaMapa();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        inicioTemplate.getLabel().setIcon(inicioTemplate.getIEnfoque(boton));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        inicioTemplate.getLabel().setIcon(inicioTemplate.getIMapa(boton));
    }

    public static void detenerMusicaPelea() {
        if(musica!=null){
            musica.stop();}
}
}