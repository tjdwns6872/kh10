package oop.method7;

public class Melon {
	String title;
	String singer;
	String album;
	int play;
	int like;
	String best = "(베스트)";
	String popularity = "(인기곡)";
	
	void setting(String title, String singer, String album, int play, int like) {
		this.title = title;
		this.singer = singer;
		this.album = album;
		this.play = play;
		this.like = like;
	}
	void print() {
		double rank = this.play*2+(this.like/2);
		System.out.println(" <음원차트> ");
		if(play > 100000) {
			System.out.println("제목"+best+" : "+title);
		}else if(like > 100000) {
			System.out.println("제목"+popularity+" : "+title);
		}
		else {
			System.out.println("제목 : "+title);
		}
		System.out.println("재생수 : "+play);
		System.out.println("가수 : "+singer);
		System.out.println("앨범 : "+album);
		System.out.println("좋아요 수 : "+like);
		System.out.println("랭킹 점수 : "+rank);
	}
}
