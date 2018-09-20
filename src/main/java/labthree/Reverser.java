package labthree;

import labthree.Sentence;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Reverser {

  /** The maximum number of items to use for output. */
  private static int MAXIMUM_NUMBER_ITEMS = 5;

  /**
   * Reverse the provided array, for any data type.
   *
   * @param data the array to be reversed
   *
   * @author Gregory M. Kapfhammer
   */
  public static <T> T[] reverse(T[] data) {
    // TODO: Add the complete implementation of this method
    // NOTE: You will need to write a new return statement
    return null;
  }

  /**
   * The starting point for reversing an array.
   *
   * @param args The command-line arguments
   *
   * @author Gregory M. Kapfhammer
   */
  public static void main(String[] args) {
    Sentence[] originalArray = new Sentence[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = new Sentence("Sentence " + i);
    }
    System.out.println("Printing Sentences before Reversal ...");
    for (int i = 0; i < originalArray.length; i++) {
      System.out.println(originalArray[i]);
    }
    System.out.println("... Done Printing Sentences before Reversal.");
    Sentence[] reversedArray = Reverser.reverse(originalArray.clone());
    System.out.println("Printing Sentences after Reversal ...");
    for (int i = 0; i < reversedArray.length; i++) {
      System.out.println(reversedArray[i]);
    }
    System.out.println("... Done Printing Sentences after Reversal.");
    // TODO: Add the source code for reversing an array of Integers
    // NOTE: You should follow the code examples above to write
    // all of the remaining code required for the main method
    // NOTE: Please see the sample output to learn more details
  }

}
