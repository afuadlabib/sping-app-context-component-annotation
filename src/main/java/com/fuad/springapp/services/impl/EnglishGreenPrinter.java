package com.fuad.springapp.services.impl;

import com.fuad.springapp.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
}
