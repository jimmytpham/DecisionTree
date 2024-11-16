import java.io.*;
import jsjf.*;

/**
 * HeartFailureClass demonstrates the use of a binary decision tree to 
 * diagnose Heart Failure Class.
 * 
 * Jimmy Pham
 * T00629354
 * March 7 2023
 * COMP 2231 
 * Assignment 4 Question 2
 */
public class HeartFailureClass
{
    /**
     *  Asks questions of the user to diagnose a medical problem.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("So, you think you have heart failure..");
        
        DecisionTree expert = new DecisionTree("HFC.txt");
        expert.evaluate();
        
        System.out.println("\nClass A: No objective evidence of cardiovascular disease. No symptoms and no limitation in ordinary physical activity.");
        System.out.println("Class B: Objective evidence of minimal cardiovascular disease. Mild symptoms and slight limitation during ordinary activity. Comfortable at rest.");
        
    }
}
