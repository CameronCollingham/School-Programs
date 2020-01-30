
public class Game {

	public final String game;
	public final String publisher;
	public final String year;
	public final String platform;
	
	public Game(String game, String publisher, String year, String platform) {
		this.game = game;
		this.publisher = publisher;
		this.year = year;
		this.platform = platform;
	}
	
	public String getGame() {
		return this.game;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getYear() {
		return this.year;
	}
	
	public String getPlatform() {
		return this.platform;
	}
	
}
