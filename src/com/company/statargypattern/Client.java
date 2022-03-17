package com.company.statargypattern;

public class Client {

    public static void main (String args[]) {

            BoobleSort boobleSort = new BoobleSort();
            Isort margesort = new MergeSort();

            Context context = new Context(boobleSort);

            int[] numbers = new int[10000];
            context.sort(numbers);

            margesort.sort(numbers);

        }

}

