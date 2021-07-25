/**
* Phaticusthiccy Java-Train @2021 
* All Right Reserved
*/

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int character = reader.nextInt();

        char ch = character;
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}

/** 
Explanation for this Module

In the above program, character a is stored in a char variable, ch. Like, double quotes (" ") are used to declare strings, we use single quotes (' ') to declare characters.
Now, to find the ASCII value of ch, we just assign ch to an int variable ascii. Internally, Java converts the character value to an ASCII value.
We can also cast the character ch to an integer using (int). In simple terms, casting is converting variable from one type to another, here char variable ch is converted to an int variable castAscii.
Finally, we print the ascii value using the println() function.
*/
