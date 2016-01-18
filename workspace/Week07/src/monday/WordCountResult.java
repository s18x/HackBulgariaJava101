package monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class WordCountResult {

	private int numberOfWords;
	private int numberOfCharacters;
	private int numberOfLines;

	private WordCountResult(int w, int c, int l){
		this.numberOfWords = w;
		this.numberOfCharacters = c;
		this.numberOfLines = l;
	}

	public WordCountResult worlCount(Path path) {
		
		return null;
	}
	
	public WordCountResult worlCount(File file) throws IOException {
		BufferedReader buf = new BufferedReader(new FileReader(file));
		String line;
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;

		while ((line = buf.readLine()) != null) {
			lineCount++;
			charCount += line.length();
			boolean word = false;
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i)) && i != line.length() - 1) {
					word = true;
				}
				else if (!Character.isLetter(line.charAt(i)) && word) {
					wordCount++;
					word = false;
				}
				else if (Character.isLetter(line.charAt(i)) && i == line.length()) {
					wordCount++;
				}
			}
		}
		buf.close();
		return new WordCountResult(wordCount, charCount, lineCount);
	}

}
