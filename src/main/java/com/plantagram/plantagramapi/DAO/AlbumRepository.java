package com.plantagram.plantagramapi.DAO;

import com.plantagram.plantagramapi.Models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
