package com.clashbots.contract.repository;

import com.clashbots.contract.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    Contract findByContractId(Long contractId);
}
