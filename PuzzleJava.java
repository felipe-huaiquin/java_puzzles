import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{
    public ArrayList<Integer> firstPuzzle(int[] array){
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < array.length;i++){
            sum += array[i];
            if(array[i]>10){
                greaterThan10.add(array[i]);
            }
        }

        System.out.println(sum);
        return greaterThan10;
    }

    public ArrayList<String> secondPuzzle(String[] array){
        ArrayList<String> japNames = new ArrayList<String>();
        ArrayList<String> japNamesOutput = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            japNames.add(array[i]);
        }
        
        Collections.shuffle(japNames);

        for(int i = 0; i < japNames.size();i++){
            System.out.println(japNames.get(i));
            if(japNames.get(i).length()>5){
                japNamesOutput.add(japNames.get(i));
            }
        }

        return japNamesOutput;

    }

    public String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
    }
    
    public void thirdPuzzle(ArrayList<String> array){
        int last_element = array.size() - 1;
        Collections.shuffle(array);
        System.out.println(array.get(last_element));
        if(array.get(0) == "A" || array.get(0) == "E" || array.get(0) == "I" || array.get(0) == "O" || array.get(0) == "U" ){
            System.out.println("La primera letra es la vocal: " + array.get(0));
        }else{
            System.out.println(array.get(0));
        }
    }

    public ArrayList<Integer> fourthPuzzle(){
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        Random ran = new Random();
        for(int i = 0; i < 10; i++){
            randomArray.add(ran.nextInt((100-55)+1)+55); // nextInt((max-min)+1)+min
        }

        return randomArray;
    }

    public ArrayList<Integer> fifthPuzzle(){
        Random r = new Random();
        ArrayList<Integer> randomArrayFifth = new ArrayList<Integer>();
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < 10; i++){
            randomArrayFifth.add(r.nextInt((100-55)+1)+55);
        }
        
        Collections.sort(randomArrayFifth);
        
        // Debo arreglar el encontrar maximo y minimo
        // for(int i = 0; i <randomArrayFifth.size();i++){
        //     if(max < randomArrayFifth.get(i)){
        //         max = randomArrayFifth.get(i);
        //     }else{
        //     // if(min > randomArrayFifth.get(i)){
        //         min = randomArrayFifth.get(i);
        //     }
        // }

        System.out.println(Arrays.toString(randomArrayFifth.toArray()));
        System.out.println(randomArrayFifth.get(0));
        System.out.println(randomArrayFifth.get(randomArrayFifth.size()-1));

        return randomArrayFifth;
    }

    public String sixthPuzzle(ArrayList<String> array){
        Random rand = new Random();
        String randomString = "";
        for(int i = 0; i < 5; i++){
            randomString += array.get(rand.nextInt(27));
        }
        return randomString;
    }

    public ArrayList<String> seventhPuzzle(ArrayList<String> array){
        Random rnd = new Random();
        ArrayList<String> randomStrings = new ArrayList<String>();
        String randomStr = "";
        for(int i = 0; i < 10; i++){
            randomStr = "";
            for(int j = 0; j < 5; j++){
                randomStr += array.get(rnd.nextInt(27));
            }
            randomStrings.add(randomStr);
        }
        return randomStrings;
    }

}

