package headfirst.iterator;

/**
 * Unifies the iteration between menu elements, using the Array element
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 29, 2013
 */
public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}


}