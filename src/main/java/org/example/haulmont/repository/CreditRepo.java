package org.example.haulmont.repository;

import org.example.haulmont.domain.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Repository
public interface CreditRepo extends JpaRepository<Credit, UUID> {

    Set<Credit> findAllByInterestRateBefore(BigDecimal rateTo);

    Set<Credit> findAllByLimitAfter(BigDecimal limitFrom);

}
