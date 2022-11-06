package net.codejava;

public class SinglyLinkedList 
{
	private Node header;
	private Node tail;
	private int count;
	
	public SinglyLinkedList()
	{
		this.header = null;
		this.tail = null;
		this.count = 0;
	}
	
	public void append(Node newNode)
	{
		if(this.header == null)
		{
			this.header = newNode;
			this.tail = newNode;
		}
		else
		{
			tail.nextNode = newNode;
			tail = newNode;
		}
		count++;
	}

	public void prepend(Node newNode)
	{
		if(this.header == null)
		{
			this.header = newNode;
			this.tail = newNode;
		}
		else
		{
			newNode.nextNode = this.header;
			this.header = newNode;
		}
		count++;
	}

	public void insertAfter(Node currNode, Node newNode)
	{
		if(header == null)
		{
			//case of empty linked list
			this.header = newNode;
			this.tail = newNode;
		}
		else if(currNode == tail)
		{
			//case of inserting at end of list
			this.tail.nextNode = newNode;
			this.tail = newNode;
		}
		else
		{
			//case of inserting within list after currNode position
			newNode.nextNode = currNode.nextNode;
			currNode.nextNode = newNode;
		}	
		count++;
	}

	public void removeAt(Node currNode)
	{
		if(currNode == null && header != null)
		{
			//special case to remove header
			Node postNode = header.nextNode;
			this.header = postNode;
			if(postNode == null)
			{
				//in case of removing last node
				this.tail = null;
			}
		}
		else if(currNode.nextNode != null)
		{
			Node postNode = currNode.nextNode.nextNode;
			currNode.nextNode = postNode;
			if(postNode == null)
			{
				this.tail = currNode;
			}
		}
		count--;
	}
	
	public int length()
	{
		return this.count;
	}
	
	public void bubbleSort()
	{
		Node currNode = header;
		Node index = null;
		
		int temp;
		
		if(header == null)
		{
			return;
		}
		else
		{
			while (currNode != null)
			{
				index = currNode.nextNode;
				while(index != null)
				{
					//if currNode data  > index data swap data/values
					if(currNode.data > index.data)
					{
						temp = currNode.data;
						currNode.data = index.data;
						index.data = temp;
					}
					//increment index
					index = index.nextNode;
				}
				//increment currNode
				currNode = currNode.nextNode;
			}
		}	
	}
	
	public void display()
    {
        // Node current will point to head
        Node currNode = header;
 
        if (header == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            // Prints each node by incrementing pointer
            System.out.print(currNode.data + " ");
            currNode = currNode.nextNode;
        }
 
        System.out.println();
    }
}