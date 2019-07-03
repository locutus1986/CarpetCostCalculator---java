package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Floor floor = new Floor(6,7);
        Carpet carpet = new Carpet(8);

	    Calculator calc = new Calculator(floor, carpet);

        System.out.println(calc.getTotalCost());
    }
}
