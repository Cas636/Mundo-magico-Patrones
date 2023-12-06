package src.App.Cliente.Components.Pelea.Pelea2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

import src.App.Services.GraphicServices.ObjGraficService;
import src.App.Services.GraphicServices.RecursosService;

import java.awt.Color;

public class Pelea2Template extends JPanel{
    private ObjGraficService sObjGrafics;
    private RecursosService sRecursos;
    private ImageIcon iDim;
    private JLabel lab,lab1,lab2;
    private static final long serialVersionUID = 1L;
    public Pelea2Template(Pelea2Component peleaComponent){
        sObjGrafics= ObjGraficService.getService();
        sRecursos= RecursosService.getService();
        crearBotones();
        crearLabel();
        this.setSize(1500, 680);
        this.setBackground(Color.yellow);
        this.setLayout(null);
        this.setVisible(true);
    }
    public void crearLabel() {
        // redimencionar mago yo
        iDim= new ImageIcon(sRecursos.getImagenyo().getImage().getScaledInstance(200, 248, Image.SCALE_AREA_AVERAGING));
       //label 
        lab1= sObjGrafics.construirJLabel("",410,185, 200, 248,
        null, iDim, null, null, null, null, "");
        this.add(lab1);
        // redimencionar jefe
        iDim= new ImageIcon(sRecursos.getImagenMago2().getImage().getScaledInstance(200, 248, Image.SCALE_AREA_AVERAGING));
       //label 
        lab2= sObjGrafics.construirJLabel("",850,185, 200, 248,
        null, iDim, null, null, null, null, "");
        this.add(lab2);
        // redimencionar mundo magico
        iDim= new ImageIcon(sRecursos.getImagenFondoPelea3().getImage().getScaledInstance(1500, 680, Image.SCALE_AREA_AVERAGING));
       //label 
        lab= sObjGrafics.construirJLabel("",0,0, 1500, 680,
        null, iDim, null, null, null, null, "");
        this.add(lab);
    }
    public void crearBotones(){}
}