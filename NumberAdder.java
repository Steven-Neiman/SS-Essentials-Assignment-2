import java.util.Scanner;
import java.util.ArrayList;

/*
A class for Java Basics 2.1.
Requests user input until they type "Done", then sums up all the integers they typed
*/
public class NumberAdder{
    ArrayList<Integer> inputs=new ArrayList<Integer>();
    Scanner inputCollector = new Scanner(System.in);
    String newInput = new String();
    public static void main(String[] args){
        NumberAdder numberAdder= new NumberAdder();
        System.out.println(numberAdder.sumOfInputs());
    }
    public int sumOfInputs(){
        while (true){
            System.out.println("input a number or the word \"Done\"");
            newInput=inputCollector.nextLine();
            if (newInput.equals("Done")){
                break;
            }else{
                try{
                    inputs.add(Integer.parseInt(newInput));
                }
                catch(Exception e){
                    System.out.println("I didn't understand that input, please try again");
                }
            }
        }
        int sum=0;
        for(int element:inputs){
            sum+=element;
        }
        return(sum);
    }
}