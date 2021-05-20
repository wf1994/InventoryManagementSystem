package com.inventorymanagementsystem.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventorymanagementsystem.controller.entity.MerchandiseVO;
import com.inventorymanagementsystem.mapper.MerchandiseMapper;
import com.inventorymanagementsystem.entity.Merchandise;

import java.util.List;

@Service
public class MerchandiseService {

    /**
    *@Description 业务逻辑层
            *@Param
            *@Return
            *@Author djj
            *@Date 2021/5/10
            *@Time 14:25
            */
    @Autowired
    private MerchandiseMapper merchandiseMapper;

    /**
     *  分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Merchandise> getAll(int pageNum, int pageSize, String name){
        PageHelper.startPage(pageNum, pageSize);
        List<Merchandise> merchandisePOS = merchandiseMapper.getAll(name);
        PageInfo<Merchandise> pageData = new PageInfo<Merchandise>(merchandisePOS);
        return pageData;
    }

    public boolean update(MerchandiseVO merchandiseVO){
        Merchandise merchandisePO = new Merchandise();
        BeanUtils.copyProperties(merchandiseVO,merchandisePO);
        int row = 0;
        try {
           row = merchandiseMapper.updateData(merchandisePO);
        } catch (Exception e){
            e.printStackTrace();
        }
        return row >0;
    }

}
