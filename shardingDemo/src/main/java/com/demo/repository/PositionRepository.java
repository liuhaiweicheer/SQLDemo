package com.demo.repository;

import com.demo.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lhw
 * @date 2020/9/20
 */
public interface PositionRepository extends JpaRepository<Position, Long> {


}
