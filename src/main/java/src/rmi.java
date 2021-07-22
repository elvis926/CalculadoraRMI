
package src;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author cocho
 */
public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi () throws RemoteException{
        int a,b;
    }
    public int suma(int a, int b) throws RemoteException{
        return a+b;
    }
    public int resta(int a, int b) throws RemoteException{
        return a-b;
    }
    public int multi(int a, int b) throws RemoteException{
        return a*b;
    }
    public int div(int a, int b) throws RemoteException{
        return a/b;
    }
}
