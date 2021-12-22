package com.codewithashley;

public class Main {

    public static void main(String[] args) {
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Ashley", 2, 2021);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();

        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }
}
