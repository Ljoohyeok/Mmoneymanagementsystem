package Mmoneymanagementsystem;

public class MusicTesting {

	public static void main(String[] args) {
		Genremusic musics = new Genremusic();
		
		String[] musicname = {"베토벤의 운명", "헨델의 메시아", "비발디의 사계"};
		musics.setter(musicname);
		
		String[] genre = {"교향곡", "오라토리오", "협주곡"};
		musics.setGenre(genre);
		
		System.out.println("#### MusicPlayList ####");
		musics.PlaymusicData();
	}
}
