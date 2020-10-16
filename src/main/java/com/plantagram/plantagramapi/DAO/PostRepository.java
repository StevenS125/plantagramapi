package com.plantagram.plantagramapi.DAO;
import com.plantagram.plantagramapi.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

