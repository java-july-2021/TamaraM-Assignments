import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    
    public void arrNumbers(){
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);

        int sum = 0;
        for(var i=0; i<numbers.size(); i++){
            sum+=numbers.get(i);
            if(numbers.get(i)>10){
            System.out.println(numbers.get(i));
            }
        }

        System.out.println("Sum is " + sum);
        //System.out.println(numbers);
    }
        
    public void arrNames(){
        ArrayList<String>names=new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);
        //not sure yet how to return names longer than 5 characters
    }

    public void arrAlphabet(){
        ArrayList<Character>alphabet=new ArrayList<Character>();
        for (char ch='a'; ch<='z'; ch++){
            alphabet.add(ch);
        }
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(25));
        System.out.println(alphabet.get(0));
        char ch=alphabet.get(0);
        if (ch =='a' || ch =='e' || ch =='i' || ch =='o'){
            System.out.println("First letter of the array is a vowel.");
        }
        else{
            System.out.println("The first letter of the array is a constonant.");
        }
    }
    public void arrRandom(){ //having hard time with returning methods. will do later.
        Random r = new Random();
        ArrayList<Integer>array=new ArrayList<Integer>();
            
        for(int i=55; i<=100; i++){
        array.add(i);
        }        
        //System.out.println(randomNum);
        System.out.println(array);
        
        for( var i=1; i<=10; i++){
            int randomNum = r.nextInt(45);
            System.out.println(array.get(randomNum));
            }
        }
    
    public void arrRandom2(){
        Random r = new Random();
        ArrayList<Integer>array2=new ArrayList<Integer>();
            
        for(int i=55; i<=100; i++){
        array2.add(i);
        }        
        //System.out.println(randomNum);
        System.out.println(array2);
        
        for( var i=1; i<=10; i++){
            int randomNum = r.nextInt(45);
            System.out.println(array2.get(randomNum));
            //Collections.sort(randomNum);
        }
        
    }
    //Create a random string
    //Generate an array with 10 random string
}

