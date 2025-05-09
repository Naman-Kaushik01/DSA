package array1D;

import java.util.Scanner;

public class LinearSearch {
	public static int Search(int key[],int search) {
		for(int i=0;i<key.length;i++) {
			if(key[i]==search) {
				return i;
			}
		}
		return -1;
	}
	
	public static String searchMenu(String menu[],String item) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i].equalsIgnoreCase(item)) {
				return item;
			}
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		int key[]= {4,6,7,8,15,3,18};
		int search=8;
		
		String menu[]= {"Pizza","Burger","Sandwitch","Aaloo Paratha"};
		Scanner scanner= new Scanner(System.in);
		System.out.println("What are you searching for ?");
		String item=scanner.next();
		
		String ItemAvlbl =searchMenu(menu,item);
		if(ItemAvlbl==item) {
			System.out.println("Yes "+item+" is availaible");
		}else {
			System.out.println("Not Availaible");
		}
		
		
		System.out.println("Your element is at " + Search(key,search));
		
	}

}
