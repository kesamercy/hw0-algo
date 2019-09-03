package ub.cse.algo;

import java.util.Arrays;
import java.util.Vector;
import java.util.ArrayList;

/**
 * For use in CSE 331
 * Template for Homework 3
 */
public class Solution {
    
    private ArrayList<Integer> in_vector;
    
    /**
     * The constructor simply sets up the necessary data structures.
     * The grader for the homework will first call this class and pass the necessary variables.
     * There is no need to edit this constructor.
     *
     * @param in_vector the vector used to multiply against the matrix
     */
    public Solution(ArrayList<Integer> in_vector) {
        this.in_vector = in_vector;
    }
    
    /**
     * This method must be filled in by you. You may add other methods and subclasses as you see fit,
     * but they must remain within the Solution class.
     * @return Your resulting vector.
     */
    public ArrayList<Integer> outputVector() {
    	int sizeOfVector = in_vector.size();
    	int valueInOutPutVector = 0;
    	int numElementsExcludedInFindingOutPutVectorElement = 0;
    	int lastElementInInputVector = sizeOfVector - 1;
    	
    	ArrayList<Integer> outputArraylist = new ArrayList<Integer>();
    	
    	for (int i = 0; i < sizeOfVector; i++) {
    		valueInOutPutVector += in_vector.get(i);
   		
    		if (i == lastElementInInputVector) {
    			outputArraylist.add(valueInOutPutVector);
    			++numElementsExcludedInFindingOutPutVectorElement;
    			i = numElementsExcludedInFindingOutPutVectorElement;
    			--i; //decrement i to prevent double increment when it goes to the for loop
    			valueInOutPutVector = 0;
			}
    		
		}
    	
        return outputArraylist;
    }
    

}
