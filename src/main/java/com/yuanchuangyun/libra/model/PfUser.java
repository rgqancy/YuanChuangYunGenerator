package com.yuanchuangyun.libra.model;

import java.util.Date;

public class PfUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.USERNAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.PASSWORD
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.TYPE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.CREATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.CREATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String lastUpdateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pf_user.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String markDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.ID
     *
     * @return the value of pf_user.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.ID
     *
     * @param id the value for pf_user.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.USERNAME
     *
     * @return the value of pf_user.USERNAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.USERNAME
     *
     * @param username the value for pf_user.USERNAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.PASSWORD
     *
     * @return the value of pf_user.PASSWORD
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.PASSWORD
     *
     * @param password the value for pf_user.PASSWORD
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.TYPE
     *
     * @return the value of pf_user.TYPE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.TYPE
     *
     * @param type the value for pf_user.TYPE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.CREATE_TIME
     *
     * @return the value of pf_user.CREATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.CREATE_TIME
     *
     * @param createTime the value for pf_user.CREATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.CREATE_USER_ID
     *
     * @return the value of pf_user.CREATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.CREATE_USER_ID
     *
     * @param createUserId the value for pf_user.CREATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.DELETE_TIME
     *
     * @return the value of pf_user.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.DELETE_TIME
     *
     * @param deleteTime the value for pf_user.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.LAST_UPDATE_TIME
     *
     * @return the value of pf_user.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for pf_user.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.LAST_UPDATE_USER_ID
     *
     * @return the value of pf_user.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.LAST_UPDATE_USER_ID
     *
     * @param lastUpdateUserId the value for pf_user.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pf_user.MARK_DELETE
     *
     * @return the value of pf_user.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pf_user.MARK_DELETE
     *
     * @param markDelete the value for pf_user.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete == null ? null : markDelete.trim();
    }
}