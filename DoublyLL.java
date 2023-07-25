package MusicPlayer;

public class DoublyLL {                       //CREATING USER DEFINED CLASS DOUBLY LL 
	Node head;
	int count;                        //DECLARING COUNT VARIABLE
	
	int size() {                           //METHOD TO RETURN THE SIZE OF PLAYLIST 
		return count;
	}
	
	boolean isEmpty() {                       //METHOD TO CHECK WHETHER PLAYLIST IS EMPTY
		return size() == 0;
	}
	
	Node getHead() {                           //METHOD TO RETURN HEAD
		return head;
	}
	
	void add(Song song) {                            //METHOD TO ADD THE SONG
		if(isEmpty()) {                            
			head = new Node(song);                   
			head.next = null;
			head.prev = null;
			count++;
		}else {           
			Node temp = new Node(song);
			head.prev = temp;
			temp.next = head;
			head = temp;
			count++;
		}
	}
	
	void print() {                                   //METHOD TO DISPLAY THE SONGS
        Node ptr1 = head;                            
        if(head == null) {  
            System.out.println("List is empty");              //CHECKING FOR THE CONDITION WHETHER THE PLAYLIST IS EMPTY OR NOT
            return;  
        }
        while(ptr1 != null)                                   //LOOP TILL HEAD IS NOT NULL
           {  
            System.out.print("Song Name : "+ptr1.songInfo.title + ", ");                  //DISPLAYING THE DETAILS OF THE SONG
            System.out.print("Duration : "+ptr1.songInfo.duration + ", ");
            System.out.println("Singer Name : "+ptr1.songInfo.singerName + " ");
            ptr1 = ptr1.next;  
            }  
        System.out.println();  
        } 
}

