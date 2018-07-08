package com.dineshonjava.accountservice.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Api(value="/customer", description = "Manage Customer")
public class CustomerController {

    @ApiOperation(value="Returns customer name")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message="100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Return Customr Name")
            }
    )
    @GetMapping("/name")
    public String customerName(@ApiParam(name = "customerName", value = "Customer Name")String customerName) {
        return "Jack Cheng";
    }

    @PostMapping("/name")
    public String addCustomerName(@ApiParam(name="customerName", value = "Customer Name")String customerName) {
        return "Jack Cheng ...";
    }
}
