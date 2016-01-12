import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		String baseName = "MyResources";
		try {
			ResourceBundle rb = ResourceBundle.getBundle(baseName,
					Locale.ENGLISH);

			String key = "hello";
			String greeting = rb.getString(key); // Hello
			System.out.println(greeting);
			key = "bye";
			greeting = rb.getString(key); // Bye-Bye
			System.out.println(greeting);

			// Get the resource bundle for a specific locale
			rb = ResourceBundle.getBundle(baseName, Locale.FRENCH);

			key = "hello";
			greeting = rb.getString(key); // Bonjour
			System.out.println(greeting);
			key = "bye";
			greeting = rb.getString(key); // Au Revoir
			System.out.println(greeting);
		} catch (MissingResourceException e) {
			e.printStackTrace();
			// The resource bundle cannot be found or
			// the key does not exist in the resource bundle
		}

	}

}
