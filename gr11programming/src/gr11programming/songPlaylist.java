package gr11programming;

import java.util.ArrayList;
import java.util.Scanner;
public class songPlaylist {

	// declare booklist as a global variable
	static ArrayList<songs> playlist = new ArrayList<songs>();

	public static void main(String[] args) {

		
		boolean run = true;
		while (run) {
			Scanner input = new Scanner(System.in);
			System.out.print("""
					[1] add a song
					[2] Display play list
					[3] remove a song
					[4] Quit
					Choose Option: """);
			int option = input.nextInt();
			switch(option) {
				case 1:	
					String title, artist, year;
					System.out.print("Enter the title: ");
					title = input.next();
					System.out.println("Enter artist name: ");
					artist = input.next();
					System.out.println("Enter date of release: ");
					year = input.next();
		
					songs info = new songs(title, artist, year);
					playlist.add(info);
					break;
				case 2: 
					printList();
					break;
				case 3:
					System.out.print("which song would you like to remove?");
					int num = input.nextInt();
					num -=1;
					playlist.remove(num);
					break;
				case 4:
					run = false;
					break;
					
			}		
		}
	}

	// method of printing the array
	static void printList() {
		int songNum = 1;
		for (songs info : playlist) {
			System.out.println(songNum + ". " + info.getTitle() + " by " + info.getArtist() + " - " + info.getYear());
			songNum++;
		}
		
	}
		
}


