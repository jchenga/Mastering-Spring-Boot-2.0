package com.dineshonjava.customerservice.service;

import com.dineshonjava.customerservice.domain.Account;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultAccount")
    public List<Account> findByCutomer(Integer customer) {
        return restTemplate.getForObject("http://ACCOUNT-SERVICE/account/customer/{customer}",
                List.class, customer);

    }

    public List<Account> defaultAccount(Integer customer) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(0000,1.000, 0000, "UNKNOWNN AccountType", "UNK",
                "FALLBACK BANK"));
        return accounts;
    }
 }
