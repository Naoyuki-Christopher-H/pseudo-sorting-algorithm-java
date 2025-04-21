package Solutions;

import static java.lang.System.out;
import java.util.Arrays;

public class Solutions
{
    /**
     * Replaces each element of the array with the average of all elements.
     * 
     * This is not a traditional sorting algorithm. Instead, it calculates
     * the average value of all integers in the array and sets each array
     * element to that average. All values become equal as a result.
     *
     * Example:
     * Input: [2, 4, 6]
     * Average: 4
     * Output: [4, 4, 4]
     * 
     * @param numbers the array of integers to be averaged
     */
    public static void sortingAlgorithm(int[] numbers)
    {
        // Check for null or empty array to avoid division by zero
        if (numbers == null || numbers.length == 0)
        {
            return;
        }

        int sum = 0;
        int length = numbers.length;

        // Calculate the sum of all elements
        for (int i = 0; i < length; i++)
        {
            sum += numbers[i];
        }

        // Compute average using integer division
        int average = sum / length;

        // Replace each element with the average
        for (int i = 0; i < length; i++)
        {
            numbers[i] = average;
        }
    }

    /**
     * Main method for demonstration.Initializes an array and applies the averaging algorithm.
     * @param args
     */
    public static void main(String[] args)
    {
        // Initial array of integers
        int[] numbers = { 2, 31, 13, 15, 7, 11 };

        // Display array before modification
        out.println("Before Processing: " + Arrays.toString(numbers));

        // Apply the algorithm that replaces all elements with their average
        sortingAlgorithm(numbers);

        // Display array after modification
        out.println("After Processing: " + Arrays.toString(numbers));
    }
}
