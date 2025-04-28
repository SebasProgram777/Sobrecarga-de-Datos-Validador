/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elvalidador;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
/**
 *
 * @author Sebastian
 */
public class ValidadorDeDatos {
    public boolean validar (String texto) {
        return texto != null ; 
    }
    public boolean validar(int numero) {
        return numero > 0;
    }
    public boolean validar(String fecha, boolean esFecha) {
        if (!esFecha) return false;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); 
        try {
            formato.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
    

