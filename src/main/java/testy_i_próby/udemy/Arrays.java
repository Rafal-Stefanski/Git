package testy_i_próby.udemy;

import pl.sda.drzewo_genealogiczne.Person;

public class Arrays {
    public static void main(String[] args) {
        int x;                      // creating one box memory
        int[] myArray;              // declaring an array that will store ints
//        myArray = new int[50000];       // initializing our array to be capable of holding 50000 ints
        myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Person[] people;

        //        x = 5;
//
//        myArray[0] = x;
//        myArray[1] = 3;
//        myArray[2] = 0;
//        myArray[3] = 1;
//        myArray[4] = 1;

//        for(int counter =0; counter<50000; counter++){
//            myArray[counter]=counter;
//        }

        //iteratitng over an Array
        //for (int i = 0; i < myArray.length; i++){
        //System.out.println(myArray[i]);
        //}

        for (int number : myArray) {
            System.out.println(number);

        }

    }
}
