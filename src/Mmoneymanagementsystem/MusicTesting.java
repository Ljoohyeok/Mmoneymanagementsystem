package Mmoneymanagementsystem;

public class MusicTesting {

	public static void main(String[] args) {
		Genremusic musics = new Genremusic();
		
		String[] musicname = {"���亥�� ���", "��� �޽þ�", "��ߵ��� ���"};
		musics.setter(musicname);
		
		String[] genre = {"�����", "�����丮��", "���ְ�"};
		musics.setGenre(genre);
		
		System.out.println("#### MusicPlayList ####");
		musics.PlaymusicData();
	}
}
