package com.hy.service.impl;

import com.hy.dao.GenreDao;
import com.hy.entity.Genre;
import com.hy.service.GenreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GenreServiceImpl implements GenreService {
    @Resource
    private GenreDao dao;

    @Override
    public List<Genre> getGenre() {
        return dao.getGenre();
    }
}
