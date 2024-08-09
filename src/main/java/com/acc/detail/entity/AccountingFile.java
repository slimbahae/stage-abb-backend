package com.acc.detail.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "account_file")
public class AccountingFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fichier")
    private Long idFichier;



    @Column (name= "code_mot_rejet")
    private Long codeMotRejet;

    @Column(name = "nom_fichier", nullable = false)
    private String nomFichier;

    @Column(name = "date_generation_fichier", nullable = false)
    private LocalDateTime dateGenerationFichier;

    @Column(name = "business_date", nullable = false)
    private LocalDate businessDate;

    @Column(name = "nbre_ligne_fichier", nullable = false)
    private Integer nbreLigneFichier;

    @Column(name = "date_chargement_fichier", nullable = false)
    private LocalDateTime dateChargementFichier;

    @Column(name = "date_traitement_fichier", nullable = false)
    private LocalDate dateTraitementFichier;

    @Column(name = "statut_fichier", nullable = false)
    private String statutFichier;

    @Column(name = "version_fichier", nullable = false)
    private String versionFichier;

    @Column(name = "total_credit", nullable = false)
    private BigDecimal totalCredit;

    @Column(name = "total_debit", nullable = false)
    private BigDecimal totalDebit;

    @Column(name = "path_file", nullable = false)
    private String pathFile;

    // Getters
    public Long getIdFichier() {
        return idFichier;
    }

    public Long getCodeMotRejet() {return codeMotRejet; }

    public String getNomFichier() {
        return nomFichier;
    }

    public LocalDateTime getDateGenerationFichier() {
        return dateGenerationFichier;
    }

    public LocalDate getBusinessDate() {
        return businessDate;
    }

    public Integer getNbreLigneFichier() {
        return nbreLigneFichier;
    }

    public LocalDateTime getDateChargementFichier() {
        return dateChargementFichier;
    }

    public LocalDateTime getDateTraitementFichier() {
        return dateTraitementFichier.atStartOfDay();
    }

    public String getStatutFichier() {
        return statutFichier;
    }

    public String getVersionFichier() {
        return versionFichier;
    }

    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    public BigDecimal getTotalDebit() {
        return totalDebit;
    }

    public String getPathFile() {
        return pathFile;
    }
}
