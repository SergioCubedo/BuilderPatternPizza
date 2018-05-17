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
public class Pizza {

    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean olive;

    public Builder pepperoni(boolean value) {
        pepperoni = value;
        return this;
    }

    public static class Builder {
//required

        private final int size;

        public Builder bacon(boolean value) {
            bacon = value;
            return this;
        }
        
        public Builder olive(boolean value) {
            olive = value;
            return this;
        }
//optional
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public Builder(int size) {
        this.size = size;
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;


    public Builder cheese(boolean value) {
        pepperoni = builder.pepperoni;
        cheese = value;
        bacon = builder.bacon;
        return this;

    }
