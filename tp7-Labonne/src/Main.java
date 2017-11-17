
public class Main {

	public static void main(String[] args) {
		Pile<Integer> pile = new Pile<Integer>();
		pile.push(5);
		pile.push(7);
		pile.push(9);
		
		System.out.println(pile.count());
		System.out.println(pile.pop());
		System.out.println(pile.peek());
		System.out.println(pile.count());
		
	}

}
