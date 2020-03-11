import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {

    public DocumentGlossary() {
        super();

    }

    public DocumentGlossary(int x){
        super(x);

    }

    public void addWord(String word, int num){
        if (!super.contains(word)){
            GlossaryEntry a = new GlossaryEntry(word);

        }
    }

    private int foundOrInserted(String word){

        if (this.isEmpty()) {
            this.add(new GlossaryEntry(word));
            return 0;
        }

        else{
            for (int i=this.size()-1; i>=0; i-- ){
                String a= this.get(i).getWord();

                int x= a.compareToIgnoreCase(word);
                if (x<0){
                    return x;
                }
            }
        }

        return 0;

    }


}
