package MusicPlayer;

import java.io.File;                              //IMPORTING JAVA CLASSES
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {                                      //USER DEFINED CLASS MAIN
static Scanner scanner;
 public static void MainPlaymusic(String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
  
	 scanner = new Scanner(System.in);
  
  File file = new File(filePath);                               //IN BUILT FILE CLASS                   
  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
  Clip clip = AudioSystem.getClip();                           //IN BUILT CLIP CLASS
  clip.open(audioStream);
  
  String response = "";
  
  while(!response.equals("Q")) {
   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");                //ACCEPTING RESPONSE FROM THE USER
   System.out.print("Enter your choice: ");
   
   response = scanner.next();
   response = response.toUpperCase();
   
   switch(response) {                           
    case ("P"): clip.start();                        //IF USER ENTERS P : PLAY THE SONG 
    break;
    case ("S"): clip.stop();                         //IF USER ENTERS S : STOP THE SONG
    break;
    case ("R"): clip.setMicrosecondPosition(0);         //IF USER ENTERS R : REPLAY THE SONG 
    break;
    case ("Q"): clip.close();                          //IF USER ENTERS Q : QUIT THE SONG
    break;
    default: System.out.println("Not a valid response");               //ELSE NOT A VALID RESPONSE
   }
   
  }
 }
}

