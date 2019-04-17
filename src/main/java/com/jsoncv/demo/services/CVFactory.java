package com.jsoncv.demo.services;

import com.jsoncv.demo.models.CV;
import com.jsoncv.demo.models.cvfields.peoplemodels.JiriSousek;
import com.jsoncv.demo.models.cvfields.peoplemodels.JirinaKopsova;
import org.springframework.stereotype.Service;

@Service
public class CVFactory {
    public Object createCV(String name){
        if(name.equals("jirka")){
            JiriSousek jiriSousek = new JiriSousek();
            jiriSousek.setJiriSousekCV();
            return jiriSousek;
        }
        else if (name.equals("jirina")){
            CV jirinaKopsova = new JirinaKopsova();
            ((JirinaKopsova) jirinaKopsova).produceCV();

            return jirinaKopsova;
        }
        return null;
    }
}
