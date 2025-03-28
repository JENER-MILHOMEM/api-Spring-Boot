package com.chama.nocrud.repositories;

import com.chama.nocrud.models.peopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface peopleRepositories extends JpaRepository<peopleModel, UUID> {

}
