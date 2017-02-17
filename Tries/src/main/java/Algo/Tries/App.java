package Algo.Tries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
		File fileName = new File("Input/testCase2");

		Trie trie = new Trie();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			for (String line; (line = br.readLine()) != null;) {
				System.out.println(line);
				String[] in = line.split(" ");
				String op = in[0];
				String contact = in[1];

				if (op.equals("add")) {
					trie.insert(contact);
				} else if (op.equals("find")) {
					System.out.println(trie.countWordStartsWith(contact));
				}
			}
			
			trie.dfs(trie.root);
			trie.initFalse(trie.root);
			//trie.wordsFinderTraversal(trie.root);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
