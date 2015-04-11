package com.company.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 4/12/15.
 */
public class Color {

    private String colorName;
    private String hexValue;
    private List<Colors> colorsArray = new ArrayList<Colors>();

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public List<Colors> getColorsArray() {
        return colorsArray;
    }

    public void setColorsArray(List<Colors> colorsArray) {
        this.colorsArray = colorsArray;
    }
}
