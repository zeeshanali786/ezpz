package com.zsquare.ezpzservices.controller;

import com.zsquare.ezpzservices.api.ProvidersApi;
import com.zsquare.ezpzservices.model.ServiceProvider;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class ProvidersController implements ProvidersApi {

    public ProvidersController() {

    }

    @Override
    public ResponseEntity<ServiceProvider> getProviders(UUID providerId) {

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setName("SkyWay Masala");
        serviceProvider.setProviderId(providerId);
        return ResponseEntity.ok(serviceProvider);

    }
}
