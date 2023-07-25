package MusicPlayer;

public class Node {                          //USER DEFINED CLASS NODE
	Song songInfo;
	Node next;                            //DECLARING VARIABLES 
	Node prev;
	
	Node(Song songInfo){                          //METHOD TO INITIALIZE SONG INFO 
		this.songInfo = songInfo;
	}
}
