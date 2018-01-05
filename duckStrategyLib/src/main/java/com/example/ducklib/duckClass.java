package com.example.ducklib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class duckClass {
    static String x, y, z, a, b, c, d, e, f;
    static HashMap<String, Double> mValMap;

    public static void main(String[] args) {
        initVars();
        initMapVal();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] variables = new String[]{x, y, z, a, b, c, d, e, f};

        try {
            System.out.println("Уравнение вида (A*x)+(B*y)+(C*z)-(D*x*y)-(E*x*z)-(F*y*z)");
            for (int i = 0; i < variables.length; i++) {
                System.out.println(String.format("Введите переменную %s=", variables[i]));
                mValMap.put(variables[i], Double.parseDouble(reader.readLine().replaceAll(",", ".")));
            }
            double res = (mValMap.get(a) * mValMap.get(x)) +
                    (mValMap.get(b) * mValMap.get(y)) +
                    (mValMap.get(c) * mValMap.get(z)) -
                    (mValMap.get(d) * mValMap.get(x) * mValMap.get(y)) -
                    (mValMap.get(e) * mValMap.get(x) * mValMap.get(z)) -
                    (mValMap.get(f) * mValMap.get(y) * mValMap.get(z));
            System.out.println(String.valueOf(res));
        } catch (Exception e) {e.printStackTrace();}

    }

    private static void initVars() {
        x = "x";
        y = "y";
        z = "z";
        a = "A";
        b = "B";
        c = "C";
        d = "D";
        e = "E";
        f = "F";
    }

    private static void initMapVal() {
        mValMap = new HashMap<>();
    }

}
