import java.util.Arrays;
public class BasicJavaTest {
    
    public static void main(String[] args){
        BasicJava bj = new BasicJava();
        
        bj.printNumbers();
        
        bj.printOddNumbers();

        bj.printSum(); 
        
        bj.array();

        bj.findMax();

        bj.average();

        bj.oddNumbers();
        
        //1. Greater than Y  no return
        bj.greaterThanY1();

        bj.square();

        //2. Greater than Y with return
        int[] array2 = {4,12,5,8,-3};
        System.out.println(bj.greaterThanY2(array2));


        //Max,Min, Average
        int[] x ={8,13,-27,0,2,15, 125,2};
        System.out.println(Arrays.toString(bj.maxMinAvg(x)));
            
            
        //1. Eliminate negative no return
        bj.eliminate1();

        //2. Eliminate negative with parameter no return
        int[] arr2 = {1,5,10,-2};
        bj.eliminate2(arr2);

        //3. Eliminate Negative with Return
        int[] arr3 = {1,5,10,-2};    
        System.out.println(Arrays.toString(bj.eliminate3(arr3)));
        
        //Shifting the Values in the Array
        int[] arr1 = {1,5,10,7,-2}; 
        System.out.println(Arrays.toString(bj.shiftValues(arr1)));
    }
}    
    
    
