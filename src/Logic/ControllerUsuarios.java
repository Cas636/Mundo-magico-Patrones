package src.Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import src.Models.ModelUsuario;

public class ControllerUsuarios {
    private ArrayList<ModelUsuario> usuarios;
    public ControllerUsuarios() {
        usuarios = new ArrayList<ModelUsuario>();
        cargarDatos();
    }
    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
          archivo = new File("src/archivos/usuarios.txt");
          fr = new FileReader(archivo);
          br = new BufferedReader(fr);
    
          String linea;
          while ((linea = br.readLine()) != null) {
            String[] atributos = linea.split(",");
            ModelUsuario usuario = new ModelUsuario();
            usuario.setNombreUsuario(atributos[0]);
            usuario.setClaveUsuario(atributos[1]);
            usuarios.add(usuario);
          }
          fr.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    
      public boolean verificarUsuario(
        String nombreUsuario, String claveUsuario
      ) {
        for (ModelUsuario usuario : usuarios) {
          if (usuario.getNombreUsuario().equals(nombreUsuario))
            if (usuario.getClaveUsuario().equals(claveUsuario))
                return true;
        }
        return false;
      }
    
      public ModelUsuario devolverUsuario(String nombreUsuario) {
        for (ModelUsuario usuario : usuarios) {
          if (usuario.getNombreUsuario().equals(nombreUsuario))
            return usuario;
        }
        return null;
      }
    }

