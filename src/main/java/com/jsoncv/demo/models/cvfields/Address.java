package com.jsoncv.demo.models.cvfields;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    String street;
    int orientationNumber;
    String City;
    int zipCode;

}
