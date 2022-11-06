package net.codejava;

public class Node 
{
	public int data;
	public Node nextNode;
	
	public Node(int data)
	{
		this.data = data;
		this.nextNode = null;
	}
	
	public String ToString()
	{
		String result = "";
		result += this.data;
		if(this.nextNode == null)
		{
			result += "No more modes linked to this node";
		}
		else
		{
			result += "Next node's pointer is at " + this.nextNode;
		}
		return result;
	}
}