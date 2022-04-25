package Mmoneymanagementsystem;

public class Genremusic extends PlayMusics {
	
	String[] musicgenre;
	
	public void setGenre(String[] musicgenre) {
		this.musicgenre = musicgenre;
	}
	
	public String[] getGenre() {
		return this.musicgenre;
	}
	
	public void PlaymusicData() {
		super.PlaymusicData();
		for(int i = 0;i <= 2;i++) {
			System.out.println(musicname[i]);
			System.out.println(musicname[i] + " " + "(" + musicgenre[i] + ")");
		}
	}
}
