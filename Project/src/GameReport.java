import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import unl.cse.Team;

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
		Game games[] = new Game[];

		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {

			}

			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		Arrays.sort(games, new Comparator<Game>() {
			@Override
			public int compare(Game a, Game b) {
				return b.getPublisher().compareTo(a.getPublisher());
			}

		});

		System.out.println("Publisher Game Counts\n ===============");

		for (Game g : games) {

		}

		Arrays.sort(games, new Comparator<Game>() {
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
