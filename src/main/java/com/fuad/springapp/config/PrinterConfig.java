package com.fuad.springapp.config;

import com.fuad.springapp.services.BluePrinter;
import com.fuad.springapp.services.ColorPrinter;
import com.fuad.springapp.services.GreenPrinter;
import com.fuad.springapp.services.RedPrinter;
import com.fuad.springapp.services.impl.ColorPrinterImpl;
import com.fuad.springapp.services.impl.EnglishBluePrinter;
import com.fuad.springapp.services.impl.EnglishGreenPrinter;
import com.fuad.springapp.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImpl(bluePrinter, redPrinter, greenPrinter);
    }
}
