package com.scp.ObjectClonningScenarios;

public class ObjectClonningString {
	    public static void main( String[] args ) throws CloneNotSupportedException
	    {
	    	ClassWithString obj1 = new ClassWithString(10,"Swapnil");
	    	ClassWithString obj2 = obj1.clone();
	    	System.out.println("Before Change:");
	        System.out.println( "Object one : " + obj1 );
	        System.out.println( "Object two : " + obj2 );
	        System.out.println( "Ref Equality : " + (obj1.name==obj2.name));
	        
	        
	        obj1.name = "Abhi";
	        System.out.println("\nAfter Chage");
	        System.out.println( "Object one : " + obj1 );
	        System.out.println( "Object two : " + obj2 );
	        System.out.println( "Ref Equality : " + (obj1.name==obj2.name));
	    }
}



class ClassWithString implements Cloneable{
int id;
String name; 	

public ClassWithString(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public ClassWithString clone() throws CloneNotSupportedException{
	return (ClassWithString) super.clone();
}

@Override
public String toString() {
	return "WithWrapperAndString [id=" + id + ", name=" + name + "]";
}
}
