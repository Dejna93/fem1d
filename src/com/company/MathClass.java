package com.company;

import java.lang.reflect.Array;

/**
 * Created by callo on 12-01-2016.
 */
public class MathClass {


    public static double E[] = new double[2];
    public static double W = 1;

    public double N[] = new double[2];


    public MathClass() {
        E[0] = 0.577;
        E[1] = -0.577;
        N[0] = 0.5 * (1-E[0]);
        N[1] = 0.5 * (1-E[1]);
    }





}
