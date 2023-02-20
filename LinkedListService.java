package com.linkedlist;

public class LinkedListService<T extends Comparable<T>> {

	Node<T> head;
	//Method to add nodes at the front in the linked list
	public void add(T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	//Method to append nodes at rear in the linked list
	public void append(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node<T> tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	//Method to insert a node between two nodes
	public void insertAfter(Node<T> prevNode, T data)
	{
		Node <T> newNode = new Node<T>(data);
		newNode.data = data;
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	//Method to display linked list
	public void display()
	{
		Node<T> tempNode = head;
		while(tempNode.next != null)
		{
			System.out.print(tempNode.data +" -> ");
			tempNode= tempNode.next;
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
		Node<T> tempNode = head;
		head = head.next;
		return tempNode.data;
	}
	//Method to delete last element in the linked list
	public T popLast()
	{
		Node<T> tempNode = head;
		while(tempNode.next.next!= null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		return tempNode.data;
	}
	//Method to search for a key in the linked list
	public void search (T key)
	{
		boolean keyFound = false;
		Node<T> tempNode = head;
		while(tempNode != null)
		{
			if(tempNode.data == key)
			{
				System.out.println("Key found");
				keyFound = true;

			}
			tempNode = tempNode.next;
		}
		if(keyFound == false)
		{
			System.out.println("Key is not found");
		}
	}
	//Method to insert a node after given node with key value
	public void insertAfterNode(T key,T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;
		Node<T> tempNode = head;
		while(tempNode.data != key)
		{
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	//Method to delete a node from the linked list
	public void deleteNode(T key)
	{
		Node<T> tempNode = head;
		Node<T> prevNode = head;
		while(tempNode.data != key)
		{
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = tempNode.next;
	}
	//Method to calculate size of linked list
	public void size()
	{
		Node<T> tempNode = head;
		int count = 0;
		while (tempNode != null)
		{
			count++;
			tempNode = tempNode.next;
		}
		System.out.println("Size of the linked list is: "+count);
	}
	//Method to create ordered linked list
	public void sortList()
	{
		Node<T> current= head;
		Node<T> index = null;
		T temp;
		if (head == null)
		{
			return;
		}
		else
		{
			while(current != null)
			{
				index = current.next;
				while(index != null)
				{
					if((current.data).compareTo(index.data) > 0)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}
}

