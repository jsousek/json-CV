package com.jsoncv.demo.services;

import com.jsoncv.demo.models.CV;
import com.jsoncv.demo.models.cvfields.peoplemodels.JiriSousek;
import com.jsoncv.demo.models.cvfields.peoplemodels.JirinaKopsova;
import org.springframework.stereotype.Service;

@Service
public class CVFactory {
    public CV createCV(String name){
        if(name.equals("jirka")){
            CV cv = new JiriSousek();
            return ((JiriSousek) cv).produceCV();
        }
        else if (name.equals("jirina")){
            CV jirinaKopsova = new JirinaKopsova();

            return ((JirinaKopsova) jirinaKopsova).produceCV();
        }
        return null;
    }
}
