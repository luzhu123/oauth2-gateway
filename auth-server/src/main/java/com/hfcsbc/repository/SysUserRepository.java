package com.hfcsbc.repository;

import com.hfcsbc.domain.SysUser;
import com.hfcsbc.repository.support.WiselyRepository;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.Entity;
import java.util.Optional;


public interface SysUserRepository extends WiselyRepository<SysUser,Long> {
    Optional<SysUser> findOneWithRolesByUsername(String username);
}
