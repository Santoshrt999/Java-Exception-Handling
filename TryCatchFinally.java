/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchfinally;

/**
 *
 * @author Santosh
 * Exception Handling in java
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        m();
    }

    static void m()  {

        int a = 10;
        int b = 0;
        System.out.println("method 1");
        try{
        m2(a, b);
        }catch(ArithmeticException e){
            System.out.println("art exe");
    }
    }

    static void m2(int a, int b)throws ArithmeticException {
        System.out.println("method 2");
        m3(a, b);
    }

    static void m3(int x, int y) throws ArithmeticException {
        int c = 0;
        int arr[] = new int[1];
        System.out.println("method 3");
        try {

            c = x / y;
            System.out.println(c);
            arr[45] = 45;
            System.out.println(arr);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught array exception");
        } finally {
            System.out.println("exeute");
        }
    }
}
