package se.iths.JavaVerktygLabb1test1;

public class TextProcessor {

    public String toUpperCase(String a){
        return a.toUpperCase();
    }

    public String toLowerCase(String a){
        return a.toLowerCase();
    }

    public String reverseText(String a){
        return new StringBuilder(a).reverse().toString();
    }

}
