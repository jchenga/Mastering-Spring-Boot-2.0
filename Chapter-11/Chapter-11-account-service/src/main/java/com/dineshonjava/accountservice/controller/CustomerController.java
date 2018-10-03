package com.dineshonjava.accountservice.controller;

import com.dineshonjava.accountservice.domain.Customer;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "Returns customer object")
    @PostMapping("/name")
    public Customer addCustomerName(@ApiParam(name = "customer", value = "Customer object") @RequestBody Customer customer) {
        return new Customer("John", "john@apple.com", "414.608.8987", "1234 14th Ave");
    }
}
