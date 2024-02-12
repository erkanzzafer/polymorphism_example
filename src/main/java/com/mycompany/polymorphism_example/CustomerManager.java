/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism_example;

/**
 *
 * @author zafer
 */
public class CustomerManager {
    
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }
    
    public void Add() {
        System.out.println("Müşteri Eklendi");
        logger.Log("mesaj");
    }
}
