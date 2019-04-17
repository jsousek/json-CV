package com.jsoncv.demo.models.cvfields.peoplemodels;

import com.jsoncv.demo.models.CV;
import com.jsoncv.demo.services.Producible;
import lombok.*;

@Getter
@NoArgsConstructor

public class JiriSousek implements Producible {
    CV jiriSousekCV;

    @Override
    public CV produceCV(){
        return CV.builder().firstName("Jiří").build();
    }

    public void setJiriSousekCV(){
        this.jiriSousekCV = produceCV();
    }
}
