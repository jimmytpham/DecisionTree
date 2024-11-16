import java.io.*;
import jsjf.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.
 * 
 * Jimmy Pham
 * T00629354
 * March 7 2023
 * COMP 2231 
 * Assignment 4 Question 1
 */
public class BackPainAnalyzer
{
    /**
     *  Asks questions of the user to diagnose a medical problem.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("So, you're having back pain.");

        DecisionTree expert = new DecisionTree("input.txt");
        expert.evaluate();
    }
}
