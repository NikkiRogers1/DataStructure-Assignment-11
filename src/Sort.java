import java.util.Random;
import java.util.Arrays;

public class Sort {
    int values=50; 
   int[] value = new int[values];
    Random rand = new Random();
public void initValues(){
  
   
    for(int index = 0; index <values; index++){

        value[index] = rand.nextInt(1001);
    }

}
public boolean isSorted(){

    for(int index = 0; index < values -1; index++){
     
        if(value[index] > value[index + 1]){
            return false;
        }
       
    }
     return true;
}

public void swap(int first, int second){

    int temp = value[first];
    value[first] = value[second];
    value[second] = temp;
}
public void printValues(){
  System.out.println(Arrays.toString(value));
}
}
