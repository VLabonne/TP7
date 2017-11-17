
public class Pile<T> {
	private T data;
	private Pile<T> next;
	
	public Pile() {
		}
	private Pile(T data, Pile<T> next){
		this.data = data;
		this.next = next;
	}
	public void push(T data) {
		 Pile<T> pile = new Pile(data, this.next);
		 next = pile;
	}
	public T peek() {
		if (next!=null) {
			return next.data;
		}
		else {
			return null;
		}
	}
	public T pop() {
		if (next!=null) {
			T a = next.data;
			this.next = next.next;
			return a;
			
			
		}
		else {
			return null;
		}
	}
	public int count() {
		int k=0;
		Pile<T> c = next;
		while(c!=null) {
			c = c.next;
			k++;
		}
		return k;
	}
	public int countrec() {
		if (next==null) return 0;
		else return 1+next.countrec();
	}
	public int countgolf() {
		return (next==null)? 0 : 1+next.countgolf();
	}
}