package exercises;

public class Z1_AppRunner {
	public static void main(String[] args) {
		Z1_ArtistTracker tracker = new Z1_ArtistTracker();
		tracker.loadAllArtists();
		
		int printCount = tracker.getTheCountOfArtistHaveMorethan100Song();
		System.out.println(printCount);
	}
}
