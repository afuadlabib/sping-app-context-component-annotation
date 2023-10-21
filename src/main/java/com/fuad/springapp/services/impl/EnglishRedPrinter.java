package com.fuad.springapp.services.impl;

import com.fuad.springapp.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
