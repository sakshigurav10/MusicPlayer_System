package MusicPlayer;

public class Doubly_trial {                             //USER DEFINED CLASS
	public static void main(String[] args) {
		DoublyLL d = new DoublyLL();                         //CREATING OBJECT OF Doubly_trial
		Song s = new Song("Mood", "5:00", "Arijit");
		Song s1 = new Song("Fantasy", "4:00", "Mona");
		Song s2 = new Song("Chisel", "6:00", "Taylor");
		
		d.add(s);                         //ADDING SNGS AND PRINTING IT
		d.add(s1);
		d.add(s2);
		d.print();
		
		System.out.println(d.getHead().songInfo);                      //PRINTS THE INFORMATION OF THE SONG
	}
	
}

