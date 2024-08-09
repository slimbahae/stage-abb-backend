package com.acc.detail.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OperationDTO {
    private LocalDate businessDate;
    private String networkLabel;
    private String activiteLabel;
    private Long nombreOperation;
    private BigDecimal volumeOperation;
    private Long idFichier;


    public OperationDTO(LocalDate businessDate, String networkLabel, String activiteLabel, Long nombreOperation, BigDecimal volumeOperation, Long idFichier) {

        this.businessDate = businessDate;
        this.networkLabel = networkLabel;
        this.activiteLabel = activiteLabel;
        this.nombreOperation = nombreOperation;
        this.volumeOperation = volumeOperation;
        this.idFichier = idFichier;

    }

    // Getters and Setters
    public LocalDate getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(LocalDate businessDate) {
        this.businessDate = businessDate;
    }

    public String getNetworkLabel() {
        return networkLabel;
    }

    public void setNetworkLabel(String networkLabel) {
        this.networkLabel = networkLabel;
    }

    public String getActiviteLabel() {
        return activiteLabel;
    }

    public void setActiviteLabel(String activiteLabel) {
        this.activiteLabel = activiteLabel;
    }

    public Long getNombreOperation() {
        return nombreOperation;
    }

    public void setNombreOperation(Long nombreOperation) {
        this.nombreOperation = nombreOperation;
    }

    public BigDecimal getVolumeOperation() {
        return volumeOperation;
    }

    public void setVolumeOperation(BigDecimal volumeOperation) {
        this.volumeOperation = volumeOperation;
    }

    public Long getIdFichier() {
        return idFichier;
    }

    public void setIdFichier(Long idFichier) {
        this.idFichier = idFichier;
    }
}


