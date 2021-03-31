import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [] arr = new int[25];
        Random rnd = new Random();

        for(int i=0; i< arr.length; i++){
            arr [i] = rnd.nextInt(1000);
        }
            System.out.println(avarage(arr));

    }

    public static double avarage(int [] array){

        double sum = 0;

        for(int i = 0; i<array.length; i++){

            sum += array[i];
        }

        return sum/array.length;
    }

}
