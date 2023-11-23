/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judo_app;

/**
 *
 * @author Dima
 */
public class Elite {
    private String name;
    private double weight;
    private int private_lesson;
    private String weight_category;
    private double cost;
    private int competetion;

    public Elite(String n, double w, int pclass, int comp) {
        name = n;
        weight = w;
        private_lesson = pclass;
        competetion = comp;
    }

    public String cal_weightcategory() {
        if (weight <= 66)
            weight_category = "Flyweight";
        else if (weight <= 73)
            weight_category = "Lightweight";
        else if (weight <= 81)
            weight_category = "Light Middle weight";
        else if (weight <= 90)
            weight_category = "Middle weight";
        else if (weight <= 100)
            weight_category = "Light Heavy weight";
        else
            weight_category = "Heavy weight";
        return weight_category;
    }

    public double calc_cost() {
        double training, plesson, compet_cost;
        training = 4 * 35;
        plesson = private_lesson * 9.50;
        compet_cost = competetion * 22.0;
        cost = training + plesson + compet_cost;
        return cost;
    }

}
