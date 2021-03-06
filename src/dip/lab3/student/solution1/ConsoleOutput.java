package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class ConsoleOutput implements MessageOutput{
        /**
     * Reads characters from the keyboard until a carriage return is entered.
     *
     * @return a String representing one line of input.
     */
    @Override
    public String readln() {
        System.out.println("Enter some text, then press return:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
