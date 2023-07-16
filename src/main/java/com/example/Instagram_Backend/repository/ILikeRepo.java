package com.example.Instagram_Backend.repository;

import com.example.Instagram_Backend.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepo extends JpaRepository<Like,Integer> {

}
