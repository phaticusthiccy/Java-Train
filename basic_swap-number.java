/**
* Phaticusthiccy Java-Train @2021 
* All Right Reserved
*/

public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

/**
===============================================================================================
*/

public class SwapNumbers {

    public static void main(String[] args) {

        float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

/**
Explanation for this Module

In the above program, two numbers 1.20f and 2.45f which are to be swapped are stored in variables: first and second respectively.

The variables are printed before swapping using println() to see the results clearly after swapping is done.

First, the value of first is stored in variable temporary (temporary = 1.20f).
Then, value of second is stored in first (first = 2.45f).
And, finally value of temporary is stored in second (second = 1.20f).
This completes the swapping process and the variables are printed on the screen.

Remember, the only use of temporary is to hold the value of first before swapping. You can also swap the numbers without using temporary.
*/
