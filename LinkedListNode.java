package com.linkedlist;

import java.util.jar.Attributes.Name;

public class LinkedListNode <T>{
	public T data;
	public T next;
	//constructor
	public void Node(T data)
	{
		this.data = data;
	}
	//setters and getters
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
}


