package monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.Map;

public class FileUtils implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static FileUtils instance = null;
	private FileUtils() {
		
	}
	
	public static FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}
	
	public String readFrom(File file) throws IOException, ClassNotFoundException {
		/*FileInputStream fileIn = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		String read = (String) in.readObject();
		in.close();
		fileIn.close();
		return read;*/
		BufferedReader buf = new BufferedReader(new FileReader(file));
		String line;
		StringBuilder sb = new StringBuilder();
		
		while ((line = buf.readLine()) != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
		}
		buf.close();
		return sb.toString();
	}
	
	public String readFrom(Path path) throws IOException, ClassNotFoundException {
		return readFrom(path.toFile());
	}
	
	public void writeFile(String content, File file) throws IOException {
		try (BufferedWriter buf = new BufferedWriter(new FileWriter(file))) {
			buf.write(content);
		}
	}
	
	public Map<String, String> parseProperties() {
		return null;
	}

}
