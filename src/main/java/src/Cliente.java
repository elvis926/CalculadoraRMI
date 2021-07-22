package src;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author cocho
 */
public class Cliente {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        try{
            Registry miRegistro = LocateRegistry.getRegistry("localhost",1099);
            Calculadora c = (Calculadora)Naming.lookup("//localhost/Calculadora");
            
            while(true){
                String menu = JOptionPane.showInputDialog("Calculadora RMI\n "
 + "*** BIENVENIDOS*** \n\n Escoja la opcion que necesite \n\n"
                        + "1..........Suma \n"
                        + "2..........Resta\n"
                        + "3..........Multiplicacion\n"
                        + "4..........Division \n\n"
                        + "Cancelar para salir \n\n");
                switch(menu){
                    case "1":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
                        
                        JOptionPane.showMessageDialog(null, "El resultado es: "+c.suma(x, y));
                        break;
                    }
                    
                    case "2":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
                        
                        JOptionPane.showMessageDialog(null, "El resultado es: "+c.resta(x, y));
                        break;
                    }
                    
                    case "3":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
                        
                        JOptionPane.showMessageDialog(null, "El resultado es: "+c.multi(x, y));
                        break;
                    }
                    
                    case "4":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
                        
                        JOptionPane.showMessageDialog(null, "El resultado es: "+c.div(x, y));
                        break;
                    }
                    
                    
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Servidor no conectado"+e);
        }
    }
    
}
