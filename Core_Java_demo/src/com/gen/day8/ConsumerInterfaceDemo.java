package com.gen.day8;

import java.util.ArrayList;
import java.util.function.Consumer;

/*A Consumer is a functional interface that accepts a single input and returns no output.
 * void accept(T t);
* default Consumer<T> andThen(Consumer<? super T> after);

 * */

class Item{
	private String itemName;
	private int price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(String itemName, int price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Item>  items = new ArrayList<>();
     items.add(new Item("chicken", 180));
     items.add(new Item("pizza",150));
     items.add(new Item("burger",70));
     items.add(new Item("chips", 50));
     
     Consumer<Item> con = (c)->System.out.println(c.getItemName().toUpperCase());
     items.forEach(con);
     
	}

}
