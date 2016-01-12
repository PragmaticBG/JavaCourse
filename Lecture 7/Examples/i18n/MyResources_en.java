import java.util.Enumeration;
import java.util.ResourceBundle;

public class MyResources_en extends ResourceBundle {

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object handleGetObject(String key) {
		if (key.equals("hello")) {
			return "Hello";
		}
		if (key.equals("bye")) {
			return "Bye-Bye";
		}
		return null;

	}

}
