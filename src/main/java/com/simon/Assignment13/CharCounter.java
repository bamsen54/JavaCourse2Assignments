package com.simon.Assignment13;

public class CharCounter {

    public static int charCounter( String text, char character ) {

        int totalOccurances = 0;

        for( int k = 0; k < text.length(); k++ ) {

            if( text.charAt(k) == character )
                totalOccurances++;
        }

        return totalOccurances;
    }
}
