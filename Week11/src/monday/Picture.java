package monday;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Picture {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://organicthemes.com/demo/adventure/files/2013/08/featured_post_03.jpg");
		InputStream in = new BufferedInputStream(url.openStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1 != (n = in.read(buf))) {
		   out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();
		FileOutputStream fos = new FileOutputStream("/home/stefan/Desktop/Pictures/picture.jpg");
		fos.write(response);
		fos.close();

	}

}
