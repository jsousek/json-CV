package com.jsoncv.demo.models.cvfields.peoplemodels;

import com.jsoncv.demo.models.CV;
import com.jsoncv.demo.services.Producible;
import lombok.*;

@NoArgsConstructor
@Getter
public class JirinaKopsova extends CV implements Producible {

    @Override
    public CV produceCV(){
        return null;
    }

}
