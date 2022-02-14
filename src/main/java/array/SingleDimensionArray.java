package array;

import java.util.Arrays;

import static java.lang.System.out;

public class SingleDimensionArray {
    private int[] arr;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        // Initialized An array and put min value to each cell
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    // Insert Method
    public void insert(int location, int value) {
        try {
            arr[location] = value;
            out.println("Successfully inserted");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Invalid index to access array");
        }
    }

    // Get Method
    public int get(int index) {
        if (index <= arr.length - 1) {
            return arr[index];
        } else throw new ArrayIndexOutOfBoundsException("Index " + index + " Out of bounds length " + arr.length);
    }

    // Traverse array
    public void traverse() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (arr.length - 1 > i) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        out.println(stringBuilder);
    }

    //Search for an element in the given array
    public int search(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                out.println("Value is found at the index of " + i);
                return i;
            }
        }
        out.println(valueToSearch + " is not found.");
        return -1;
    }

    // Deletion value from array
    public void deleteValue(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
            out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            out.println("The index that is provided is not in the range of array");
        }
    }
}
