package src.App.Cliente.Start;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import src.App.Services.GraphicServices.ObjGraficService;
import src.App.Services.GraphicServices.RecursosService;

public class StartTemplate extends JFrame{
    
    private static final long serialVersionUID = 1L;
    //declaracion de objetos graficos
    private JPanel pIzquierda;
    private JLabel labFondo;
    private JButton bInicio;
    private ImageIcon iDim;

    //declaración de servicios
    private ObjGraficService sObjGrafics;
    private RecursosService sRecursos;
    //declaración componente
    private StartComponent startComponent;

    public StartTemplate(StartComponent startComponent) {
        sObjGrafics= ObjGraficService.getService();
        sRecursos= RecursosService.getService();
        this.startComponent= startComponent;
        //ventana
       // setTitle("login de usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        setSize(1500, 750);
        setLocationRelativeTo(this);
        setVisible(true);
        //funciones
        crearJPanels();
        crearJButton();
        crearJLabels();
    }
    public void crearJPanels(){
       //panel 1
        pIzquierda= sObjGrafics.construirPanel(1548, 832, 0,0, null);
        this.add(pIzquierda);
    }
    public void crearJLabels(){
        //redimencionar fondo
        iDim= new ImageIcon(sRecursos.getImagenFondoStart().getImage().getScaledInstance(1500, 750, Image.SCALE_AREA_AVERAGING));
        //fondo
        labFondo= sObjGrafics.construirJLabel("", 0, 0, 1500, 750, 
        null, iDim, null, null, null, null, "");
        pIzquierda.add(labFondo);

    }
    public void crearJButton(){
        //boton start
        //redimencionar fondo
        iDim= new ImageIcon(sRecursos.getImagenComenzar().getImage().getScaledInstance(300, 50, Image.SCALE_AREA_AVERAGING));
        //fondo
        bInicio= sObjGrafics.construirJButton("", (((pIzquierda.getWidth()-300)/2)+10),430,300, 50, 
        sRecursos.getCursor(), iDim, null, null, null, null, "", false);
        bInicio.addActionListener(startComponent);
        bInicio.addMouseListener(startComponent);
        pIzquierda.add(bInicio);
    }
    public JButton getInicio(){return bInicio;}
    public ImageIcon getIBlanca(JButton boton){
        if(boton==bInicio){
            iDim= new ImageIcon(sRecursos.getImagenComenzar2().getImage().getScaledInstance(300, 50, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public ImageIcon getINegro(JButton boton){
        if(boton==bInicio){
            iDim= new ImageIcon(sRecursos.getImagenComenzar().getImage().getScaledInstance(300, 50, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
}

    

