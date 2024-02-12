/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.polymorphism_example;

/**
 *
 * @author zafer
 */
public class Polymorphism_example {

    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager(new DataBaseLogger());
        cm.Add();
    }
}
