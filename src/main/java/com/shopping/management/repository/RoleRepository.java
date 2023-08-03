package com.shopping.management.repository;

import com.shopping.base.repo.BaseRepository;
import com.shopping.management.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends BaseRepository<Role, Long> {
}
