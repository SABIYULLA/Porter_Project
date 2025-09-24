package com.SKTMovers.Porter.entity;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customer_request")  // replace with your actual table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @Column(name = "name")
    private String name;

    @JsonProperty("phone")
    @Column(name = "phone")
    private String phone;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    @JsonProperty("fromLocation")
    @Column(name = "from_location")
    private String fromLocation;

    @JsonProperty("toLocation")
    @Column(name = "to_location")
    private String toLocation;

    @JsonProperty("serviceType")
    @Column(name = "service_type")
    private String serviceType;

    @JsonProperty("additionalInfo")
    @Column(name = "additonal_info") // match the DB column name (even typo)
    private String additionalInfo;

    @JsonProperty("movingDate")
    @Column(name = "date")
    @JsonFormat(pattern = "yyyy-MM-dd")  // pattern that accepts ISO-8601 with Z
    private LocalDate movingDate;
}
