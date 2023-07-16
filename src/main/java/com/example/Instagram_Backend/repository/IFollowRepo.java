package com.example.Instagram_Backend.repository;

import com.example.Instagram_Backend.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowRepo extends JpaRepository<Follow,Integer> {
}
