package main.java.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 2, 4};

        int[] merged = mergeTwoSortedArrays(arr1, arr2);
        if(null == merged || merged.length == 0){
            System.out.println("No Value");
        }else{
            String val = Arrays.stream(merged).mapToObj(String::valueOf).collect(Collectors.joining(", "));
            System.out.println(val);
        }
    }

    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        if (null == arr1 || arr1.length == 0) {
            return arr2;
        } else if (null == arr2 || arr2.length == 0) {
            return arr1;
        }

        int arr1Index = 0;
        int arr2Index = 0;

        int[] mergedArr = new int[arr1.length + arr2.length];
        int mergedArrIndex = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] <= arr2[arr2Index]) {
                mergedArr[mergedArrIndex++] = (arr1[arr1Index++]);
            } else {
                mergedArr[mergedArrIndex++] = (arr2[arr2Index++]);
            }
        }

        if (arr1Index < arr1.length) {
            append(arr1, arr1Index, mergedArr, mergedArrIndex);
        } else if (arr2Index < arr2.length) {
            append(arr2, arr2Index, mergedArr, mergedArrIndex);
        }
        return mergedArr;
    }

    private static void append(int[] toBeAppended, int appendedCurrentIndex, int[] appended, int appendedIndex) {
        while (appendedCurrentIndex < toBeAppended.length) {
            appended[appendedIndex++] = toBeAppended[appendedCurrentIndex++];
        }

    }
}