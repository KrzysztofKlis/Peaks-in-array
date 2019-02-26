import java.util.Random;

public class PeaksInArray {

    public static void main(String[] args) {
        int  arraySize = 100;
        int[] arrayWithPeaks = fillArray(arraySize);
        System.out.println("Minimum value in array is: " + minimumValue(arrayWithPeaks));
        peaks(arrayWithPeaks);

    }

    static int[] fillArray(int arraySize){
        Random randomNumbers = new Random();
        int[] array = new int[arraySize];
        int count = 0;
        while (count < array.length){
            array[count] = randomNumbers.nextInt(1000);
            //System.out.print(array[count] + " ");
            count++;
        }
        return array;
    }

    static int minimumValue(int[] arrayWithPeaks){
        int count = 1;
        int minimum = arrayWithPeaks[0];
        while (count < arrayWithPeaks.length){
            if (arrayWithPeaks[count] < minimum){
                minimum = arrayWithPeaks[count];
            }
            count++;
        }
        return minimum;
    }

    static void peaks(int[] arrayWithPeaks){
        int count = 1;
        System.out.print("Peaks in array: ");
        while (count < arrayWithPeaks[count]-1){
            if (arrayWithPeaks[count - 1] < arrayWithPeaks[count] && arrayWithPeaks[count] > arrayWithPeaks[count + 1]){
                System.out.print(arrayWithPeaks[count] + " ");
            }
            count++;
        }
        System.out.println();
    }
}
