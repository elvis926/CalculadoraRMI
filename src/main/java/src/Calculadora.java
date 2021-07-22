package src;
import java.rmi.*;
/**
 *
 * @author cocho
 */
public interface Calculadora extends Remote{
    public int div (int a, int b)throws RemoteException;
    public int suma (int a, int b)throws RemoteException;
    public int resta (int a, int b)throws RemoteException;
    public int multi (int a, int b)throws RemoteException;
    
}
