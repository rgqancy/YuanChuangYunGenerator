package com.yuanchuangyun.libra.dao;

import com.yuanchuangyun.libra.model.BaseRolePermissionRel;

public interface BaseRolePermissionRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insert(BaseRolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insertSelective(BaseRolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    BaseRolePermissionRel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKeySelective(BaseRolePermissionRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKey(BaseRolePermissionRel record);
}