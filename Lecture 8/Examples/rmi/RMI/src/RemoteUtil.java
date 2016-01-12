
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteUtil extends Remote{

   public String getMessage() throws RemoteException;
   public int getFibonacci(int num)
      throws RemoteException;
}