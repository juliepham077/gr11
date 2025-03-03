package gr11programming;
class songs {

	// declare variables
	String title;
	String artist;
	String year;

	songs(String title,String artist,String year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	String getTitle() {
		return title;
	}
	
	String getArtist() {
		return artist;
	}
	
	String getYear( ) {
		return year;
	}
}