package MusicPlayer;

import java.util.*;                    
public class Album {                                   //USER DEFINED CLASS ALBUM
	String albumName;
	String artistName;                                 //DECLARING VARIABLES
	String creationDate;
	ArrayList<Song> songList;                           //CREATING ARRAY LIST
	
	Album(String albumName, String artistName, String creationDate){                 //CONSTRUCTOR OF CLASS ALBUM
		this.albumName = albumName;
		this.artistName = artistName;
		this.creationDate = creationDate;
		songList = new ArrayList<>();
	}
	
	void insertSongInAlbum(Song song) {                            //CREATING A METHOD TO INSERT SONG IN ALBUM
		int flag = 0;
		for(Song s : songList) {                                  //ENHANCED FOR LOOP
			if(s.getTitle().equals(song.getTitle())) {
				System.out.println("Song is already present in the Album : )");            //CHECKING WHETHER SONG ALREADY EXISTS IN THE LIST 
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			songList.add(song);                      //IF SONG IS NOT PRESENT THEN ADDING THE SONG IN THE LIST
		}
		
	}
	
	void removeSongFromAlbum(Song song) {                     //METHOD TO REMOVE SONG FROM THE ALBUM
		int flag = 0;
		for(Song s : songList) {                              //ENHANCED FOR LOOP
			if(s.getTitle().equals(song.getTitle())) {
				songList.remove(song);
				System.out.println("Song deleted from the album ");                   //DELTETING THE SONG FROM THE ALBUM
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Song not found :(");                    //PRINTING SONG NOT FOUND IF THE SONG IN NOT IN THE LIST
		}
	}

	@Override
	public String toString() {                                     //INBUILT METHOD IN JAVA TO RETURN THE STRING 
		return "Album [albumName=" + albumName + ", artistName=" + artistName + ", creationDate=" + creationDate
				+ ", songList=" + songList + "]";
	}
	
	
}
