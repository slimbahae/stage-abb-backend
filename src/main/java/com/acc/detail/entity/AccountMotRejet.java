package com.acc.detail.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "acct_file_mot_rejet")
public class AccountMotRejet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_mot_rejet", unique = true, nullable = false)
    private Long codeMotRejet;

    @Column(name = "libelle_mot_rejet")
    private String libelleMotRejet;

    @Column(name = "type_rejet")
    private Character typeRejet;


    public String getLibelleMotRejet() {
        return libelleMotRejet;
    }

    public void setLibelleMotRejet(String libelleMotRejet) {
        this.libelleMotRejet = libelleMotRejet;
    }

    public Long getCodeMotRejet() {
        return codeMotRejet;
    }

    public void setCodeMotRejet(Long codeMotRejet) {
        this.codeMotRejet = codeMotRejet;
    }

}
