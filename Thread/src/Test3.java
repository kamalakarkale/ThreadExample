import java.util.Properties;
import java.util.UUID;

public class Test3 {

	public static void main(String[] args) {
		
		
	/*	UUID uuid= UUID.randomUUID();
		System.out.println(uuid.toString());*/
		Properties properties = System.getProperties();
		properties.list(System.out);
	}

}
