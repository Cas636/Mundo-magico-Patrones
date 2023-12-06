package src.App.Cliente.VistaPrincipal;

import src.App.Cliente.Components.BarraUsuario.BarraUsuarioComponent;
import src.App.Cliente.Components.Inicio.InicioComponent;
import src.App.Cliente.Components.Pelea.Pelea1.Pelea1Component;
import src.App.Cliente.Components.Pelea.Pelea2.Pelea2Component;
import src.App.Cliente.Components.Pelea.Pelea3.Pelea3Component;
import src.App.Cliente.Components.Pelea.Pelea4.Pelea4Component;
import src.App.Cliente.Login.LoginComponent;

public class VistaPrincipalComponent {
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraUsuarioComponent barraUsuarioComponent;
    private InicioComponent inicioComponent;
    private LoginComponent loginComponent;
    private Pelea1Component pelea1Component;
    private Pelea2Component pelea2Component;
    private Pelea3Component pelea3Component;
    private Pelea4Component pelea4Component;


    public VistaPrincipalComponent(LoginComponent loginComponent){
        this.loginComponent = loginComponent;
        vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
        barraUsuarioComponent= new BarraUsuarioComponent(this);
        inicioComponent = new InicioComponent(this);
        vistaPrincipalTemplate.getPanelInf().add(barraUsuarioComponent.getContenidoUsuarioTemplate());
        vistaPrincipalTemplate.getPanelMed().add(inicioComponent.getInicioTemplate());
    }
    public VistaPrincipalTemplate getVistaPrincipalTemplate(){return vistaPrincipalTemplate;}
    public void mostrarMenu(String comando) {
        vistaPrincipalTemplate.getPanelMed().removeAll();
        switch (comando) {
            case "Inicio":
            vistaPrincipalTemplate.getPanelMed().add(inicioComponent.getInicioTemplate()); 
            break;
            case "Salir":
                loginComponent.getLoginTemplate().setVisible(true);
                this.vistaPrincipalTemplate.setVisible(false); 
                vistaPrincipalTemplate.getPanelMed().add(inicioComponent.getInicioTemplate());
            break;
        }
        vistaPrincipalTemplate.repaint();
    }
    public void mostrarPelea(String comando) {
        vistaPrincipalTemplate.getPanelMed().removeAll();
        switch (comando) {
            case "":
            if(pelea1Component==null)
                    pelea1Component = new Pelea1Component();
                vistaPrincipalTemplate.getPanelMed().add(
                    pelea1Component.getPelea1Template()); 
            break;
            case " ":
                if(pelea2Component==null)
                    pelea2Component = new Pelea2Component();
                vistaPrincipalTemplate.getPanelMed().add(
                    pelea2Component.getPelea2Template()); 
            break;
            case "  ":
                if(pelea3Component==null)
                    pelea3Component = new Pelea3Component();
                vistaPrincipalTemplate.getPanelMed().add(
                    pelea3Component.getPelea3Template());  
            break;
            case "   ":
                if(pelea4Component==null)
                    pelea4Component = new Pelea4Component();
                vistaPrincipalTemplate.getPanelMed().add(
                    pelea4Component.getPelea4Template());  
            break;
        }
        vistaPrincipalTemplate.repaint();
    }
}
