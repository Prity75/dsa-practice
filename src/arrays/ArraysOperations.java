package arrays;

import java.util.Arrays;

public class ArraysOperations {
    public static boolean isSorted(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //static initialization
        int[] arr= {6,4,8,9,3};
        for(int x: arr) {
            System.out.print(x +" ");
        }
        System.out.println();
        //dynamic initialization
        int[] arr1=new int[7];
        arr1[0]=5;
        arr1[3]=4;
        for (int k : arr1) {
            System.out.print(k + " ");
        }

        System.out.println();

        //sorting
        Arrays.sort(arr);
        for(int x: arr) {
            System.out.print(x+" ");
        }

        System.out.println();

        //find max and min
        int[] arr2= {4,7,2,9,3,5};
        int min=arr2[0];
        int max=arr2[0];
        for (int k : arr2) {
            if (k < min) {
                min = k;
            }
            if (k > max) {
                max = k;
            }
        }
        System.out.print("Minimum: "+min +" "+" Maximum: "+max);

        System.out.println();

        //Reversing an array
        int[] arr3= {4,7,2,9,3,5,3,0};
        int l=arr3.length;
        for(int i=l-1;i>=0;i--) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        for(int j=0;j<l/2;j++) {
            int temp=arr3[j];
            arr3[j]=arr3[l-1-j];
            arr3[l-1-j]=temp;

        }
        for(int x: arr3) {
            System.out.print(x +" ");
        }

        int[] arr4= {2,6,6,8,9};
        boolean result=isSorted(arr4);
        System.out.println("Array is sorted? "+result);


    }

}
