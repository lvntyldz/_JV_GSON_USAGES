package com.company.service.impl;

import com.company.model.Color;
import com.company.service.JsonHandlerService;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by root on 4/12/15.
 */
public class JsonHandlerServiceImpl implements JsonHandlerService {

    @Override
    public Color readFromJson(String filePath) {

        Gson gson = new Gson();
        Color color = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader buffReader = new BufferedReader(fileReader);

             color = gson.fromJson(buffReader,Color.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return color;
    }

}