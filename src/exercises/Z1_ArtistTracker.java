package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Z1_ArtistTracker {

	private Z1_Artist[] allArtists;

	/*
	 * create a getter for instance field allArtist
	 * 
	 */
	public Z1_Artist[] getAllArtists() {
		return allArtists;
	}

	/*
	 * This method should print all artist info using display Method
	 * 
	 */
	public void displayAllArtistsInfo() {
		for (int i = 0; i < allArtists.length; i++) {
			allArtists[i].displayInfo();
		}
	}

	/*
	 * This method will return count of artists that have more than 100 song as int
	 * 
	 */
	public int getTheCountOfArtistHaveMorethan100Song() {
		int count = 0;
		for (int i = 0; i < allArtists.length; i++) {
			if (allArtists[i].getSongCount() > 100) {
				count++;
			}
		}
		return count;
	}

	/*
	 * This method will print Names Of Artists who has song count match passed
	 * parameter value n
	 * 
	 */
	public void printNamesOfArtistsHave_N_Song(int n) {
		/// Your Code Goes Here
		for (int i = 0; i < allArtists.length; i++) {
			if (allArtists[i].getSongCount() >= n) {
				System.out.println(allArtists[i].getName());
			}
		}
	}

	/*
	 * this method will calculate total number of song from all artists
	 * 
	 */
	public long getTotalSongCount() {
		int count = 0;
		for (int i = 0; i < allArtists.length; i++) {
			count += allArtists[i].getSongCount();
		}
		return count;
	}

	public int getArtistsSongCount(String name) {
		int songCount=0;
		for (Z1_Artist artist : allArtists) {
			if(artist.getName().equalsIgnoreCase(name)) {
				songCount = artist.getSongCount();
			}
		}
		return songCount;
	}

	public boolean checkIfArtistAlreadyExists(Z1_Artist target) {
		boolean exist =false;
		for (Z1_Artist artist : allArtists) {
			if(artist.getName().equalsIgnoreCase(target.getName())) {
				exist = true;
			}
		}
		return exist;
	}

	public Z1_Artist findRandomArtists() {
		Random rd = new Random();
		int randomNumber = rd.nextInt(allArtists.length);
		Z1_Artist randomArtist = allArtists[randomNumber];
		return randomArtist;
	}

	/*
	 * Purpose of this method is loading all the Artists from text file
	 * ./X_ArtistSongCount.txt in project to the allArtists instance field Once
	 * ArtistTracker object is created you call call to load Artists
	 * 
	 * DO NOT CHANGE
	 */

	public void loadAllArtists() {

		String artistFile = "./ArtistSongCount.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
//		try {
//			allArtists = Files.lines(Paths.get(artistFile)).map(eachline -> {
//				String[] artistDetails = eachline.split(cvsSplitBy);
//				X_Artist artist = new X_Artist();
//				artist.setName(artistDetails[0]);
//				artist.setSongCount(Integer.parseInt(artistDetails[1]));
//				return artist;
//			})
//					.toArray(size -> new Artist[size]);
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	// read array with bufferedReader
	public static void readArray4() throws FileNotFoundException {
		FileReader fileName = new FileReader("X_ArtistSongCount.txt");
		BufferedReader br = null;
		String line;
		ArrayList<String> list = new ArrayList<String>();

		try {
			Files.lines(Paths.get("X_ArtistSongCount.txt")).forEach(System.out::println);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " File not found");
		}
	}

	// read array with bufferedReader
	public static void readArray3() throws FileNotFoundException {
		FileReader fileName = new FileReader("X_ArtistSongCount.txt");
		BufferedReader br = null;
		String line;
		ArrayList<String> list = new ArrayList<String>();

		try {
			br = new BufferedReader(fileName);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " File not found");
		}

		try {
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + " Error");
		}
		System.out.println(list);
	}

	// read an array
	public void readArray() {
		try {
			FileReader fr = new FileReader("X_ArtistSongCount.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str + "\n");
			}
			br.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

	// read array with arraylist
	public static void readArray2() throws FileNotFoundException {
		Scanner keyboard = new Scanner(new File("X_ArtistSongCount.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (keyboard.hasNextLine()) {
			list.add(keyboard.nextLine());
		}
		System.out.println(list);
	}

	// write an array will delete whatever is in the doc already
	public void writeArray() {
		try {
			FileWriter fw = new FileWriter("X_ArtistSongCount.txt");
			PrintWriter pw = new PrintWriter(fw);

			pw.println("Lola");
			pw.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

}
