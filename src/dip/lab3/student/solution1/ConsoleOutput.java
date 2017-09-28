/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
