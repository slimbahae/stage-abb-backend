package com.acc.detail.service;

import com.acc.detail.dto.AccountFileResultDTO;
import com.acc.detail.dto.OperationDTO;
import com.acc.detail.dto.OperationResultDTO;
import com.acc.detail.entity.AccountFileActivite;
import com.acc.detail.entity.AccountFileDetail;
import com.acc.detail.repo.AccountingFileDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class OperationService {

    @Autowired
    private AccountingFileDetailRepo accountingFileDetailRepo;

    public List<OperationDTO> getOperationsByFileIdAndFilters(LocalDate startDate, LocalDate endDate, String statusFichier, String networkLabel, String activiteLabel) {
        return accountingFileDetailRepo.findOperationsByFileIdAndFilters(startDate, endDate, statusFichier, networkLabel, activiteLabel);
    }

    public List<AccountFileResultDTO> getAccountFilesWithStatusRAndTypeRejetT(LocalDate startDate, LocalDate endDate) {
        return accountingFileDetailRepo.findAccountFilesWithStatusRAndTypeRejetT(startDate, endDate);
    }

    public List<AccountFileDetail> getAccountFileDetailsWithAccountFiles(Long idFichier) {
        return accountingFileDetailRepo.findAccountFileDetailsWithAccountFiles(idFichier);
    }

    public List<OperationResultDTO> getDetailedOperations (Long fileId) {
        return accountingFileDetailRepo.findDetailedOperations(fileId);
    }


}
