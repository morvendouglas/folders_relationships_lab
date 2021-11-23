package com.codeclan.example.relationships.repositories;

import com.codeclan.example.relationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}