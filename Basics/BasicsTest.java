import java.util.ArrayList;


class BasicsTest{
    public static void main(String[] args){
        Basics b19 = new Basics();

        // b19.print1To255();
        // b19.printOdds1To255();
        // 
        ArrayList<Integer> basicArray = new ArrayList<Integer>();
        basicArray.add(1);
        basicArray.add(3);
        basicArray.add(-5);
        basicArray.add(7);
        basicArray.add(9);
        basicArray.add(11);
        basicArray.add(13);

    //    b19.iterateArrayList(basicArray); 
    // b19.findMax(basicArray);
    // b19.getAverage(basicArray);
    // b19.arrayOddNumbers();
    // b19.greaterThanY(basicArray, 6);
    // b19.squareTheValues(basicArray);
    // b19.eliminateNegatives(basicArray);
//    System.out.println(b19.maxMinAvg(basicArray));
        b19.shiftArrayToLeft(basicArray);
    }
}