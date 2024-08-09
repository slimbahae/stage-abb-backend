package com.acc.detail.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "activite_acct_file")
public class AccountFileActivite {

    @Id
    @Column(name = "activite_code", nullable = false)
    private Integer activiteCode;

    @Column(name = "activite_label", length = 100)
    private String activiteLabel;

    public Integer getActiviteCode() {
        return activiteCode;
    }

    public String getActiviteLabel() {
        return activiteLabel;
    }

    public void setActiviteLabel(String activiteLabel) {
        this.activiteLabel = activiteLabel;
    }

    public void setActiviteCode(Integer activiteCode) {
        this.activiteCode = activiteCode;
    }
}