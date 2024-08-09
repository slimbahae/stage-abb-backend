package com.acc.detail.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class OperationResultDTO {

    private LocalDate dateOper;
    private String codeArn;
    private String networkLabel;
    private String activiteLabel;
    private String codTypop;
    private String cmptDebiteur;
    private String cmptCrediteur;
    private BigDecimal montant;
    private String statut;
    private BigDecimal taxe;

    public OperationResultDTO(LocalDate dateOper, String codeArn, String networkLabel, String activiteLabel,
                              String codTypop, String cmptDebiteur, String cmptCrediteur, BigDecimal montant,
                              String statut, BigDecimal taxe) {
        this.dateOper = dateOper;
        this.codeArn = codeArn;
        this.networkLabel = networkLabel;
        this.activiteLabel = activiteLabel;
        this.codTypop = codTypop;
        this.cmptDebiteur = cmptDebiteur;
        this.cmptCrediteur = cmptCrediteur;
        this.montant = montant;
        this.statut = statut;
        this.taxe = taxe;
    }

    public LocalDate getDateOper() {
        return dateOper;
    }

    public void setDateOper(LocalDate dateOper) {
        this.dateOper = dateOper;
    }

    public String getCodeArn() {
        return codeArn;
    }

    public void setCodeArn(String codeArn) {
        this.codeArn = codeArn;
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

    public String getCodTypop() {
        return codTypop;
    }

    public void setCodTypop(String codTypop) {
        this.codTypop = codTypop;
    }

    public String getCmptDebiteur() {
        return cmptDebiteur;
    }

    public void setCmptDebiteur(String cmptDebiteur) {
        this.cmptDebiteur = cmptDebiteur;
    }

    public String getCmptCrediteur() {
        return cmptCrediteur;
    }

    public void setCmptCrediteur(String cmptCrediteur) {
        this.cmptCrediteur = cmptCrediteur;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public BigDecimal getTaxe() {
        return taxe;
    }

    public void setTaxe(BigDecimal taxe) {
        this.taxe = taxe;
    }
}
