package com.yuanchuangyun.libra.model;

import java.util.Date;

public class BizInvoice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.PROJECT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.INSTRUCTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String instruction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.UPLOAD_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date uploadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.LOCATION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date creationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String creationUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String lastUpdateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String deleteUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_invoice.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer markDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.ID
     *
     * @return the value of biz_invoice.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.ID
     *
     * @param id the value for biz_invoice.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.PROJECT_ID
     *
     * @return the value of biz_invoice.PROJECT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.PROJECT_ID
     *
     * @param projectId the value for biz_invoice.PROJECT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.INSTRUCTION
     *
     * @return the value of biz_invoice.INSTRUCTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.INSTRUCTION
     *
     * @param instruction the value for biz_invoice.INSTRUCTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.UPLOAD_TIME
     *
     * @return the value of biz_invoice.UPLOAD_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.UPLOAD_TIME
     *
     * @param uploadTime the value for biz_invoice.UPLOAD_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.LOCATION
     *
     * @return the value of biz_invoice.LOCATION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.LOCATION
     *
     * @param location the value for biz_invoice.LOCATION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.CREATION_TIME
     *
     * @return the value of biz_invoice.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.CREATION_TIME
     *
     * @param creationTime the value for biz_invoice.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.CREATION_USER_ID
     *
     * @return the value of biz_invoice.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.CREATION_USER_ID
     *
     * @param creationUserId the value for biz_invoice.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId == null ? null : creationUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.LAST_UPDATE_TIME
     *
     * @return the value of biz_invoice.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for biz_invoice.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.LAST_UPDATE_USER_ID
     *
     * @return the value of biz_invoice.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.LAST_UPDATE_USER_ID
     *
     * @param lastUpdateUserId the value for biz_invoice.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.DELETE_TIME
     *
     * @return the value of biz_invoice.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.DELETE_TIME
     *
     * @param deleteTime the value for biz_invoice.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.DELETE_USER_ID
     *
     * @return the value of biz_invoice.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.DELETE_USER_ID
     *
     * @param deleteUserId the value for biz_invoice.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_invoice.MARK_DELETE
     *
     * @return the value of biz_invoice.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_invoice.MARK_DELETE
     *
     * @param markDelete the value for biz_invoice.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setMarkDelete(Integer markDelete) {
        this.markDelete = markDelete;
    }
}