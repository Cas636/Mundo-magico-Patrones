package src.Models;

public class ModelUsuario {
    private String nombreUsuario;
    private String claveUsuario;

    public String getNombreUsuario() {return nombreUsuario;}
    public String getClaveUsuario() {return claveUsuario;}
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    public void setClaveUsuario(String claveUsuario){
        this.claveUsuario = claveUsuario;
    }

}
