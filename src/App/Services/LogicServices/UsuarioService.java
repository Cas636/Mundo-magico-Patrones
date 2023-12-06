package src.App.Services.LogicServices;

import src.Logic.ControllerUsuarios;
import src.Models.ModelUsuario;

public class UsuarioService {
    private static UsuarioService servicio;
    private ControllerUsuarios cUsuario;

    private ModelUsuario usuarioConectado;


    private UsuarioService(){
        cUsuario = new ControllerUsuarios();
    }

    public boolean verificarDatosUsuario(String nombreUsuario, String claveUsuario) {
      // ModelUsuario usuario= cUsuario.devolverUsuario(nombreUsuario);
       if (cUsuario.verificarUsuario(nombreUsuario, claveUsuario)){
           this.usuarioConectado= cUsuario.devolverUsuario(nombreUsuario);
           return true;
       }
       return false;
    }

    public ModelUsuario getUsuarioConectado() {return this.usuarioConectado;}
    
  

    public static UsuarioService getService() {
        if (servicio == null){
            servicio=new UsuarioService();
        }
        return servicio;
    }
    
}
