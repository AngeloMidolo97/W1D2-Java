
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] ultime5Chiamate = {
				{"1234", "20"},
				{"4648", "2"},
				{"6574", "15"},
				{"8696", "25"},
				{"2436", "10"}
		};
		
		Sim s1 = new Sim("1234", 10, ultime5Chiamate);
		
		s1.stampaDati();
	}

}
