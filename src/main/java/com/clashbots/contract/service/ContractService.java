package com.clashbots.contract.service;

import com.clashbots.contract.entity.Contract;
import com.clashbots.contract.repository.ContractRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public Contract saveContract (Contract contract) {
        log.info("inside save contract method of ContractService");
        return contractRepository.save(contract);
    }

    public Contract findContractById (Long contractId) {
        log.info("inside find contract by id method of ContractService");
        return contractRepository.findByContractId(contractId);
    }

    public String mint(Integer amount) {
        log.info("inside mint method of ContractService");
        return "Testmint | Amount: " + amount;
    }
}
