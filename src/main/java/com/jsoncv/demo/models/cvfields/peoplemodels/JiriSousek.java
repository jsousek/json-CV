package com.jsoncv.demo.models.cvfields.peoplemodels;

import com.jsoncv.demo.models.CV;
import com.jsoncv.demo.services.Producible;
import lombok.*;

@Getter
@NoArgsConstructor

public class JiriSousek extends CV implements Producible {

    @Override
    public CV produceCV(){
        return CV.builder().firstName("Jiří").build();
    }
}
