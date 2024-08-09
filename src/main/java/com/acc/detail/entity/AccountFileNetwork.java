package com.acc.detail.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "network_ref")
public class AccountFileNetwork {
    @Id
    @Column(name = "network_code", nullable = false, length = 2)
    private String networkCode;

    @Column(name = "network_label", length = 15)
    private String networkLabel;

    public String getNetworkCode() {
        return networkCode;
    }

    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    public String getNetworkLabel() {
        return networkLabel;
    }

    public void setNetworkLabel(String networkLabel) {
        this.networkLabel = networkLabel;
    }
}
