package me.Belogron.Automata;

public class Test {

	public static void main(String[] args) {
		AutomatonSimulator as = new AutomatonSimulator();
		
		State a = new State("Hund friedlich");
		State b = new State("Hund sauer");
		State c = new State("Hund wütend");
		a.addTransition(b, "k", "Wuff!");
		b.addTransition(a, "s", "Schwanzwedel!");
		b.addTransition(c, "k", "Wuff Wuff!");
		c.addTransition(b, "s", "Wuff!");
		
		as.addState(a);
		as.addState(c);
		as.addState(b);
		
		as.setStartingState(a);
		
		try {
			System.out.println("-----------------------");
			System.out.println("Current state:" + as.getCurrentState().getName());
			System.out.println(as.input("k"));
			System.out.println("Current state:" + as.getCurrentState().getName());
			System.out.println("-----------------------");
			
			System.out.println("-----------------------");
			System.out.println("Current state:" + as.getCurrentState().getName());
			System.out.println(as.input("k"));
			System.out.println("Current state:" + as.getCurrentState().getName());
			System.out.println("-----------------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
