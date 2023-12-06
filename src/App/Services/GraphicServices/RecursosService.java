package src.App.Services.GraphicServices;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;



public class RecursosService {
    private static RecursosService servicio;
    private Color colorPrincipal,colorAzul;
    private Cursor cursorMano;
    private ImageIcon iFondo,iFondoS,iFondoV,iHomed,iMasd;
    private ImageIcon agua,fina,castillo,pelea1,pelea2;
    private ImageIcon iHomea,iMasa,start1,start2,fuego;
    private ImageIcon pelea3,pelea4,yo,mago1,mago2,mago3,mago4,cerrar,cerrar1;
    private SClip musicaM,musicaP;
    private RecursosService(){
        crearColores();
        crearCursor();
        crearImagenes();
        crearMusica();
    }
    public void crearColores(){
        //color
        colorPrincipal= new Color(0,0,0,210);
        colorAzul= new Color(38,75,155);
    }
    public void crearCursor(){
        //cursor
        cursorMano= new Cursor(Cursor.HAND_CURSOR);
    }
    public void crearImagenes(){
        //imagenes
        iFondo= new ImageIcon("Recursos/Images/login.jpg");
        start1= new ImageIcon("Recursos/Images/comenzar1.jpg");
        start2= new ImageIcon("Recursos/Images/comenzar2.jpg");
        iFondoS= new ImageIcon("Recursos/Images/door.jpg");
        iFondoV= new ImageIcon("Recursos/Images/fondo.jpg");
        fuego= new ImageIcon("Recursos/Images/mapafuego.jpg");
        agua= new ImageIcon("Recursos/Images/mapaagua.jpg");
        fina= new ImageIcon("Recursos/Images/mapafinal.jpg");
        castillo= new ImageIcon("Recursos/Images/mapacastillo.jpg");
        pelea1= new ImageIcon("Recursos/Images/pelea1.jpg");
        pelea2= new ImageIcon("Recursos/Images/pelea2.jpg");
        pelea3= new ImageIcon("Recursos/Images/pelea3.jpg");
        pelea4= new ImageIcon("Recursos/Images/pelea4.jpg");
        yo= new ImageIcon("Recursos/Images/yo.png");
        mago1= new ImageIcon("Recursos/Images/mago1.png");
        mago2= new ImageIcon("Recursos/Images/mago2.png");
        mago3= new ImageIcon("Recursos/Images/mago3.png");
        mago4= new ImageIcon("Recursos/Images/mago4.png");
        iHomed= new ImageIcon("Recursos/Iconos/home-d.png");
        iHomea= new ImageIcon("Recursos/Iconos/home-a.png");
        iMasa= new ImageIcon("Recursos/iconos/mas-a.png");
        iMasd= new ImageIcon("Recursos/iconos/mas-d.png");
        cerrar= new ImageIcon("Recursos/Images/cerrar.png");
        cerrar1= new ImageIcon("Recursos/Images/cerrar1.png");
    }
    public void crearMusica(){
        musicaM= new SClip("Recursos/Musica/musicamapa.wav");
        musicaP=new SClip("Recursos/Musica/pelea.wav");
    }

    //getters
    public Color getColorPrincipal(){return colorPrincipal;} 
    public Color getColorAzul(){return colorAzul;}
    public Cursor getCursor(){return cursorMano;}
    public ImageIcon getImagenFondo(){return  iFondo;}
    public ImageIcon getImagenFondoJuego(){return  iFondoV;}
    public ImageIcon getImagenFondoFuego(){return  fuego;}
    public ImageIcon getImagenFondoAgua(){return  agua;}
    public ImageIcon getImagenFondoFinal(){return  fina;}
    public ImageIcon getImagenFondoCastillo(){return  castillo;}
    public ImageIcon getImagenFondoPelea1(){return  pelea1;}
    public ImageIcon getImagenFondoPelea2(){return  pelea2;}
    public ImageIcon getImagenFondoPelea3(){return  pelea3;}
    public ImageIcon getImagenFondoPelea4(){return  pelea4;}
    public ImageIcon getImagenComenzar(){return  start1;}
    public ImageIcon getImagenComenzar2(){return  start2;}
    public ImageIcon getImagenFondoStart(){return  iFondoS;}
    public ImageIcon getImagenHomed(){return iHomed;}
    public ImageIcon getImagenMasd(){return iMasd;}
    public ImageIcon getImagenHomea(){return iHomea;}
    public ImageIcon getImagenyo(){return yo;}
    public ImageIcon getImagenMago1(){return mago1;}
    public ImageIcon getImagenMago2(){return mago2;}
    public ImageIcon getImagenMago3(){return mago3;}
    public ImageIcon getImagenMago4(){return mago4;}
    public ImageIcon getImagenMasa(){return iMasa;}
    public ImageIcon getImagenCerrar(){return cerrar;}
    public ImageIcon getImagenCerrar1(){return cerrar1;}
    public SClip getMusicaMapa(){return musicaM;}
    public SClip getMusicaPelea(){return musicaP;}

    public static RecursosService getService(){
        if (servicio==null){
            servicio= new RecursosService();
        }
        return servicio;
    }
}
