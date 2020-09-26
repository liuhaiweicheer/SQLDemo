package com.springbootjpa.springbootjpa.repository;

import com.springbootjpa.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lhw
 * @date 2020/9/26
 */
public interface UserRepository extends JpaRepository<User, Long> {



}
