package com.company.mes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by callo on 13-01-2016.
 */
public class Loader {

    public Loader() {

    }

    public Data load(String filepath){
        try {
            FileReader file = new FileReader(filepath);
            BufferedReader buffer = new BufferedReader(file);
            ArrayList<Float>values = new ArrayList<>();
            String line="";
            try {
                while((line = buffer.readLine())!= null){

                    String [] words = line.split(" ");
                    values.add(Float.parseFloat(words[1]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            buffer.close();
            stackToData(values);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Data();
    }
    public Data stackToData(ArrayList<Float> values){
        Data data = new Data();
        data.setRmin(values.get(0));
        data.setRmax(values.get(1));
        data.setAlfaAir(values.get(2));
        data.setTempBegin(values.get(3));
        data.setTempAir(values.get(4));
        data.setC(values.get(5));
        data.setRo(values.get(6));
        data.setK(values.get(7));
        data.setTauMax(values.get(8));

        System.out.println(data.toString());
        return data;
    }
}
