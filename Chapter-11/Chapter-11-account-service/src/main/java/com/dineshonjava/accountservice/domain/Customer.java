package com.dineshonjava.accountservice.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Customer", description = "Customer resource representation")
public class Customer {
    @ApiModelProperty(notes = "Customer Name")
    private String name;
    @ApiModelProperty(notes = "Customer email address")
    private String email;
    @ApiModelProperty(notes = "Customer mobile")
    private String mobile;
    @ApiModelProperty(notes = "Customer address")
    private String address;

    public Customer() {}

    public Customer(String name, String email, String mobile, String address) {
        super();
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
