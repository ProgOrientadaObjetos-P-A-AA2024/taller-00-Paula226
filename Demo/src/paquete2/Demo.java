/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
/**
 *
 * @author reroes
 */
public class Demo {

    
    
    public static void main(String[] args) {
        
        int n = Informacion.obtenerHabitantes();
        String frase = Mensaje.obtenerMensaje();
        System.out.printf("%s con %d \n",frase,n);
    }
    
}
