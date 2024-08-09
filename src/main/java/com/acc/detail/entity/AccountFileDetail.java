package com.acc.detail.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="account_file_detail")

public class AccountFileDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail")
    private Long idDetail;


    @Column(name ="id_fichier")
    private Long idFichier;



    @Column(name = "type_enregistrement", length = 2)
    private String typeEnregistrement;

    @Column(name = "sequence_ligne", length = 19)
    private String sequenceLigne;

    @Column(name = "code_banque", length = 6)
    private String codeBanque;

    @Column(name = "type_operation", length = 6)
    private String typeOperation;

    @Column(name = "sequence_entrees", length = 3)
    private String sequenceEntrees;

    @Column(name = "pwc_identifiant", length = 8)
    private String pwcIdentifiant;

    @Column(name = "sequence_entree_encours", length = 8)
    private String sequenceEntreeEncours;

    @Column(name = "compte_banque", length = 32)
    private String compteBanque;

    @Column(name = "ref_document", length = 250)
    private String refDocument;

    @Column(name = "desc_type_oper", length = 80)
    private String descTypeOper;

    @Column(name = "date_envoie_entree")
    @Temporal(TemporalType.DATE)
    private LocalDate dateEnvoieEntree;

    @Column(name = "date_generation_entree")
    @Temporal(TemporalType.DATE)
    private LocalDate dateGenerationEntree;

    @Column(name = "rib_compte", length = 24)
    private String ribCompte;

    @Column(name = "cle_compte", length = 2)
    private String cleCompte;

    @Column(name = "montant", precision = 16, scale = 3)
    private BigDecimal montant;

    @Column(name = "sens_operation", length = 1)
    private String sensOperation;

    @Column(name = "code_devise", length = 3)
    private String codeDevise;

    @Column(name = "account_file_send", length = 1)
    private String accountFileSend;

    @Column(name = "date_traitement")
    @Temporal(TemporalType.DATE)
    private LocalDate dateTraitement;

    @Column(name = "code_banque_emm", length = 6)
    private String codeBanqueEmm;

    @Column(name = "code_banque_dest", length = 6)
    private String codeBanqueDest;

    @Column(name = "code_reseau", length = 2)
    private String codeReseau;

    @Column(name = "code_arn", length = 23)
    private String codeArn;

    @Column(name = "lib_compte_dest", length = 32)
    private String libCompteDest;

    @Column(name = "origine_oper", length = 32)
    private String origineOper;

    @Column(name = "code_groupement", length = 2)
    private String codeGroupement;

    @Column(name = "taux", precision = 16, scale = 3)
    private BigDecimal taux;

    @Column(name = "montant_source", precision = 16, scale = 3)
    private BigDecimal montantSource;

    @Column(name = "devise_source", length = 3)
    private String deviseSource;

    @Column(name = "statut_ligne", length = 1)
    private String statutLigne;

    @Column(name = "code_motif_rejet", precision = 3, scale = 0)
    private BigDecimal codeMotifRejet;

    @Column(name = "idencomp", precision = 12, scale = 0)
    private BigDecimal idencomp;

    @Column(name = "codburpo", precision = 5, scale = 0)
    private BigDecimal codburpo;

    @Column(name = "dateoper")
    @Temporal(TemporalType.DATE)
    private LocalDate dateoper;

    @Column(name = "numordof", precision = 6, scale = 0)
    private BigDecimal numordof;

    @Column(name = "activite_code")
    private Integer activiteCode;

    // Getters


    public Long getIdDetail() {
        return idDetail;
    }



    public String getTypeEnregistrement() {
        return typeEnregistrement;
    }

    public String getSequenceLigne() {
        return sequenceLigne;
    }

    public String getCodeBanque() {
        return codeBanque;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public String getSequenceEntrees() {
        return sequenceEntrees;
    }

    public String getPwcIdentifiant() {
        return pwcIdentifiant;
    }

    public String getSequenceEntreeEncours() {
        return sequenceEntreeEncours;
    }

    public String getCompteBanque() {
        return compteBanque;
    }

    public String getRefDocument() {
        return refDocument;
    }

    public String getDescTypeOper() {
        return descTypeOper;
    }

    public LocalDate getDateEnvoieEntree() {
        return dateEnvoieEntree;
    }

    public LocalDate getDateGenerationEntree() {
        return dateGenerationEntree;
    }

    public String getRibCompte() {
        return ribCompte;
    }

    public String getCleCompte() {
        return cleCompte;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public String getSensOperation() {
        return sensOperation;
    }

    public String getCodeDevise() {
        return codeDevise;
    }

    public String getAccountFileSend() {
        return accountFileSend;
    }

    public LocalDate getDateTraitement() {
        return dateTraitement;
    }

    public String getCodeBanqueEmm() {
        return codeBanqueEmm;
    }

    public String getCodeBanqueDest() {
        return codeBanqueDest;
    }

    public String getCodeReseau() {
        return codeReseau;
    }

    public String getCodeArn() {
        return codeArn;
    }

    public String getLibCompteDest() {
        return libCompteDest;
    }

    public String getOrigineOper() {
        return origineOper;
    }

    public String getCodeGroupement() {
        return codeGroupement;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public BigDecimal getMontantSource() {
        return montantSource;
    }

    public String getDeviseSource() {
        return deviseSource;
    }

    public String getStatutLigne() {
        return statutLigne;
    }

    public BigDecimal getCodeMotifRejet() {
        return codeMotifRejet;
    }

    public BigDecimal getIdencomp() {
        return idencomp;
    }

    public BigDecimal getCodburpo() {
        return codburpo;
    }

    public LocalDate getDateoper() {
        return dateoper;
    }

    public BigDecimal getNumordof() {
        return numordof;
    }

    public Integer getActiviteCode() {
        return activiteCode;
    }

}