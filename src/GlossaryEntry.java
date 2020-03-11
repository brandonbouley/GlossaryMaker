import java.util.ArrayList;

public class GlossaryEntry {

    private String word;
    private ArrayList<Integer> numsList;

    public GlossaryEntry(String w){
        word=w.toUpperCase();
        numsList= new ArrayList<Integer>();

    }

    public void add(int num){

        if (!numsList.contains(num))
            numsList.add(num);
    }

    public String getWord(){
        return word;
    }

    public String toString(){
        String numberList="";

        for (int i : numsList) {
            numberList+= " " + i  ;
        }


        return (word + numberList);

    }

    public static void main(String[] args) {
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(12);
        System.out.println(ge); }
}
