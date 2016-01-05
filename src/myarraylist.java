import java.util.ArrayList;

public class myarraylist {

	private ArrayList<Object> arr;

	public myarraylist() {
		arr = new ArrayList<>();
	}

	void add(Object obj) {
		arr.add(arr.size(), obj);
	}

	Object remove() {
		Object temp = arr.get(0);
		arr.remove(0);
		return temp;
	}

	ArrayList<Object> disp() {
		return arr;
	}
}
