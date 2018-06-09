package com.scp.ObjectClonningScenarios;


public class ObjectClonnigWrapper 
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
    	ClassWithWrapper obj1 = new ClassWithWrapper(10,"Swapnil");
    	ClassWithWrapper obj2 = obj1.clone();
    	System.out.println("Before Change:");
        System.out.println( "Object one : " + obj1.id );
        System.out.println( "Object two : " + obj2.id );
        System.out.println( "Ref Equality" + (obj1.id==obj2.id));
        
        
        obj1.id = 15;
        System.out.println("\nAfter Chage");
        System.out.println( "Object one : " + obj1.id );
        System.out.println( "Object two : " + obj2.id );
        System.out.println( "Ref Equality" + (obj1.id==obj2.id));
    }
    
    
}

class ClassWithWrapper implements Cloneable{
	Integer id;
	String name; 	
	
	public ClassWithWrapper(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClassWithWrapper clone() throws CloneNotSupportedException{
		return (ClassWithWrapper) super.clone();
	}

	@Override
	public String toString() {
		return "WithWrapperAndString [id=" + id + ", name=" + name + "]";
	}
}
