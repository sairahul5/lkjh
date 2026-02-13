package com.example.namemap.repository;

import com.example.namemap.entity.NameMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameMapRepository extends JpaRepository<NameMap, Long> {
}
