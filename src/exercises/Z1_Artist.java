package exercises;

public class Z1_Artist {

	private String name;
	private int songCount;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSongCount() {
		return songCount;
	}
	
	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}
	
	public void displayInfo() {
		System.out.println("Artist name: " + name + ", Song count: " + songCount);
	}
}
