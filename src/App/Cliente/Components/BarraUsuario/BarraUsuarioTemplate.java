package src.App.Cliente.Components.BarraUsuario;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import src.App.Services.GraphicServices.ObjGraficService;
import src.App.Services.GraphicServices.RecursosService;

public class BarraUsuarioTemplate extends JPanel{
    private static final long serialVersionUID = 1L;
    private BarraUsuarioComponent barraUsuarioComponent;
    private ObjGraficService sObjGrafics;
    private RecursosService sRecursos;
    private ImageIcon iDim;
    private JButton bHome,bMas;
    public BarraUsuarioTemplate(BarraUsuarioComponent barraUsuarioComponent){
        this.barraUsuarioComponent= barraUsuarioComponent;
        this.sObjGrafics= ObjGraficService.getService();
        this.sRecursos= RecursosService.getService();
        this.setSize(1500, 70);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
        crearJButton();
    }
    public void crearJButton(){
        //boton home
        iDim= new ImageIcon(sRecursos.getImagenHomed().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));    
        bHome= sObjGrafics.construirJButton(" Inicio", ((this.getWidth())/2)-110,10, 50, 50, 
        sRecursos.getCursor(), iDim, null, null, Color.darkGray, null, "b", false);
        bHome.addActionListener(barraUsuarioComponent);
        bHome.addMouseListener(barraUsuarioComponent);
        this.add(bHome);
        //boton salir
        iDim= new ImageIcon(sRecursos.getImagenMasd().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));    
        bMas= sObjGrafics.construirJButton("Salir",((this.getWidth())/2),10, 50, 50, 
        sRecursos.getCursor(), iDim, null, null, Color.darkGray, null, "b", false);
        bMas.addActionListener(barraUsuarioComponent);
        bMas.addMouseListener(barraUsuarioComponent);
        this.add(bMas);
    }
    public RecursosService getService() {return sRecursos;}
    public ImageIcon getIBlanca(JButton boton){
        if(boton==bHome){
            iDim= new ImageIcon(sRecursos.getImagenHomea().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==bMas){
            iDim= new ImageIcon(sRecursos.getImagenMasa().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public ImageIcon getIGris(JButton boton){
        if(boton==bHome){
            iDim= new ImageIcon(sRecursos.getImagenHomed().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        }
        if(boton==bMas){
            iDim= new ImageIcon(sRecursos.getImagenMasd().getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public JButton getBotonHome(){return bHome;}
    public JButton getBotonSalir(){return bMas;}
}



