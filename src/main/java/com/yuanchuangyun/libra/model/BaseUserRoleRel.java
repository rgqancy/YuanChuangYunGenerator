package com.yuanchuangyun.libra.model;

public class BaseUserRoleRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_role_rel.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_role_rel.USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user_role_rel.ROLE_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user_role_rel.ID
     *
     * @return the value of base_user_role_rel.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user_role_rel.ID
     *
     * @param id the value for base_user_role_rel.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user_role_rel.USER_ID
     *
     * @return the value of base_user_role_rel.USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user_role_rel.USER_ID
     *
     * @param userId the value for base_user_role_rel.USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user_role_rel.ROLE_ID
     *
     * @return the value of base_user_role_rel.ROLE_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user_role_rel.ROLE_ID
     *
     * @param roleId the value for base_user_role_rel.ROLE_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}