package src.App.Cliente.Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import src.App.Services.GraphicServices.ObjGraficService;
import src.App.Services.GraphicServices.RecursosService;

public class LoginTemplate extends JFrame {
    private static final long serialVersionUID = 1L;
    //declaracion de objetos graficos
    private JPanel pIzquierda, pDerecha;
    private JLabel lab;
    private JLabel labFondo;
    private JPasswordField tContraseña;
    private JTextField tUsuario;
    private JButton bInicio,bCerrar;
    private ImageIcon iDim;

    //declaración de servicios
    private ObjGraficService sObjGrafics;
    private RecursosService sRecursos;
    //declaración componente
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent loginComponent) {
        sObjGrafics= ObjGraficService.getService();
        sRecursos= RecursosService.getService();
        this.loginComponent= loginComponent;
        //ventana
        setTitle("login de usuario");
        setSize(1500, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
        //funciones
        crearJPanels();
        crearJButton();
        crearJLabels();
        crearTextFields();
        crearTextPasswordFields();
    }
    public void crearJPanels(){
        //panel1
        pDerecha=sObjGrafics.construirPanel(457, 625,((this.getWidth()-457)/2)-40,130, sRecursos.getColorPrincipal());
        this.add(pDerecha);

       //panel 2
        pIzquierda= sObjGrafics.construirPanel(1500, 750, 0,0, null);
        this.add(pIzquierda);
    }
    public void crearTextFields(){
        //usuario 
        tUsuario= sObjGrafics.construirJTextField("  Email o número de Teléfono", ((pDerecha.getWidth()-300)/2)-20,
         130, 300, 50, 
        null, Color.darkGray, Color.gray, null, null, "l");
        tUsuario.addMouseListener(loginComponent);
        pDerecha.add(tUsuario);
    }
    public void crearTextPasswordFields(){
        //contraseña 
        tContraseña= sObjGrafics.construirJPasswordField("  Contraseña", ((pDerecha.getWidth()-300)/2)-20,200,
         300,50, null, Color.darkGray, Color.GRAY, null, null, "l");
        tContraseña.addMouseListener(loginComponent);
        pDerecha.add(tContraseña);
    }

    public void crearJLabels(){
       //label 
        lab= sObjGrafics.construirJLabel("Inicia sesión", ((pDerecha.getWidth()-200)/2)-77,30, 200, 100,
        null, null, new Font("arial",Font.BOLD,30), null, Color.white, null, "c");
        pDerecha.add(lab);

        //redimencionar fondo
        iDim= new ImageIcon(sRecursos.getImagenFondo().getImage().getScaledInstance(1500, 750, Image.SCALE_AREA_AVERAGING));
        //fondo
        labFondo= sObjGrafics.construirJLabel("", 0, 0, 1500, 750, 
        null, iDim, null, null, null, null, "");
        pIzquierda.add(labFondo);

    }
    public void crearJButton(){
        //boton inicio de sesión
        bInicio= sObjGrafics.construirJButton("Iniciar sesión", (((pDerecha.getWidth()-300)/2)-20),285,300, 50, 
        sRecursos.getCursor(), null, new Font("arial",Font.BOLD,16), sRecursos.getColorAzul(), Color.white, null, "", true);
        bInicio.addActionListener(loginComponent);
        pDerecha.add(bInicio);
        //redimencionar fondo
        iDim= new ImageIcon(sRecursos.getImagenCerrar().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        //boton cerrar
        bCerrar= sObjGrafics.construirJButton("", 1450,10,40, 40, 
        sRecursos.getCursor(), iDim, null, null, null, null, "", false);
        bCerrar.addActionListener(loginComponent);
        bCerrar.addMouseListener(loginComponent);
        pIzquierda.add(bCerrar);
    }
    public ImageIcon getIBlanca(JButton boton){
        if(boton==bCerrar){
            iDim= new ImageIcon(sRecursos.getImagenCerrar1().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public ImageIcon getIGris(JButton boton){
        if(boton==bCerrar){
            iDim= new ImageIcon(sRecursos.getImagenCerrar().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        }
        return iDim;
    }
    public JButton getInicio(){return bInicio;}
    public JButton getCerrar(){return bCerrar;}
    public JTextField getTextoUsuario(){return tUsuario;}
    public JPasswordField getPass(){return tContraseña;}
}