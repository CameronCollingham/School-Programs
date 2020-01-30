import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameReport {
	/**
	 * This program takes a CSV File of games and publishers as a input and outputs
	 * the number of games each publisher has released and how many platforms each
	 * game has
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		File f = new File(args[0]);
		List<Game> games = new ArrayList<Game>();
		Map<String, HashSet<String>> pubGame = new HashMap<>();
		Map<String, HashSet<String>> gamePlat = new HashMap<>();

		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				String lineTok[] = s.nextLine().split(",", -2);
				Game game1 = new Game(lineTok[0], lineTok[1], lineTok[2], lineTok[3]);
				games.add(game1);
				if (pubGame.containsKey(lineTok[1])) {
					pubGame.get(lineTok[1]).add(lineTok[0]);
				} else if (lineTok[1].compareTo("") != 0) {
					HashSet<String> temp = new HashSet<>();
					temp.add(lineTok[0]);
					pubGame.put(game1.getPublisher(), temp);
				}

				if (gamePlat.containsKey(lineTok[0])) {
					gamePlat.get(lineTok[0]).add(lineTok[3]);
				} else if (lineTok[0].compareTo("") != 0) {
					HashSet<String> temp = new HashSet<>();
					temp.add(lineTok[3]);
					gamePlat.put(game1.getGame(), temp);
				}

			}

			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		Collections.sort(games, new Comparator<Game>() {
			@Override
			public int compare(Game a, Game b) {
				return b.getPublisher().compareTo(a.getPublisher());
			}

		});

		System.out.println("Publisher Game Counts\n ===============");
		
		System.out.printLn("%15s %d", );
		for (Game g : games) {
			
			
		}

		Collections.sort(games, new Comparator<Game>() {
			@Override
			public int compare(Game a, Game b) {
				return b.getGame().compareTo(a.getGame());
			}

		});

		System.out.println("Game Platform Counts\n ===============");
		for (Game g : games) {

		}

	}

}
