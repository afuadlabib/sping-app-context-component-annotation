package com.fuad.springapp.services.impl;

import com.fuad.springapp.services.BluePrinter;
import com.fuad.springapp.services.ColorPrinter;
import com.fuad.springapp.services.GreenPrinter;
import com.fuad.springapp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private final RedPrinter redPrinter;

    private final BluePrinter bluePrinter;

    private final GreenPrinter greenPrinter;

    public ColorPrinterImpl(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}

