package com.linkedlist;

public class LinkedListDSMain {
	public static void main(String[] args)
	{

		//	    public static void main(String[] args)
		LinkedListService<Integer>linkedListObj1 = new LinkedListService<Integer>(20);
		System.out.println("Create a linked list using add method");
		linkedListObj1.add(56);
		linkedListObj1.add(30);
		linkedListObj1.add(70);
		linkedListObj1.display();
		System.out.println("Create a linked list using append method");
		LinkedListService<Integer>linkedListObj2 = new LinkedListService<Integer>(20);
		linkedListObj2.append(56);
		linkedListObj2.append(30);
		linkedListObj2.append(70);
		linkedListObj2.display();
		System.out.println("Insert a node 30 between 56 and 70");
		LinkedListService<Integer>linkedListObj3 = new LinkedListService<Integer>(20);
		linkedListObj3.append(56);
		linkedListObj3.append(70);
		linkedListObj3.insertAfter(linkedListObj3.head,30);
		linkedListObj3.display();
		System.out.println("Delete the first element in the linked list");
		linkedListObj3.delete();
		linkedListObj3.display();
		System.out.println("Delete the last element in the linked list");
		linkedListObj2.popLast();
		linkedListObj2.display();
		System.out.println("Search for a node with key 30 in the linked list");
		linkedListObj1.search(30);
		System.out.println("Insert a node 40 after 30 in the linked list");
		linkedListObj1.insertAfterNode(30,40);
		linkedListObj1.display();
		System.out.println("Delete a node 40 from the linked list");
		linkedListObj1.deleteNode(40);
		linkedListObj1.display();
		linkedListObj1.size();
		System.out.println("Ordered linked list is ascending order:");
		linkedListObj1.insertAfterNode(30,40);
		linkedListObj1.sortList();
		linkedListObj1.display();
	}
}
