package ma.emsi.ebankingbackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.ebankingbackend.enums.OperationType;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType Type;
    @ManyToOne
    private BankAccount bankAccount;

}
