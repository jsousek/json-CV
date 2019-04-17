package com.jsoncv.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor

@Entity
public class PDFFileModel {
    @Id
    @GeneratedValue
    long id;
    String name;
    @Lob
    @Column(name = "pdf", columnDefinition = "BLOB")
    byte[] cvInPdf;
}
