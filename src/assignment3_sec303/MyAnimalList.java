package assignment3_sec303;

/**
 * A collection is referred to as a data structure that can hold references to other objects.
 * This program is to practice List, LinedLists, ListIterator and Set.
 * With given two animals arrays, it shows merging two arrays with LinkedList,
 * changing letters to upper case, removing, and sorting. 
 * @author Jungsoo (Cairon) Han
 * @see Package Assignment3: MyAnimallList.java
 */
import java.util.*;

public class MyAnimalList {

	/**
	 * Starting program 
	 * @param args String array
	 */
	public static void main(String[] args) {

		String[] animals = { "dog", "cat", "lion", "eagle", "monkey", "elephant" };
		String[] animals2 = { "cow", "dolphin", "zebra", "dog", "goat", "snake" };

		// add two animal arrays to LinkedList
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(animals));
		LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(animals2));		

		// add list2 to list1 with addAll method and print
		list1.addAll(list2);
		list2 = null;		
		
		System.out.println("21F CST8284");
		System.out.println("OUTPUT FILE FOR ASSIGNMENT 3");
		
		printList(list1);	
		
		// print list that is changed to uppercase
		System.out.printf("%nDisplaying names of animals in uppercase letters...");
		converToUpperCase(list1);		
		printList(list1);
		
		// print list after delete range from 4 to 6
		System.out.printf("%nDeleting elements 4 to 6...");		
		removeItems(list1, 4, 7);

		
		// print current animals
		System.out.printf("%nHere is the current list of animals...");	
		printList(list1);		
		
		// print reversed list
		System.out.printf("%nReversed List: \n");
		printReversedList(list1);
		printList(list1);

		// print alphabetically sorted list
		System.out.printf("%nSorted animals in alphabetical order... ");
		alphabeticalOrder(list1);
		printList(list1);
		
		// print list without duplication
		System.out.printf("%nRemoving duplicate animals...\n");
		printNonDuplicates(list1);

	}

	/**
	 * This method to print LinkedList with for loop
	 * If LinkedList just print, it shows with parenthesis.
	 * Therefore, this method uses for loop. 
	 * @param list LinkedList String array
	 */
	public static void printList(LinkedList<String> list) {
		System.out.printf("\nList is: \n");
		
		for(String printList : list) {
		System.out.printf("%s ", printList);
		}
		System.out.println();
	}

	/**
	 * This method to to change any letter to upper case.
	 * An Iterator is an object that can be used to loop through collections. 
	 * @param list LinkedList String array
	 */	
	public static void converToUpperCase(LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String animalList = iterator.next();
			iterator.set(animalList.toUpperCase());
		}
	}
	
	/**
	 * This method to to change any letter to upper case.
	 * An Iterator is an object that can be used to loop through collections. 
	 * @param list LinkedList String array
	 * @param from Integer type for starting index number list
	 * @param to Integer type for ending index number of list
	 */
	public static void removeItems(LinkedList<String> list, int from, int to) {
		list.subList(from, to).clear();
		
		System.out.printf("\nList is: \n");
		for(String printList : list) {
		System.out.printf("%s ", printList);
		} 
		System.out.println();
	}
	
	/**
	 * This method to reverse list in LinkedList
	 * by using iterator.hasPrevious method. 
	 * @param list LinkedList String array
	 */	
	public static void printReversedList(LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
		System.out.println();
	}
	
	/**
	 * This method to sort list alphabetically.
	 * Collections.sort has the sorting function. 
	 * @param list LinkedList String array
	 */	
	public static void alphabeticalOrder(LinkedList<String> list) {
		Collections.sort(list);
	}
	
	/**
	 * This method to delete duplicated letters. To do that,
	 * this method set a new LinkedList by using Set Collection that
	 * is not allow duplication in list.
	 * @param list LinkedList String array
	 */	
	public static void printNonDuplicates(LinkedList<String> list) {
        Set<String> hashSet = new LinkedHashSet(list);
        LinkedList<String> listWithoutDuplicates = new LinkedList(hashSet);
        
        System.out.print("Non-duplicates are: ");
		for(String printList : listWithoutDuplicates) {
		System.out.printf("%s ", printList);
		} 
	}	

}
