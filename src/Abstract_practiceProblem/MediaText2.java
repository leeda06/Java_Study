package Abstract_practiceProblem;

import java.util.ArrayList;

abstract class Tag{
    String name;
    String text;
    boolean isEmpty;

    ArrayList<Tag> children;

    Tag(String name, String text, boolean isEmpty){
        this.name = name;
        this.text = text;
        this.isEmpty = isEmpty;
        this.children = new ArrayList<>();
    }
    void setText(String s){
        if (!isEmpty) {
            this.text = text;
        }
    }
    String getText(){
        return text;
    }
    void addTag(Tag t){
        if (!isEmpty) {
            children.add(t);
        }
    }
}
class P extends Tag{
    P() {
        super("P", false);
    }
}
class IMAGE extends Tag{
    IMAGE() {
        super("IMAGE", true);
    }
}

public class MediaText2 {
    public static void main(String[] args) {

    }
}
