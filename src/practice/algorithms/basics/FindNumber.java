package practice.algorithms.basics;

public class FindNumber {
    static int count = 0;

    static int findNum(int[] numberCollection, int start, int end, int numToFind) {
        count++;

        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (numberCollection[mid] == numToFind) {
                return mid;
            }
            if (numberCollection[mid] > numToFind) {
                return findNum(numberCollection, start, mid - 1, numToFind);
            }
            return findNum(numberCollection, mid + 1, end, numToFind);
        }

        return -1;
    }

    public static void main(String[] args) {
        // Our Collection of numbers
        int[] numColl = new int[10000000];

        // get the array ready with all the numbers
        int i = 0;
        while(i < numColl.length) {
            numColl[i] = i + 1;
            i++;
        }

        int high = numColl.length - 1;
        long startTime = System.currentTimeMillis();

        FindNumber.findNum(numColl, 0, high, 9999996);
        System.out.println("We found the values at " + count + " try");

        long endTime = System.currentTimeMillis();

        System.out.println("Total time: " + (endTime - startTime) + " ms");
    }
}
