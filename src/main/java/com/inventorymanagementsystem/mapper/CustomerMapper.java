package com.inventorymanagementsystem.mapper;

import com.inventorymanagementsystem.entity.Customer;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    Customer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue May 11 09:42:29 GMT+08:00 2021
     */
    int updateByPrimaryKey(Customer record);
}