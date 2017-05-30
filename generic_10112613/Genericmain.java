/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

public class Genericmain {
    public static void main(String[] args) {
        
        Villa<Integer> integer_object;
        integer_object = new Villa<>(88);
        integer_object.showType();

        int v = integer_object.getob();
        System.out.println("value: " + v);

        System.out.println();

        Villa<String> string_object = new Villa<>("Generics Test");

        string_object.showType();

        String str = string_object.getob();
        System.out.println("value: " + str);
    }
}
