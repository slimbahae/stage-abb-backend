package com.acc.detail.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.acc.detail.dto.AccountFileResultDTO;
import com.acc.detail.dto.OperationDTO;
import com.acc.detail.dto.OperationResultDTO;
import com.acc.detail.entity.AccountFileActivite;
import com.acc.detail.entity.AccountFileDetail;
import com.acc.detail.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class OperationController {

    @Autowired
    private OperationService operationService;

    @GetMapping("/rejets")
    public List<AccountFileResultDTO> getAccountFilesWithStatusRAndTypeRejetT(
            @RequestParam(value="startDate", required=false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(value="endDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate
    ) {
        return operationService.getAccountFilesWithStatusRAndTypeRejetT(startDate, endDate);
    }

    @GetMapping("/rejets/details/{idFichier}")
    public List<AccountFileDetail> getAccountFileDetailsWithAccountFiles(@PathVariable Long idFichier) {
        return operationService.getAccountFileDetailsWithAccountFiles(idFichier);
    }

    @GetMapping("/details")
    public List<OperationDTO> getOperationsByFileIdAndFilters(
            @RequestParam(value="startDate", required=false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(value="endDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate,
            @RequestParam(value="statusFichier", required = false) String statusFichier,
            @RequestParam(value="networkLabel", required = false) String networkLabel,
            @RequestParam(value="activiteLabel", required = false) String activiteLabel
            ) {
        return operationService.getOperationsByFileIdAndFilters(startDate, endDate, statusFichier, networkLabel, activiteLabel);
    }


    @GetMapping("/rejets/detailed/{fileId}")
    public List<OperationResultDTO> getDetailedOperations(@PathVariable Long fileId){
        return operationService.getDetailedOperations(fileId);
    }


}
