package com.company;

import com.company.mes.Grid;
import com.company.mes.Loader;

import java.io.File;

public class Main {

    private Grid grid;
    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        File file = new File("Resources/dane.txt");
        Loader loader = new Loader();

        main.grid =new Grid(loader.load("Resources/dane.txt"));
    }
}
