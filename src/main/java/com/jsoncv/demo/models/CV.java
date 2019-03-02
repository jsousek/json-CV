package com.jsoncv.demo.models;

import com.jsoncv.demo.models.cvfields.*;
import lombok.*;

import java.util.Vector;

@NoArgsConstructor
@AllArgsConstructor
@Getter

@Builder
public class CV {
    String firstName;
    String surname;
    Address address;
    Contacts contacts;
    String profile;
    Vector<Experience> experience;
    Education education;
    Vector<Technology> technologies;


}
