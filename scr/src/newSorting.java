public class newSorting {


   void newSorting(int[] A , int size){
        int mid = A.length/2; //mid i used to see how big LH[] and Rh[] will be.
       if(A.length <= size){
           quickSort(A);

       }else{

        int[] LH = new int[mid];
        int[] RH = new int[A.length - mid];
        for(int i = 0; i < mid; i++){ //For loop takes data from A[] and puts them on Rh and LH
            LH[i] = A[i];
            RH[i] = A[i+mid];
        }
           if(A.length % 2 == 1){ //IF A[] is an odd length size this will make sure all data is distributed correctly.
               RH[mid] = A[A.length -1]; //Number not covered in for loop.
           }
        newSorting(LH,size);
        newSorting(RH,size);

        mergeSortedHalves(A,LH,RH); //Calls Merge method to execute final sorted array.
    }

    }

    private void quickSort(int [] A){//this is where we call the helper method for multiple passes.
        int left = 0;
        int right = A.length -1;
        int end = A.length;
       quickSort(A,left,right); //This just calls once and helper method will solve array.

    }
    private void quickSort(int [] A , int left , int right){ //this is only 1 pass of quicksort.
        int pivot = A[left];
        int start = left;
        int end = right;
        if(A.length == 2){ //Base case that takes care of length 2 arrays.
            if(A[0] > A[1]){
            int temp = pivot;
            A[0]= A[right];
            A[right] = temp;
            return;}else{
                return;
            }
        }
        if(A.length == 1){//Base case that takes care of only length 1 arrays.
            return;
        }


        while(A[left] <= pivot &&  left< A.length -1){//checks if pivot is greater than numbers after pivot and stops accordingly.
            left++;
        }

    while(A[right] > pivot && right > 0){//checks if pivot is less than numbers after pivot and stops accordingly.

        if(left != A.length -1){
            right--;}
    }
    if(right <= left){ //Upon stopping point swaps numbers. In this case pivot with number stopped on right.
        int temp = pivot;
        A[0]= A[right];
        A[right] = temp;

    }
    else{//This deals with other instance where 2 numbers other than pivot need to be swapped.
        int temp = A[left];
        A[left]= A[right];
        A[right] = temp;

    }
        if(left == 1 && right == 0){ //I noticed pattern where upon a sorted array left is always 1 and right is 0.
            return;//So this stops method when this is true.
        }else {
            quickSort(A, start, end); //this just makes sure if array isn't sorted then it will keep repeating method.
        }
    }
    private void mergeSortedHalves(int[] A, int[] LH, int[] RH){
        int left = 0;
        int right = 0;
        int place =0; //Indicates where in array A will the data be replaced.
        while(place != A.length ){ //While loop does not stop until all spaces in array A are filled.

            if(left == LH.length || right == RH.length ) { //Makes sure that if LH is completely navigated through then the
                if (left == LH.length) {                  //rest of the numbers will come from RH.
                      left = left-1;
                    while (place != A.length) {
                        A[place] = RH[right];
                        right++; //increases the posotion where the number are replaced. ex. RH[0],RH[1]..
                        place++; //increases the posotion where the number are replaced. ex. A[0],A[1]..
                    }
                    return; //Stops method upon sorted array.
                }
                if (right == RH.length) { //Makes sure that if RH is completely navigated through then the
                    right = right -1;     //rest of the numbers will come from LH.
                    while (place != A.length) {
                        A[place] = LH[left];
                        left++; //increases the posotion where the number are replaced. ex. LH[0],LH[1]..
                        place++;
                    }
                    return; //Stops method upon sorted array.
                }
            }else {

                if (LH[left] == RH[right]) { //if elements are equal then both are used and put into A[].
                    A[place] = LH[left];
                    place++;
                    A[place] = RH[right];
                    left++;
                    right++;
                    place++;

                }
                else if(LH[left] > RH[right]) { //If LH[] is greater than RH[] then LH is put into array A.
                    A[place] = RH[right];       //While RH[] has to go through while loop again to be compared to other number.
                    right++;
                    place++;
                }else{
                    A[place] = LH[left]; //Same as above but just inverse.
                    left++;
                    place++;
                }
            }
        }
    }
}
