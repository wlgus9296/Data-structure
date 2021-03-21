import java.util.NoSuchElementException;
public class ArrList <E> {
	private E a[];
	private int size;
	
	public ArrList() {
		a = (E[]) new Object[1];
		size = 0;
	}
	public boolean isEmpty() {return size == 0;}
	
	public void insertLast(E newltem) {
		if(size == a.length)
			resize(2*a.length);
		a[size++]=newltem;
	}
	
	public void insert(E newltem, int k) {
		if(size == a.length)
			resize(2*a.length);
		for (int i=size-1; i >= k; i--) a[i+1]=a[i];
				a[k] = newltem;
				size++;
	}
	public E delete(int k) {
		if (isEmpty())
			E item = a[k];
		for(int i=k; i<size; i++) a[i] = a[i+1];
		size--;
		if(size > 0 && size == a.length/4)
			resize(a.length/2);
		return item;
	}
	public E peek(int k) {
		if(isEmpty()) throw new NoSuchElementException();
			return a[k];
	}
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i=0; i<size; i++)
			t[i] = a[i];
		a = (E[]) t;
	}
	public void print() {
		if(isEmpty())
			System.out.print("�迭�� �������.");
		else
			for(int i=0; i<a.length; i++) System.out.print(a[i]+"Wt ");
		System.out.println();
	}

}
