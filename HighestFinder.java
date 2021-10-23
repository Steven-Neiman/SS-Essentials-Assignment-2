/*
A class for JB 2.2.
Takes a 2d array, finds the highest value in it, and prints that value along with its indices
If multiple positions have the same value, it will give the position of the first one.
*/

public class HighestFinder {
    public static void main(String[] args){
        HighestFinder highestFinder = new HighestFinder();
        highestFinder.findHighest(highestFinder.array1);
    }
    float[][] array1={{(float) 0.2,(float) 17,(float)3.5},{(float)-60,(float)0,(float)7},{(float)-3,(float)0.6,(float)120.4}};
    public void findHighest(float[][] array){
        float highest=array[0][0];
        int highesti=0;
        int highestj=0;
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if (array[i][j]>highest){
                    highesti=i;
                    highestj=j;
                    highest=array[i][j];
                }
            }
        }
        System.out.println("the highest value present is "+highest);
        System.out.println("at a position of "+highesti+","+highestj);
    }
}
