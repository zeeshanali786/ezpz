package com.zsquare.ezpzservices.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@ToString
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class ServiceProvider implements Serializable {

    private UUID ProviderId;
    private String Name;
  // private Address providerAddress;
}