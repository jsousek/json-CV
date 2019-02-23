package com.jsoncv.demo.models;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Company {
    @Id
    @GeneratedValue
    long id;
    @NotNull
    String company;
}
