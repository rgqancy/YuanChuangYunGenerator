package com.yuanchuangyun.libra.dao;

import com.yuanchuangyun.libra.model.BasePermission;

public interface BasePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insert(BasePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insertSelective(BasePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    BasePermission selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKeySelective(BasePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_permission
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKey(BasePermission record);
}