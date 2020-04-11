import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class newSortingTester {

    @Test
    void newSorting0(){ //I used this test case to first see if my methods worked.
                        // With this test case i learned i need to add Base case in helper method when only one digit is used in quicksort.
        newSorting test = new newSorting();
        int [] A = new int[] {2,1};
        int size = 1;
        test.newSorting(A,size);
        int [] B = new int[] {1,2};

        assertArrayEquals(B,A); //Upon testing the second time when adding new base case i found out everything worked.
    }
    @Test
    void newSorting1(){  //Now in this test case i used a much larger array and uneven size.
                        // Upon testing it i learned i needed to fix how to seperate LH and Rh corretly.
        newSorting test = new newSorting();
        int [] A = new int[] {5,3,1,6,4,2};
        int size = 3;
        test.newSorting(A,size);
        int [] B = new int[] {1,2,3,4,5,6};

        assertArrayEquals(B,A); //Upon fixing and adjusting int mid in newSorting method it worked and i got sorted array.
    }
    @Test
    void newSorting2(){

        newSorting test = new newSorting(); //Now i wanted to test to see if using an even size with even A.length will work.
        int [] A = new int[] {2,4,3,1};
        int size = 2;
        test.newSorting(A,size);
        int [] B = new int[] {1,2,3,4};

        assertArrayEquals(B,A); //This worked right away no adjustments needed.
    }
    @Test
    void newSorting3(){

        newSorting test = new newSorting(); //now i wanted to use a large array with small size to see if my methods could work.
        int [] A = new int[] {4,3,2,1,6,5,7,8};
        int size = 3;
        test.newSorting(A,size);
        int [] B = new int[] {1,2,3,4,5,6,7,8}; // Upon testing it i found out that i had to make sure that my merge method did not go out of bounds.
                                                // Upon messing with conditionals i finally was able to get it to work when using else if.
        assertArrayEquals(B,A);
    }
    @Test
    void newSorting4(){ // Now i wanted to see how my code would act when using array with negative numbers.

        newSorting test = new newSorting();
        int [] A = new int[] {-4,3,-2,-1,6,5,-7,8};
        int size = 3;
        test.newSorting(A,size);
        int [] B = new int[] {-7,-4,-2,-1,3,5,6,8};

        assertArrayEquals(B,A); // It was a success and everything worked fine.
    }
    @Test
    void newSorting5(){ //Now I wanted to test repeating numbers to see if merge method worked correctly.

        newSorting test = new newSorting();
        int [] A = new int[] {4,3,4,3};
        int size = 3;
        test.newSorting(A,size);
        int [] B = new int[] {3,3,4,4};

        assertArrayEquals(B,A); // It was a success and everything worked fine.
    }
    @Test
    void newSorting6(){

        newSorting test = new newSorting(); // Now i wanted to test a traditional worst case to see if code worked fine.
        int [] A = new int[] {4,3,2,1};
        int size = 3;
        test.newSorting(A,size);
        int [] B = new int[] {1,2,3,4}; //code ended up working perfect.

        assertArrayEquals(B,A);
    }

    @Test
    void newSorting7(){

        newSorting test = new newSorting(); // I was curious to see how an large array with int size 1 would work.
        int [] A = new int[] {10,9,8,7,6,5,4,3,2,1};
        int size = 1;
        test.newSorting(A,size);
        int [] B = new int[] {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(B,A);//Upon testing using SOP i found out the way it is sorted is mainly using the merge method.
    }
}

