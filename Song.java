package MusicPlayer;

public class Song {                                    //USER DEFINED CLASS SONG
	String title;
	String duration;                                      //DECLARING VARIABLES IN CLASS SONG
	String singerName;
	
	Song(String title, String duration, String singerName){                       //CONSTRUCTOR OF THE CLASS SONG
		this.title = title;
		this.duration = duration;
		this.singerName = singerName;
	}
	
	String getTitle() {                                       //METHOD TO RETURN TITLE OF THE SONG 
		return title;
	}
	
	String getDuration() {                                     //METHOD TO RETURN THE DURATION OF THE SONG
		return duration;
	}
	
	String getSingerName() {                                   //METHOD TO RETURN THE SINGER NAME
		return singerName;
	}

	@Override
	public String toString() {                                 //IN BUILT JAVA METHOD TO RETURN STRING
		return "Song [title=" + title + ", duration=" + duration + ", singerName=" + singerName + "]";
	}
	
	
}
