import java.util.ArrayList;

public class Basics{

    //print 1 to 255
    public void print1To255(){
        for(int i =1; i< 256; i++){
            System.out.println(i);
        }
    }

    //print odds 1 to 255
    public void printOdds1To255(){
        for(int i = 1; i < 256; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    }

    //print 0 to 255 plus sum
    public void printSum(){
        int sum = 0;
        for(int i = 0; i< 256; i++){
            sum+=i;
            System.out.println("Number: "+i+ " Sum: "+sum);
        }
    }

    //Iterate through arry
    public void iterateArrayList(ArrayList<Integer> list){
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    //Find max
    public void findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    //Get average
    public void getAverage(ArrayList<Integer> list){
        double avg = 0.0;
        for(int i = 0; i < list.size(); i++){
            avg+=list.get(i);
        }
        System.out.println(avg/list.size());
    }

    //Array with Odd Numbers
    public void arrayOddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i =1; i < 256; i++){
            if(i % 2 !=0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    //Greater than y
    public void greaterThanY(ArrayList<Integer> list, int y){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>y){
                count+=1;
            }
        }
        System.out.println(count);
    }

    //Square the Values
    public void squareTheValues(ArrayList<Integer> list){
        for(int i =0; i < list.size(); i++){
            int x = list.get(i);
            list.set(i, x*x);
        }
        System.out.println(list);
    }

    //Eliminate Negative Numbers
    public void eliminateNegatives(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            if(x<0){
                list.set(i, 0);
            }
        }
        System.out.println(list);
    }

    //Max, Min, Avg
    public ArrayList<Object> maxMinAvg(ArrayList<Integer> list){
        int min = list.get(0);
        int max = list.get(0);
        double avg = 0.0;
        ArrayList<Object> list2 = new ArrayList<Object>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
            else if(list.get(i)> max){
                max = list.get(i);
            }
            avg+=list.get(i);
        }
        avg = avg/list.size();
        list2.add(max);
        list2.add(min);
        list2.add(avg);
        return list2;
    }

    //Shifting Values
    public void shiftArrayToLeft(ArrayList<Integer> list)
    {
        int i=0;
        for (i=0; i<list.size()-1; i++)
        {
            list.set(i, list.get(i+1)); 
        }
        list.set(i, 0);
        System.out.println(list);
    }
}
