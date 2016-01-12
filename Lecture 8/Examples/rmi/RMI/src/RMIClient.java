import java.rmi.*;

public class RMIClient {

	public static void main(String[] args) {
		try {
			String serverURL = "rmi://" + args[0] + "/RMIServer";
			RemoteUtil remoteServer = (RemoteUtil) Naming.lookup(serverURL);

			System.out.println(remoteServer.getMessage());
			System.out.println(remoteServer.getFibonacci(5));
		} catch (Exception e) {
			System.out.println("Exception:  " + e);
		}
	}
}