														Test 3     						6/01/2023


1]package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MinAndMax {
	
	static int min(Collection<Integer> ls)
	{
		return Collections.min(ls);
	}
	static int max(Collection<Integer> ls)
	{
		return Collections.max(ls);
	}
	
	
	public static void main(String[] args) {
		Collection<Integer> ls=new ArrayList();
		ls.add(45);
		ls.add(333);
		ls.add(76);
		ls.add(29);
		ls.add(900);
		ls.add(23);
		ls.add(474);
		ls.add(654);
		ls.add(29);
		ls.add(454);
		
		System.out.println(ls);
		System.out.println("===============");
		System.out.println("min value is:"+min(ls));
		System.out.println("max value is:"+max(ls));
				
		
		
	}
}

2]package com;

public class Timmy {
	static boolean Love(int a, int b)
	{
		if(a%2==0 && b%2==0)
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		if(Love(7,6))
		{
			System.out.println("there are not in Love");
		}
		else
		{
			System.out.println("there are in Love");
		}
	}
}




														
3]what is generalizated and specialized?

Generalized: In a single reference we can stored a different type of objects.

Specialized: we can store a specific type of objects

4] a)I don't want my class to be inherited by any other class.what should i do=Final.
   b)can you give a few examples of final classes defined in Java API = String, double, Integer and other wrapper class.
   c)what are some alternatives to inheritance =  Type casting

5]which sorted collection have you used?
-TreeSet

6] difference between ArrayList and LinkedList?

ArrayList:
	-ArrayList is used array.
	-increment capacity=((CurrrentCapacity)*3/2)+1
	-it is Sequential manner
	-read operation is fast
	-write operation is slow
	-initial capacity is 10
	-underlined in resizable and glowable array

LinkedList:
	-Linked list used nodes
	-No increment capacity
	-it is non sequential manner
	-read operation is slow
	-write operation is fast
	-initial capacity is 10
	-underlined in doubly LinkedList.
	
7]what is difference b/w ListIterator and Iterator?

ListIterator:
	- it move in forward, backword, and inbetween direction also.
	-we can use add() and remove method.
Iterator:
	-it moves in forward direction only.
	-here we use add() method only.


8]what is covarient method overriding in java?

-when overriding a method the return type in the derived class may be different.	

9] what is memeory leackage in java?
	*objects are allocated in heap area when this  objects are no longer in use. 
	*garbage collector will not remove this objects from heap area this leads to a memory leackage. 
	*and no objects can access these memory.

10]Explain static polymorphism and Dynamic polymorphism?

	static polymorphism:
	-static polymorphism is also known as runtime polymorphism.
	-it is also called as late Binding.
	-static polymorphism supports method Overloading.
	-method overloading means method declare more then once within same class with the same name but diffetence in parameter.

	Dynamic polymorphism:
	-static polymorphism is also known as complie time polymorphism.
	-it is also called as early Binding.
	-static polymorphism supports method Overriding.
	-method Overriding means method method signature and its parameter should be same but different in implementation.
	
11]by using Encapsulation and private keyword to give security to uor property.
	
	
	
	