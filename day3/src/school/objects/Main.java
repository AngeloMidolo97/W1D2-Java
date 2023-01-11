package school.objects;

public class Main {
	
	static Student[] students;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students = new Student[] {
				new Student("Angelo", "Midolo", new double[] {5, 6, 7}, 'm'),
				new Student("Gerardo", "Di Letizia", new double[] {8, 9, 2}, 'm'),
				new Student("Giulia", "Bianchi", new double[] {5, 8, 5}, 'f'),
				new Student("Flavio", "Cirillo", new double[] {6, 3, 9}, 'm'),
				new Student("Maria", "Rossi", new double[] {7, 6, 9}, 'f')
				};
		
		students[0].printAvgVote();
		stampaMigliore();
		stampaMiglioreByGender('m');
		stampaMiglioreByGender('f');
	}
	
	static void stampaMiglioreByGender(char gender) {
		Student best = new Student("", "", new double[] {0}, gender);
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote() && students[i].genere == gender) {
				best = students[i];
			}
		}
		
		String message = "";
		
		switch (best.genere) {
			case 'm':
				message += "Lo studente ";
				break;
			case 'f':
				message += "La studentessa ";
				break;
			default :
				System.out.println("ERRORE");
		}
		
		if(!message.equals("")) {
			//System.out.println(message + " migliore è: " + best.getFullname() + " con la media di: " + best.getAvgVote());
			System.out.printf("%s migliore è: %s con la media di: %.1f %n", message, best.getFullname(), best.getAvgVote());
		}
	}
	
	static void stampaMigliore() {
		Student best = students[0];
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote()) {
				best = students[i];
			}
		}
		System.out.println("Lo studente migliore è: " + best.getFullname());
	}

}


