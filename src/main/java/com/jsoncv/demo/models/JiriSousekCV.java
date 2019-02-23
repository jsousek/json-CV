package com.jsoncv.demo.models;

import com.jsoncv.demo.models.cvfields.*;
import lombok.*;

import java.util.Vector;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JiriSousekCV {
    String firstName;
    String surname;
    Address address;
    Contacts contacts;
    String profile;
    Vector<Experience> experiences;
    Education education;
    Vector<Technology> technologies;


}
