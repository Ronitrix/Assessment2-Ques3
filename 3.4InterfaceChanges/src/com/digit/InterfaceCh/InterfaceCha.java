package com.digit.InterfaceCh;

interface TestInterface { 
    // static method definition
    static void static_print()    { 
        System.out.println("TestInterface::static_print ()"); 
    } 
    // abstract method declaration 
    void nonStaticMethod(String str); 
    // default method 
    default void print() 
    { 
      System.out.println("TestInterface :: Default method"); 
    } 
} 
   
// Interface implementation 
class Test implements TestInterface { 
	
    // Override interface method
	
    @Override
    public void nonStaticMethod(String str)   { 
        System.out.println(str); 
    } 
}
public class InterfaceCha{
    public static void main(String[] args)   { 
        Test T1 = new Test(); 
   
        // Call static method from interface 
        TestInterface.static_print(); 
   
        // Call overridden method using class object 
        T1.nonStaticMethod("TestClass::nonStaticMethod ()"); 
        
        // call default method print using class object
        T1.print();
    } 
}
