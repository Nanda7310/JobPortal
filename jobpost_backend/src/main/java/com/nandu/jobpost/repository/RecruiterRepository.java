package com.nandu.jobpost.repository;

import com.nandu.jobpost.entity.Recruiter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecruiterRepository extends MongoRepository<Recruiter, ObjectId> {
    Optional<Recruiter> findByEmail(String email);
}
