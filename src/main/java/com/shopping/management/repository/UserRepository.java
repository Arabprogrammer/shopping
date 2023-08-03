package com.shopping.management.repository;

import com.shopping.base.repo.BaseRepository;
import com.shopping.management.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
}
