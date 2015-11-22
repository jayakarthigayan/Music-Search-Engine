import java.io.Serializable;
import java.util.ArrayList;

public class SongData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getUrl() {
		return url;
	}

	public void setUrl(ArrayList<String> url) {
		this.url = url;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbumArt() {
		return albumArt;
	}

	public void setAlbumArt(String albumArt) {
		this.albumArt = albumArt;
	}

	private String title;
	private ArrayList<String> url;
	private String album;
	private String artist;
	private String year;
	private String genre;
	private String albumArt;
	
	public SongData(String title, String url, String album, String artist, String year, String genre, String albumArt){
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
		this.albumArt = albumArt;
		this.url = new ArrayList<>();
		this.url.add(url);
	}
			
}