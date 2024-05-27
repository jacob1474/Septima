package PrvaHodina;

import java.util.Random;

public class Sorts {
    public static void main(String[] args) {
        Random random = new Random();
        int pole[] = new int[10];


        for (int i = 0; i < pole.length; i++) {
            pole[i]=random.nextInt(10);
        }

        System.out.println("Unsorted array: ");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i]+",");
        }


        int[] sortedArray = InsertionSort(pole);
        System.out.println();
        System.out.println("Sorted array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+",");
        }
        
    }
    public static int[] BubbleSort(int[] zoznam){
        for (int i = 0; i < zoznam.length; i++) {
            for (int j = 0; j < zoznam.length-i-1; j++) {
                if(zoznam[j] > zoznam[j+1]){
                    int temp = zoznam[j];
                    zoznam[j]=zoznam[j+1];
                    zoznam[j+1]=temp;
                }
            }
        }
        return zoznam;
    }

    public static int[] SelectionSort(int[] zoznam){
        for (int i = 0; i < zoznam.length; i++) {
            int smallestNumber = i;
            for (int j = i+1; j < zoznam.length; j++) {
                if(zoznam[j]<zoznam[smallestNumber]){
                    smallestNumber = j;
                }
            }
            int temp = zoznam[i];
            zoznam[i] = zoznam[smallestNumber];
            zoznam[smallestNumber] = temp;
            System.out.println(zoznam[smallestNumber]);
        }
        return zoznam;
    }

    public static void InsertionSort(int[] zoznam){
        
    }
}
