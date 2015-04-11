package com.company.controller;

import com.company.model.Color;
import com.company.model.Colors;
import com.company.service.JsonHandlerService;
import com.company.service.impl.JsonHandlerServiceImpl;

import java.util.List;

/**
 * Created by root on 4/12/15.
 */
public class Run {


    public static void main(String[] args) {

        JsonHandlerService jsonHandler = new JsonHandlerServiceImpl();

        Color color = jsonHandler.readFromJson("/home/levent/_projects/_projects-demo/_JV_GSON_USAGES/json.data");

        List<Colors> colors =  color.getColorsArray();

        System.out.println("hexValue :: " + color.getHexValue());
        System.out.println("colorName :: " + color.getColorName());
        System.out.println("colorsArray/Blue :: " + colors.get(0).getBlue());
        System.out.println("colorsArray/Red :: " + colors.get(0).getRed());
        System.out.println("colorsArray/Green :: " + colors.get(0).getGreen());

    }

}
