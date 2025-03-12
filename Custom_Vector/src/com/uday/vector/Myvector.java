package com.uday.vector;

import java.util.Arrays;

public class Myvector<E> 
{
	private Object[] elements;
	private int elementcount;
	private static final int DEFAULT_CAPACITY=10;
	
	public Myvector()
	{
		elements= new Object[DEFAULT_CAPACITY];
		elementcount=0;
	}
	
	//Constructor with intial capacity
	public Myvector(int intial_capacity)
	{
		if(intial_capacity<0)
		{
			throw new IllegalArgumentException("Capacity can't be negitive");
		}
		elements= new Object[intial_capacity];
		elementcount=0;
	}
	
	//Adding element to the end position
	
	public void add(E element)
	{
		if(elementcount== elements.length)
		{
			grow();
			
		}
		elements[elementcount++]=element;    
	}
		//remove an element based on the index position
		public E remove(int index)
		{
			Verifyindex(index);
			
			
			E removeElement =(E) elements[index];
			
			int numMoved = elementcount-index-1;
			if(numMoved>0)
			{
				System.arraycopy(elements,index+1,elements,index,numMoved);
			}
			elements[--elementcount]=null;   //GC
			
			return removeElement;
		}

		//Size Of The vector
		public int size()
		{
			return this.elementcount;
		}
		
		//Capacity
		public int capacity()
		{
			return elements.length;
		}
		
		//Vector is empty or not
		public boolean isEmpty()
		{
			return elementcount==0;
		}
		
		//clear
		public void clear()
		{
			Arrays.fill(elements, 0, elementcount, null);
			elementcount=0;
		}
		
		//toString
		public String toString()
		{
			StringBuffer sb= new StringBuffer("[");
			for(int i=0;i<elementcount;i++)
			{
				sb.append(elements[i]);
				if(i<elementcount-1)
				{
					sb.append(", ");
				}
			}
			sb.append("]");
			
			
			return sb.toString();
		}
		
		
		private void grow()
		{
			int newCapacity=elements.length*2;
			
			if(newCapacity==0)
			{
				newCapacity= DEFAULT_CAPACITY;
			}
			
			elements = Arrays.copyOf(elements, newCapacity);
		}
		  
		//Get element by using index position
		
		public E get(int index)
		{
			Verifyindex(index);
			return (E) elements[index];
		}
		public void Verifyindex(int index)
		{
			if(index<0 || index>=elementcount)
			{
				throw new ArrayIndexOutOfBoundsException(index);
			}
		}
		
		public static void main(String[] args) 
		{
			Myvector<String> vector= new Myvector<>(); 
			vector.add("A");
			vector.add("B");
			vector.add("C");
			
			System.out.println("Size of the vector is: "+ vector.size());
			System.out.println("Capacity of the vector is: "+vector.capacity());
			
			for(int i=0;i<15;i++)
			{
				vector.add("Element :"+i);
			}
			
			System.out.println("After adding more elements ");
			System.out.println("Size of the vector is: "+ vector.size());
			System.out.println("Capacity of the vector is: "+vector.capacity());

			System.out.println("Is my Vector empty :"+ vector.isEmpty());
			System.out.println("1st Position Index :"+vector.get(1));

			System.out.println("Before Removing: "+vector);
			vector.remove(0);
			System.out.println("After Removing: "+vector);
			vector.clear();
			System.out.println(vector);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
