package com.huakus.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.huakus.bookshelf.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
