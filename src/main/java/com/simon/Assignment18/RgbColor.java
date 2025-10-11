package com.simon.Assignment18;

public class RgbColor {

    int r, b, g;

    public RgbColor() {

    }

    public RgbColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getBrightness() {

        return (int) Math.clamp( Math.round( 0.2126 * this.r + 0.7152 * this.g + 0.0722 * this.b ), 0, 255 );
    }

    public String getHex() {

        StringBuilder builder = new StringBuilder("#");

        if( this.r < 16 )
            builder.append( "0" ).append( Integer.toHexString( this.r ) );

        else
            builder.append( Integer.toHexString( this.r ) );

        if( this.g < 16 )
            builder.append( Integer.toHexString( this.g ) );

        else
            builder.append( Integer.toHexString( this.g ) );

        if( this.b < 16 )
            builder.append( "0" ).append( Integer.toHexString( this.b ) );

        else
            builder.append( Integer.toHexString( this.b ) );


        return builder.toString();
    }
}
