package com.example.mybuttons;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

import android.content.Context;

public class FileHelper2 {
    public static String readFile (Context context) {
        InputStream inputStream = context.getResources().openRawResource(R.raw.data);

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
        String eachline = null;
        try {
            eachline = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eachline;
    }
}
