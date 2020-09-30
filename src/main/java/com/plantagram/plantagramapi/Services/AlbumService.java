package com.plantagram.plantagramapi.Services;

import com.plantagram.plantagramapi.DAO.AlbumRepository;
import com.plantagram.plantagramapi.Models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlbumService {

    @Autowired
    private AlbumRepository repo;

    public List<Album> listAll() {
        return repo.findAll();
    }

    public void save(Album album) {
        repo.save(album);
    }

    public Album get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
