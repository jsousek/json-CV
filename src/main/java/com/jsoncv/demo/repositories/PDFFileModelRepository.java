package com.jsoncv.demo.repositories;

import com.jsoncv.demo.models.PDFFileModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PDFFileModelRepository extends JpaRepository<PDFFileModel, Long> {
    @Override
    List<PDFFileModel> findAll();

    PDFFileModel findByName(String name);
}
