package src.App.Cliente.VistaPrincipal;

import javax.swing.JFrame;
import javax.swing.JPanel;

import src.App.Services.GraphicServices.ObjGraficService;

public class VistaPrincipalTemplate extends JFrame{
    private static final long serialVersionUID = 1L;
    //declaración de servicios
    private ObjGraficService sObjGrafics;
    //private RecursosService sRecursos;
    private JPanel pMed, pInf;
    //declaración de componentes
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        sObjGrafics= ObjGraficService.getService();
        //ventana
        setTitle("Vista Principal de usuario");
        setSize(1500, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
        //funciones 
        crearJPanels();
    }
    public void crearJPanels(){
       //panel 1
        pMed= sObjGrafics.construirPanel(1500,680,0, 0, null);
        this.add(pMed);
        //panel 2
        pInf= sObjGrafics.construirPanel(1500,70,0, 680,  null);
        this.add(pInf);
    }
    public JPanel getPanelMed(){return pMed;}
    public JPanel getPanelInf(){return pInf;}   
}
