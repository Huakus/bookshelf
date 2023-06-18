package com.huakus.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.huakus.bookshelf.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
