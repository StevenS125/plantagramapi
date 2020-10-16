package com.plantagram.plantagramapi.Services;
import java.util.List;
import javax.transaction.Transactional;

import com.plantagram.plantagramapi.DAO.PostRepository;
import com.plantagram.plantagramapi.Models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> listAll() {
        return repo.findAll();
    }

    public void save(Post post) {
        repo.save(post);
    }

    public Post get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
