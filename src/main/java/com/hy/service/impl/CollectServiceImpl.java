package com.hy.service.impl;

import com.hy.dao.CollectDao;
import com.hy.entity.Collect;
import com.hy.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollectServiceImpl implements CollectService {
    @Resource
    private CollectDao collectDao;

    @Override
    public List<Collect> getAllCollects() {
        return collectDao.getAllCollects();
    }
}