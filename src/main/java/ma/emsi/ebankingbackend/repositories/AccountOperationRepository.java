package ma.emsi.ebankingbackend.repositories;

import ma.emsi.ebankingbackend.entities.AccountOperation;
import ma.emsi.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}

