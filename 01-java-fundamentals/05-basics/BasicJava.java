import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava{
    
    //Print 1-255
    public void printNumbers(){
        for (var i=1; i<=255; i++){
            System.out.print(i + " "); 
        }
        System.out.println();
    }
    //Print odd numbers between 1-255
    public void printOddNumbers(){
        for (var i=1; i<=255; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Print Sum
    public void printSum(){
        int sum = 0;
        for(var i=0; i<=255; i++){
            sum+= i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    //Iterating through an array
    public void array(){
        int[] X = {1,3,5,7,9,13};
        for( var i=0; i<X.length; i++){
            System.out.println(X[i]);
        }
    }

    //Find Max
    public void findMax(){
        int[] array = {3,18,-5,99,0,8};
        var max = array[0];
        for( var i=1; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum value is equal " + max);
    }

    //Get Average
    public void average(){
        int[] array = {10,20,-15,5};
        var sum = 0;
        for(var i=0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println(sum/array.length);
        
    }
    //Odd Numbers
    public void oddNumbers(){
        ArrayList<Integer>Y = new ArrayList<Integer>();
        for (int i=1; i<=255; i+=2){
            Y.add(i);
        }
        System.out.println(Y);
    }

    //1. Greater than Y  no return
    public void greaterThanY1(){
        int[] array = {4,12,5,8,-3};
        int y = 7;
        int number = 0;
        for(var i=0; i<array.length; i++){
            if(array[i]>y){
                number+=1;
            }
        }
        System.out.println(number);
    }

    //2. Greater than Y with return
    public int greaterThanY2(int[] array){
        int y = 7;
        int number = 0;
        for(var i=0; i<array.length; i++){
            if(array[i]>y){
                number+=1;
            }
        }
        return number;
    }

    //Square the values
    public void square(){
        int[] array = {1,3,9,10};
        for(var i=0; i<array.length; i++){
            array[i]=array[i]*array[i]; //why Math.pow((array[i]),2) doesn't work? Math.pow((array[i]),2);
        }
    }


    //1. Eliminate Negative with no return
    public void eliminate1(){
        int[] arr1 ={1,5,10,-2};
        for (int i=0; i<arr1.length; i++){
            if(arr1[i]<0){
                arr1[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    //2. Eliminate Negative with parameter no return
    
    public void eliminate2(int[] arr2){
        for (int i=0; i<arr2.length; i++){
            if(arr2[i]<0){
                arr2[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    //3. Eliminate Negative with return
    public int[] eliminate3(int[] arr3){
        for(var i=0; i<arr3.length; i++){
            if(arr3[i]<=0){
                arr3[i]=0;
            }
        }
        return arr3;
    }

    //Max,Min and Average
    public double[] maxMinAvg(int[] x){ 
        var sum=0;
        var max=x[0];
        var min=x[0];
        for(var i=1; i<x.length; i++){
            sum+=x[i];
            if(x[i]>max){
                max=x[i];
            }
            else if(x[i]<min){
                min=x[i];
            }
        }
        var avg=sum/x.length;
        double[] array={max,min,avg};
        return array;
    }

    //Shifting the Values in the Array
    public int[] shiftValues(int[] arr1){
        
        for(var i=0; i<arr1.length-1; i++){
            arr1[i]=arr1[i+1];
        }
        arr1[arr1.length-1]=0;
        return arr1;
    }
}
