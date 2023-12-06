package src.App.Cliente.Components.Inicio;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import java.awt.Color;
import java.awt.Image;

import src.App.Services.GraphicServices.ObjGraficService;
import src.App.Services.GraphicServices.RecursosService;


public class InicioTemplate extends JPanel{
    //declaración de servicios
    private ObjGraficService sObjGrafics;
    private RecursosService sRecursos;
    private static final long serialVersionUID = 1L;
    private ImageIcon iDim;
    private JLabel lab;
    private JButton level1,level2,level3,level4;
    private InicioComponent inicioComponent;
    public InicioTemplate(InicioComponent inicioComponent){
        this.inicioComponent = inicioComponent;
        sObjGrafics= ObjGraficService.getService();
        sRecursos= RecursosService.getService();
        crearBotones();
        crearLabel();
        this.setSize(1500, 680);
        this.setLayout(null);
        this.setVisible(true);
    }
    public void crearLabel() {
        // redimencionar mundo magico
        iDim= new ImageIcon(sRecursos.getImagenFondoJuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
       //label 
        lab= sObjGrafics.construirJLabel("",0,0, 1500, 680,
        null, iDim, null, null, null, null, "");
        this.add(lab);
    }
    public void crearBotones(){
        //boton primer nivel
        level1= sObjGrafics.construirJButton("", 350,10,350, 150, 
        sRecursos.getCursor(), null, null, null, null, null, "", false);
        level1.addActionListener(inicioComponent);
        level1.addMouseListener(inicioComponent);
        this.add(level1);

        //boton segundo nivel
        level2= sObjGrafics.construirJButton(" ", 280,400,250, 150, 
        sRecursos.getCursor(), null, null, null, null, null, "", false);
        level2.addActionListener(inicioComponent);
        level2.addMouseListener(inicioComponent);
        this.add(level2);

        //boton tercero nivel
        level3= sObjGrafics.construirJButton("  ", 600,350,350, 200, 
        sRecursos.getCursor(), null, null, null, null, null, "", false);
        level3.addActionListener(inicioComponent);
        level3.addMouseListener(inicioComponent);
        this.add(level3);

        //boton cuarto nivel
        level4= sObjGrafics.construirJButton("   ", 1100,10,250, 300, 
        sRecursos.getCursor(), null, null, null, null, null, "", false);
        level4.addActionListener(inicioComponent);
        level4.addMouseListener(inicioComponent);
        this.add(level4);
    }
    public ImageIcon getIEnfoque(JButton boton){
        if(boton==level1){
            iDim= new ImageIcon(sRecursos.getImagenFondoFuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level2){
            iDim= new ImageIcon(sRecursos.getImagenFondoAgua().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level3){
            iDim= new ImageIcon(sRecursos.getImagenFondoCastillo().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level4){
            iDim= new ImageIcon(sRecursos.getImagenFondoFinal().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public ImageIcon getIMapa(JButton boton){
        if(boton==level1){
            iDim= new ImageIcon(sRecursos.getImagenFondoJuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level2){
            iDim= new ImageIcon(sRecursos.getImagenFondoJuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level3){
            iDim= new ImageIcon(sRecursos.getImagenFondoJuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==level4){
            iDim= new ImageIcon(sRecursos.getImagenFondoJuego().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
        }
        

        return iDim;
    }
    public JLabel getLabel() {return lab;}
    
   
}
