package QSpider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NotepadRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fi= new FileInputStream("./file_data/CommonData.property");
		Properties p= new Properties();
		p.load(fi);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PWD = p.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);

	}

}
