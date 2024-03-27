package lab33;

public interface Mycollection {
	
	void add(Object elem);
	
	void remove(Object elem);
	
	void clear();
	
	void resize(int n);
	
	void setSize(int n);
	
	int getSize();
	
	int find();
	
	boolean contains(Object elem);
	
	boolean isEmpty();
	
	boolean equals(Object o);
	
}
