/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.hello;

/**
 *
 * @author Aravind Sarma Yeluripati
 */
public class NewClassTest {
    public static void main(String[] args){
        NewClass newclass = new NewClass();
        newclass.setHum(20);
        newclass.setNum(40);
        System.out.println("Sum: "+ (newclass.getHum()+newclass.getNum()));
    }
}
