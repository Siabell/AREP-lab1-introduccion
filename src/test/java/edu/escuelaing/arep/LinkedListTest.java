package edu.escuelaing.arep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkedListTest extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LinkedListTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LinkedListTest.class );
    }
    
    public void testShouldAddAElementToLinkedList()
    {
    	LinkedListP<Integer> linkedList = new LinkedListP<Integer>();
    	assertTrue(linkedList.add(2));
    	assertTrue(linkedList.add(3));
    	assertTrue(linkedList.add(4));
    }
    
    public void testShouldAddAElementWithIndexToLinkedList()
    {
    	LinkedListP<Integer> linkedList = new LinkedListP<Integer>();
    	assertTrue(linkedList.add(2));
    	assertTrue(linkedList.add(4));
    	assertTrue(linkedList.add(6));
    	linkedList.add(0,1);
    	linkedList.add(2,3);
    	linkedList.add(4,5);
    	assertTrue(linkedList.get(0)==1);
    	assertTrue(linkedList.get(3)==4);
    	System.out.print(linkedList.get(5));
    	assertTrue(linkedList.get(5)==6);
    }
    
    
    public void testShouldGetElementByIndex(){}
    {
    	LinkedListP<Integer> linkedList = new LinkedListP<Integer>();
    	assertTrue(linkedList.add(2));
    	assertTrue(linkedList.add(3));
    	assertTrue(linkedList.add(4));
    	Integer getResult = linkedList.get(3);
    	assertTrue(getResult == 4);
    	//System.out.println(getResult + "lenght");
    	//System.out.print(getResult);
    }
    
    

}
