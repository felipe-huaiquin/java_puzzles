import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest{
    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     int[] arrayTest = {3,5,1,2,7,9,8,13,25,32};
    //     ArrayList<Integer> arrayOutput = new ArrayList<Integer>();
    //     arrayOutput = iD.firstPuzzle(arrayTest);
    //     System.out.println(Arrays.toString(arrayOutput.toArray()));
    // }

    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     String[] arrayTest = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    //     ArrayList<String> arrayOutput = new ArrayList<String>();
    //     arrayOutput = iD.secondPuzzle(arrayTest);
    //     System.out.println(Arrays.toString(arrayOutput.toArray()));   
    // }

    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     ArrayList<String> arrayTest = new ArrayList<String>();
    //     for(int i = 1; i < 27; i++){
    //         arrayTest.add(iD.getCharForNumber(i));
    //     }
    //     // System.out.println(Arrays.toString(arrayTest.toArray()));
    //     iD.thirdPuzzle(arrayTest);
    // }

    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     ArrayList<Integer> arrayTest = new ArrayList<Integer>();
    //     arrayTest = iD.fourthPuzzle();
    //     System.out.println(Arrays.toString(arrayTest.toArray()));
    // }

    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     iD.fifthPuzzle();
    // }

    // public static void main(String[] args){
    //     PuzzleJava iD = new PuzzleJava();
    //     ArrayList<String> arrayTest = new ArrayList<String>();
    //     for(int i = 1; i < 27; i++){
    //         arrayTest.add(iD.getCharForNumber(i));
    //     }
    //     System.out.println(iD.sixthPuzzle(arrayTest));

    // }

    public static void main(String[] args){
        PuzzleJava iD = new PuzzleJava();
        ArrayList<String> alphabet = new ArrayList<String>();
        ArrayList<String> arrayTest = new ArrayList<String>();
        for(int i = 1; i < 27; i++){
            alphabet.add(iD.getCharForNumber(i));
        }
        arrayTest = iD.seventhPuzzle(alphabet);
        System.out.println(Arrays.toString(arrayTest.toArray()));
    }

}