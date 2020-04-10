public class newSorting {

    newSorting(){}

    newSorting(int[] A , int size){
    if(A.length <= size){
        quickSort(A);
    }else{
        int mid = A.length/2;
        int[] LH = new int[mid];
        int[] RH = new int[A.length -mid];
        new newSorting(LH,size);
        new newSorting(RH,size);
        mergeSortedHalves(A,LH,RH);
    }
    }

    private void quickSort(int [] A){//this is where we call the helper method for multiple passes.
        int left = 0;
        int right = A.length -1;
       int x =  quickSort(A,left,right);

    }
    private int quickSort(int [] A , int left , int right){ //this is only 1 pass of quicksort
        int pivot = A[left];
        int start = left;
        int end = right;
    while(left<= right){
        left++;
    }
    while(A[right] > pivot){
        right--;
    }
    if(left <= right){
        int temp = A[right];
        A[left]= A[right];
        A[right] = temp;
        left++;
        right--;
    }
    if(start < left -1){
        quickSort(A,start,left-1);
        }
    if(right > left){
        quickSort(A,left, end);
    }
    return left;
    }
    private void mergeSortedHalves(int[] A, int[] LH, int[] RH){

//        int x =(A.length -1)/2;
//        for(int i = 0; i < x; i++){
//            A[i] = LH[i];
//            A[i+LH.length] = RH[i];
//
//        }
        int left = 0;
        int right = 0;
        int place =0;
        while(left != LH.length-1 && right != RH.length -1){

            if(LH[left] == RH[right]){
                if(left == LH.length -1){
                    A[place] = RH[right];
                    right++;
                    place++;
                }
                if(right == RH.length -1){
                    A[place] = LH[left];
                    left++;
                    place++;
                }

                A[place] = LH[left];
                place++;
                A[place] = RH[right];
                left++;
                right++;
                place++;
            }
            if(LH[left] >RH[right]){
                if(right == RH.length-1){
                    A[place] = RH[left];
                    left++;
                }else {
                    A[place] = RH[right];
                    right++;
                }
                place++;
            }
            if(LH[left] <  RH[right]){
                if(left == LH.length -1){
                    A[place] = RH[right];
                    right++;
                }else {
                    A[place] = RH[left];
                    left++;
                }
                place++;
            }
        }

    }
}
