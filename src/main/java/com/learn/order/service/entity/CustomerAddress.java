package com.learn.order.service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_address")
public class CustomerAddress extends BaseEntity {

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "country", nullable = false, length = 100)
    private String country;

    @Column(name = "zip_code", length = 100)
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false, foreignKey = @ForeignKey(name = "fk_customer_address_customer"))
    private Customer customer;
}
