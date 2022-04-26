import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testInsertionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
}
    public testInsertionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        insertionSort inSort = new insertionSort();
        inSort.basicInsertionSort(arr,arr.length);
        /** add tests to check for this unit test **/
        System.out.print("Correct Case: [" + Sortedarr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + arr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        assertArrayEquals(arr,Sortedarr);
    }
    
    public void testNegative(){
        
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        /** add tests to check for this unit test **/
        insertionSort inSort = new insertionSort();
        inSort.basicInsertionSort(arr,arr.length);
        /** add tests to check for this unit test **/
        System.out.print("Correct Case: [" + Sortedarr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + arr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        assertArrayEquals(arr,Sortedarr);
    }
    
    public void testMixed(){
        
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -2;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        insertionSort inSort = new insertionSort();
        inSort.basicInsertionSort(arr,arr.length);
        /** add tests to check for this unit test **/
        System.out.print("Correct Case: [" + Sortedarr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + arr[0]);
        for(int i = 1; i < arr.length; ++i) {
        	System.out.print("," + arr[i]);
        }
        System.out.println("]");
        assertArrayEquals(arr,Sortedarr);    }

}