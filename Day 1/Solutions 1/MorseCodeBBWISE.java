package com.SWE_Solutions;

import java.util.*;
public class MorseCodeBBWISE {


    public int uniqueMorseRepresentations(String[] words) {
        
        HashMap <String,String> morse = new HashMap <String, String>();
        morse.put("a",".-"); morse.put("b","-..."); morse.put("c","-.-.");
        morse.put("d","-.."); morse.put("e","."); morse.put("f","..-.");
        morse.put("g","--."); morse.put("h","...."); morse.put("i","..");
        morse.put("j",".---"); morse.put("k","-.-"); morse.put("l",".-..");
        morse.put("m","--"); morse.put("n","-."); morse.put("o","---");
        morse.put("p",".--."); morse.put("q","--.-"); morse.put("r",".-.");
        morse.put("s","..."); morse.put("t","-"); morse.put("u","..-");
        morse.put("v","...-"); morse.put("w",".--"); morse.put("x","-..-");
        morse.put("y","-.--"); morse.put("z","--..");
        
        ArrayList <String> transformation = new ArrayList <String>();
        
        for(int i=0;i<words.length;i++){
            //System.out.print(i+1+" "+words[i]);
            String [] str = words[i].split("");   
            String morseCode ="";
            for(int ii=0;ii<str.length;ii++){
                morseCode += morse.get(str[ii]);
            }
            //System.out.println(morseCode);
            if(!(transformation.contains(morseCode))){
                transformation.add(morseCode);
            }
        }
        return transformation.size();
    }

  public static void main(String[] args) {
     String words [] ={"gin","zen","gig","msg"};
     
     MorseCodeBBWISE mc = new MorseCodeBBWISE ();
     System.out.println(mc.uniqueMorseRepresentations(words));
  }


}
