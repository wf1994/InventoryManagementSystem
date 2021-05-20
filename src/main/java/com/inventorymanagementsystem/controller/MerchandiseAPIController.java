package com.inventorymanagementsystem.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.inventorymanagementsystem.controller.entity.MerchandiseVO;
import com.inventorymanagementsystem.controller.entity.ResponseMap;
import com.inventorymanagementsystem.entity.Merchandise;
import com.inventorymanagementsystem.service.MerchandiseService;

@CrossOrigin
@RestController
@RequestMapping("/api/merchandiseAPIController")
public class MerchandiseAPIController {
    /**
     * @Description 商品信息
     * @Param
     * @Return
     * @Author djj
     * @Date 2021/5/10
     * @Time 14:01
     */
    @Autowired
    private MerchandiseService merchandiseService;


    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public PageInfo<Merchandise> getData(@RequestBody MerchandiseVO query) {
        PageInfo<Merchandise> data = merchandiseService.getAll(query.getPageNum(), query.getPageSize(), query.getName());
        return data;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ResponseMap update(@RequestBody MerchandiseVO merchandiseVO) {
        ResponseMap responseMap = new ResponseMap();
        if(merchandiseService.update(merchandiseVO)){
            responseMap.setCode(200);
        }else {
            responseMap.setCode(201);
            responseMap.setMessage("修改失败");
        }
        return responseMap;
    }


}
