package com.jsoncv.demo.models.cvfields;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
public class Address {
    String street;
    int orientationNumber;
    String City;
    int zipCode;

}
