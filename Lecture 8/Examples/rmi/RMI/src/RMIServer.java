import java.net.*;
import java.rmi.*;

public class RMIServer {

	public static void main(String[] args) {
		try {
			RemoteUtilImpl impl = new RemoteUtilImpl();
			Naming.rebind("RMIServer", impl);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}