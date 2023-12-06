package src.App.Services.GraphicServices;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.ImageIcon;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;


public class ObjGraficService{
    private static ObjGraficService servicio;
    private JPanel panel;
    private JButton button;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox check;
    private JLabel label;
    private ObjGraficService(){}
    public JPanel construirPanel(int ancho, int largo, int x, int y, Color color){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setSize(ancho,largo);
        panel.setLocation(x,y);
        panel.setBackground(color);
        return panel;
    }
    public JButton construirJButton(
    String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen, Font fuente,
    Color colorFondo, Color colorFuente, Border borde, String direccion, boolean esSolido) 
    {
    button = new JButton(texto);
    button.setLocation(x, y);
    button.setSize(ancho, alto);
    button.setFocusable(false);
    button.setCursor(cursor);
    button.setFont(fuente);
    button.setBackground(colorFondo);
    button.setForeground(colorFuente);
    button.setIcon(imagen);
    button.setBorder(borde);
    button.setContentAreaFilled(esSolido);
    switch (direccion) {
      case "l":
        button.setHorizontalAlignment(SwingConstants.LEFT);
        break;
      case "r":
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        break;
      case "t":
        button.setVerticalTextPosition(SwingConstants.TOP);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        break;
      case "b":
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        break;
      default:
        break;
    }
    return button;
  }
    public JTextField construirJTextField(
        String texto, int x, int y, int ancho, int alto, Font fuente, Color colorFondo,
        Color colorFuente, Color colorCaret, Border borde, String direccion) {
        textField = new JTextField();
        textField.setLocation(x, y);
        textField.setSize(ancho, alto);
        textField.setText(texto);
        textField.setForeground(colorFuente);
        textField.setBackground(colorFondo);
        textField.setCaretColor(colorCaret);
        textField.setFont(fuente);
        textField.setBorder(borde);
        switch (direccion) {
          case "c":
            textField.setHorizontalAlignment(SwingConstants.CENTER);
            break;
          case "r":
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            break;
          default:
            break;
        }
        return textField;
      }    
    public JPasswordField construirJPasswordField(
        String texto, int x, int y, int ancho, int alto, Font fuente, Color colorFondo,
        Color colorFuente, Color colorCaret, Border borde, String direccion) {
        passwordField = new JPasswordField();
        passwordField.setLocation(x, y);
        passwordField.setSize(ancho, alto);
        passwordField.setText(texto);
        passwordField.setForeground(colorFuente);
        passwordField.setBackground(colorFondo);
        passwordField.setCaretColor(colorCaret);
        passwordField.setBorder(borde);
        switch (direccion) {
            case "c":
            passwordField.setHorizontalAlignment(SwingConstants.CENTER);
            break;
            case "r":
            passwordField.setHorizontalAlignment(SwingConstants.RIGHT);
            break;
        default:
            break;
    }
    return passwordField;
  }
    public JCheckBox construirJCheckBox(
    String texto, int x, int y, int ancho, int alto, Cursor cursor, Font fuente, Color colorFuente,boolean solido) {
        check = new JCheckBox(texto);
        check.setLocation(x, y);
        check.setSize(ancho, alto);
        check.setFocusable(false);
        check.setBackground(null);
        check.setCursor(cursor);
        check.setFont(fuente);
        check.setForeground(colorFuente);
        check.setContentAreaFilled(solido);
        return check;
  }
    public JLabel construirJLabel(
    String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen,
    Font fuente, Color colorFondo, Color colorFuente, Border borde, String direccion
  ) {
    label = new JLabel(texto);
    label.setLocation(x, y);
    label.setSize(ancho, alto);
    label.setForeground(colorFuente);
    label.setFont(fuente);
    label.setCursor(cursor);
    label.setIcon(imagen);
    label.setBorder(borde);
    if (colorFondo != null) {
      label.setOpaque(true);
      label.setBackground(colorFondo);
    }
    switch (direccion) {
      case "c":
        label.setHorizontalAlignment(SwingConstants.CENTER);
        break;
      case "r":
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
        break;
      case "t":
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.TOP);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        break;
      case "b":
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        break;
      default:
        break;
    }
    return label;
  }
    public static ObjGraficService getService(){
        if (servicio==null){
            servicio= new ObjGraficService();
        }
        return servicio;
    }

}