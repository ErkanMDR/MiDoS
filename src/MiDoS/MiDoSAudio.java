package MiDoS;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Random;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MiDoSAudio {
	static Player player = null;

	public static void play(String rawfile) {
		try {
			// F:\\Acrux Workspace\\BGW's\\MiDoS Twitter\\
			FileInputStream fis = new FileInputStream("raw//" + rawfile
					+ ".mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			player = new Player(bis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			player.play();
		} catch (JavaLayerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void playx(String rawfilex) {
		try {
			// F:\\Acrux Workspace\\BGW's\\MiDoS Twitter\\
			FileInputStream fis = new FileInputStream("raw//goksah//"
					+ rawfilex + ".mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			player = new Player(bis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			player.play();
		} catch (JavaLayerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void playGoksahOkey() {
		try {
			Random rand = new Random();
			int n = rand.nextInt(12) + 1;

			FileInputStream fis = new FileInputStream("raw//goksah//ok" + n
					+ ".mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			player = new Player(bis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			player.play();
		} catch (JavaLayerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void playGoksahError() {
		try {
			Random rand = new Random();
			int n = rand.nextInt(3) + 1;

			FileInputStream fis = new FileInputStream("raw//goksah//err" + n
					+ ".mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			player = new Player(bis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			player.play();
		} catch (JavaLayerException e) {
			System.out.println(e.getMessage());
		}
	}

}
