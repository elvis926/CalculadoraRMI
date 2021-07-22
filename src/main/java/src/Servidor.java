package src;
import java.rmi.*;
import java.rmi.registry.Registry;
import javax.swing.*;

/**
 *
 * @author cocho
 */
public class Servidor {
    public static void main (String[] args){
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
                r.rebind("Calculadora", new rmi());
                JOptionPane.showMessageDialog(null, "Servidor conectado exitosamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR Servidor  No conectado"+e);           
        }
                
    }
    
}
