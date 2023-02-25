package com.linkedlist;

public class LinkedListService<T extends Comparable<T>> {

	LinkedListService<T> head;
	private T data;
	private T next;
	public LinkedListService(T data2) {
		// TODO Auto-generated constructor stub
	}
	//Method to add nodes at the front in the linked list
	public void add(T data)
	{
		LinkedListService<T> newNode = new LinkedListService<T>(data);
		newNode.data = data;
		newNode.next = (T) head;
		head = newNode;
	}
	//Method to append nodes at rear in the linked list
	public void append(T data)
	{
		LinkedListService<T> newNode = new LinkedListService<T>(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Object tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;

		}
	}
	//Method to insert a node between two nodes
	public void insertAfter(LinkedListService<T> prevNode, T data)
	{
		LinkedListService <T> newNode = new LinkedListService<T>(data);
		newNode.data = data;
		newNode.next = prevNode.next;
		prevNode.next = (T) newNode;
	}
	//Method to display linked list
	public void display()
	{
		LinkedListService<T> tempNode = head;
		while(tempNode.next != null)
		{
			System.out.print(tempNode.data +" -> ");
			tempNode= (LinkedListService<T>) tempNode.next;
		}
		System.out.println(tempNode.data);
	}
	//Method to delete first element in the linked list
	public T pop()
	{
		if (head == null)
		{
			return null;
		}
		LinkedListService<T> tempNode = head;
		head = head.next;
		return tempNode.data;
	}
	//Method to delete last element in the linked list
	public T popLast()
	{
		LinkedListService<T> tempNode = head;
		while(tempNode.next.next!= null)
		{
			tempNode = (LinkedListService<T>) tempNode.next;
		}
		tempNode.next = null;
		return tempNode.data;
	}
	//Method to search for a key in the linked list
	public void search (T key)
	{
		boolean keyFound = false;
		LinkedListService<T> tempNode = head;
		while(tempNode != null)
		{
			if(tempNode.data == key)
			{
				System.out.println("Key found");
				keyFound = true;

			}
			tempNode = (LinkedListService<T>) tempNode.next;
		}
		if(keyFound == false)
		{
			System.out.println("Key is not found");
		}
	}
	//Method to insert a node after given node with key value
	public void insertAfterNode(T key,T data)
	{
		LinkedListService<T> newNode = new LinkedListService<T>(data);
		newNode.data = data;
		LinkedListService<T> tempNode = head;
		while(tempNode.data != key)
		{
			tempNode = (LinkedListService<T>) tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = (T) newNode;
	}
	//Method to delete a node from the linked list
	public void deleteNode(T key)
	{
		LinkedListService<T> tempNode = head;
		LinkedListService<T> prevNode = head;
		while(tempNode.data != key)
		{
			prevNode = tempNode;
			tempNode = (LinkedListService<T>) tempNode.next;
		}
		prevNode.next = tempNode.next;
	}
	//Method to calculate size of linked list
	public void size()
	{
		LinkedListService<T> tempNode = head;
		int count = 0;
		while (tempNode != null)
		{
			count++;
			tempNode = (LinkedListService<T>) tempNode.next;
		}
		System.out.println("Size of the linked list is: "+count);
	}
	//Method to create ordered linked list
	public void sortList()
	{
		LinkedListService<T> current= head;
		LinkedListService<T> index = null;
		T temp;
		if (head == null)
		{
			return;
		}
		else
		{
			while(current != null)
			{
				index = (LinkedListService<T>) current.next;
				while(index != null)
				{
					if((current.data).compareTo(index.data) > 0)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = (LinkedListService<T>) index.next;
				}
				current = (LinkedListService<T>) current.next;
			}
		}
	}
	public void delete() {
		// TODO Auto-generated method stub

	}
}

