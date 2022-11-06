package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		Node nodeA = new Node(12);
		Node nodeB = new Node(3);
		Node nodeC = new Node(25);
		Node nodeD = new Node(17);
		Node nodeE = new Node(9);
		Node nodeF = new Node(21);
		
		list.append(nodeA);
		list.append(nodeB);
		list.append(nodeC);
		list.append(nodeD);
		list.append(nodeE);
		list.append(nodeF);
		
		System.out.println("unsorted list: ");
		list.display();
		list.bubbleSort();
		System.out.println("sorted list: ");
		list.display();
		
	}
}