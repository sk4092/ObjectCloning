package com.scp.ObjectClonningScenarios;

import java.util.Arrays;

public class ObjectClonningArray {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] numbers = {10,20,30};
		
		ClassWithArray obj1 = new ClassWithArray(10, numbers);
		ClassWithArray obj2 = obj1.clone();
		System.out.println("Object one : " + obj1);
		System.out.println("Object two : " + obj2);
		System.out.println("Ref Equality : " + (obj1.numbers == obj2.numbers));
		
		
		ClassWithArray2 obj3 = new ClassWithArray2(20, numbers);
		ClassWithArray2 obj4 = obj3.clone();
		
		System.out.println("Object one : " + obj3);
		System.out.println("Object two : " + obj4);
		System.out.println("Ref Equality : " + (obj3.numbers == obj4.numbers));

		
		
	}
}

class ClassWithArray implements Cloneable {
	int id;
	int[] numbers;

	public ClassWithArray(int id, int[] numbers) {
		super();
		this.id = id;
		this.numbers = numbers;
	}

	public ClassWithArray clone() throws CloneNotSupportedException {
		return (ClassWithArray) super.clone();
	}

	@Override
	public String toString() {
		return "ClassWithArray [id=" + id + ", numbers=" + Arrays.toString(numbers) + "]";
	}	
}

class ClassWithArray2 implements Cloneable {
	int id;
	int[] numbers;

	public ClassWithArray2(int id, int[] numbers) {
		super();
		this.id = id;
		this.numbers = numbers;
	}

	public ClassWithArray2 clone() throws CloneNotSupportedException {
		ClassWithArray2 obj = (ClassWithArray2) super.clone();
		int[] numbers2=numbers.clone();
		obj.numbers = numbers2;
		return obj;
	}

	@Override
	public String toString() {
		return "ClassWithArray [id=" + id + ", numbers=" + Arrays.toString(numbers) + "]";
	}	
}