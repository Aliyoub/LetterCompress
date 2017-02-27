package com.simplon.LetterCompress;


public class LetterCompress
{

    public String getLetterCompress(String lettersToCompress){

        String result = "";

        for (char letter :lettersToCompress.toCharArray()) {
            int cpt = 0;
            for (int i = 0; i <lettersToCompress.length() ; i++){
                if(lettersToCompress.charAt(i) == letter) cpt++;
            }
            if(!result.contains(String.valueOf(letter)))
                result += letter +""+cpt;
        }
        return result;
    }

    public static void main( String[] args )
    {
        LetterCompress letterCompress = new LetterCompress();
        System.out.println( letterCompress.getLetterCompress("aaabb"));
    }
}
