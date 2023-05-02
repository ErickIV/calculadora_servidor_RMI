import java.rmi.Remote;

/**
 * Interface dos métodos remotos.
 * 
 * @author Erick
 */
public interface Calculadora extends Remote {

    public int adicao(int a, int b) throws java.rmi.RemoteException;

    public int subtracao(int a, int b) throws java.rmi.RemoteException;

    public int produto(int a, int b) throws java.rmi.RemoteException;

    public double divisao(int a, int b) throws java.rmi.RemoteException;

}