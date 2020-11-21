package com.zsquare.ezpzservices.api;

//import io.swagger.annotations.*;
import com.zsquare.ezpzservices.model.ServiceProvider;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
//@Api(value = "Group reservations API")
public interface ProvidersApi {
/*
    @ApiOperation(
            value = "Retrieves all group reservations for a property for given date range",
            response = GroupReservation.class,
            responseContainer = "List",
            tags = {"groupReservations"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful. Returns the group reservations", response = GroupReservation.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "User is not authenticated", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "User is forbidden", response = ErrorResponse.class)
    })
*/

    @GetMapping(value = "/v1/api/{providerId}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ServiceProvider> getProviders(@PathVariable("providerId") UUID providerId);
}