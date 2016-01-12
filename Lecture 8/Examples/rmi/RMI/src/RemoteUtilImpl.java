import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.ZonedDateTime;

public class RemoteUtilImpl extends UnicastRemoteObject implements RemoteUtil {

	public RemoteUtilImpl() throws RemoteException {
	}

	@Override
	public String getMessage() throws RemoteException {
		return "Hi! from Server \n Today is " + ZonedDateTime.now();
	}

	@Override
	public int getFibonacci(int num) throws RemoteException {
		if (num == 0 || num == 1)
			return num;
		int a, b, c, count;
		a = 0;
		b = 1;
		c = a + b;
		count = 2;
		while (count <= num) {
			c = a + b;
			a = b;
			b = c;
			count++;
		}
		return c;
	}
}