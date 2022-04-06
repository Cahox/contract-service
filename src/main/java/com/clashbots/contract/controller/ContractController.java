package com.clashbots.contract.controller;

import com.clashbots.contract.entity.Contract;
import com.clashbots.contract.service.ContractService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contracts")
@Slf4j
public class ContractController {
    @Autowired
    private ContractService contractService;

    @PostMapping("/")
    public Contract saveContract(@RequestBody Contract contract){
        log.info("inside save contract method of ContractController");
        return contractService.saveContract(contract);
    }

    @GetMapping("/mint/{amount}") //SHOULD BE POST
    public String mint(@PathVariable("amount") Integer amount){
        log.info("inside save contract method of ContractController");
        return contractService.mint(amount);
    }

    @GetMapping("/{id}")
    public Contract findContractById(@PathVariable("id") Long contractId){
        log.info("inside find contract by id method of ContractController");
        return contractService.findContractById(contractId);
    }
}
