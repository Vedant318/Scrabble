package com.example.scrabble;

public class scrabbleList {
    private String word;
    private int value;

    public scrabbleList(String w, int v) {


    word=w;
    value=v;
}
public String toString(){
        return"("+ word+" VAL: " +value+")";
}
public int getValue(){
        return value;

}
public String getWord(){
        return word;
}
}
