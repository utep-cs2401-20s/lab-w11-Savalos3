import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class newSortingTester {

    @Test
    void newSorting0(){
        int [] A = {135246};
        int size = 3;
        newSorting test = new newSorting(A,size);
        int [] B = {123456};
//        int size = 3;
       // test.newSorting(B,size);
        assertArrayEquals(A,B);
    }
}
