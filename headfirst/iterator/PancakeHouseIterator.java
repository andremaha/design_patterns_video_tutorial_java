package headfirst.iterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

	ArrayList items;
	int position;

	public PancakeHouseIterator(ArrayList items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		MenuItem menuItem = (MenuItem)items.get(position);
		position = position + 1;
		return menuItem;
	}

}
