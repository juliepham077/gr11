package gr11programming;

public class Student {
		// declare variables
		String first, last, id, login;
		
		Student(String first, String last, String id, String login) {
			this.first = first;
			this.last = last;
			this.id = id;
			this.login = login;
		}
		
		//Getter methods
		String getFirst() {
			return first;
		}
		
		String getLast() {
			return last;
		}
		
		String getId( ) {
			return id;
		}

		String getLogin( ) {
			return login;
		}
}
