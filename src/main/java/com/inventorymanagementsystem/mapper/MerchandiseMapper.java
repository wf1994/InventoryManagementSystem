package com.inventorymanagementsystem.mapper;

import com.inventorymanagementsystem.entity.Merchandise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MerchandiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int insert(Merchandise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int insertSelective(Merchandise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    Merchandise selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Merchandise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandise
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int updateByPrimaryKey(Merchandise record);

        /**
         * 查询数据
         * @return
         */
        List<Merchandise> getAll(@Param(value = "name") String name);

        int updateData(Merchandise merchandisePO);

}
