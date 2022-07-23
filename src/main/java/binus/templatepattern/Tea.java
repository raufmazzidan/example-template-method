/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binus.templatepattern;

/**
 *
 * @author raufmazzidan
 */
public class Tea extends CaffeineBeverage {

    private void addLemon() {
        System.out.println("Adding Lemon");
    }

    private void steepTeaBag() {
        System.out.println("Steeping The Tea");
    }

    @Override
    protected void brew() {
        steepTeaBag();
    }

    @Override
    protected void addCondiments() {
        this.addLemon();
    }
}
