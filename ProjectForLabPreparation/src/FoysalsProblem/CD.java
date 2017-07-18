package FoysalsProblem;

public class CD extends Item {
	private String artist;
	private String album;

	public CD(String title, double Ptime, String Art, String Album) {
		super(title, Ptime);
		this.artist = Art;
		this.album = Album;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	

	public String toString() {
		return (super.toString() + "Artist: " + artist + "\n" + "Album: " + album + "\n");
	}
}