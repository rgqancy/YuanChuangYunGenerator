package com.yuanchuangyun.libra.dao;

import com.yuanchuangyun.libra.model.PfRolePermissionRelKey;

public interface PfRolePermissionRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pf_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int deleteByPrimaryKey(PfRolePermissionRelKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pf_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insert(PfRolePermissionRelKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pf_role_permission_rel
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insertSelective(PfRolePermissionRelKey record);
}