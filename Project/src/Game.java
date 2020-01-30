
public class Game {

	public String game;
	public String publisher;
	public String year;
	public String platform;
	
	public Game(String game, String publisher, String year, String platform) {
		this.game = game;
		this.publisher = publisher;
		this.year = year;
		this.platform = platform;
	}
	
	public void setGame(String game) {
		this.game = game;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setPlatform(String platform) {
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
