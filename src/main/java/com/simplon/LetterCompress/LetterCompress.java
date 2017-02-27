package com.simplon.LetterCompress;


public class LetterCompress
{
    private String lettersToCompress;
    public String getLetterCompress(String lettersToCompress){
        int cpt = 0;
        //char[] c = lettersToCompress.toCharArray();
        String result = "";

        for (int i = 0; i <lettersToCompress.length() ; i++) {

            for (char letter :lettersToCompress.toCharArray()){
               // if(lettersToCompress.contains(String.valueOf(lettersToCompress.charAt(i)))) cpt++;
                if(lettersToCompress.contains(String.valueOf(letter))) cpt++;


            }
            result += lettersToCompress.charAt(i) +""+cpt;

        }
        return result;
    }

    public static void main( String[] args )
    {
        LetterCompress letterCompress = new LetterCompress();
        //letterCompress.getLetterCompress("aaabb");
        System.out.println( letterCompress.getLetterCompress("aaabb"));
    }
}
