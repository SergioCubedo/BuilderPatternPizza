/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatternpizza;

/**
 *
 * @author alu20490610w
 */
public class BuilderPatternPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();
    }
    
}
