package com.yuanchuangyun.libra.model;

import java.util.Date;

public class BasePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String treePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String isLeaf;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date creationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String creationUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String lastUpdateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String deleteUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_permission.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer markDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.ID
     *
     * @return the value of base_permission.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.ID
     *
     * @param id the value for base_permission.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.NAME
     *
     * @return the value of base_permission.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.NAME
     *
     * @param name the value for base_permission.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.CODE
     *
     * @return the value of base_permission.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.CODE
     *
     * @param code the value for base_permission.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.DESCRIPTION
     *
     * @return the value of base_permission.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.DESCRIPTION
     *
     * @param description the value for base_permission.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.PARENT_ID
     *
     * @return the value of base_permission.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.PARENT_ID
     *
     * @param parentId the value for base_permission.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.TREE_PATH
     *
     * @return the value of base_permission.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.TREE_PATH
     *
     * @param treePath the value for base_permission.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.IS_LEAF
     *
     * @return the value of base_permission.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.IS_LEAF
     *
     * @param isLeaf the value for base_permission.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.ORDER_NO
     *
     * @return the value of base_permission.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.ORDER_NO
     *
     * @param orderNo the value for base_permission.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.CREATION_TIME
     *
     * @return the value of base_permission.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.CREATION_TIME
     *
     * @param creationTime the value for base_permission.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.CREATION_USER_ID
     *
     * @return the value of base_permission.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.CREATION_USER_ID
     *
     * @param creationUserId the value for base_permission.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId == null ? null : creationUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.LAST_UPDATE_TIME
     *
     * @return the value of base_permission.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for base_permission.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.LAST_UPDATE_USER_ID
     *
     * @return the value of base_permission.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.LAST_UPDATE_USER_ID
     *
     * @param lastUpdateUserId the value for base_permission.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.DELETE_TIME
     *
     * @return the value of base_permission.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.DELETE_TIME
     *
     * @param deleteTime the value for base_permission.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.DELETE_USER_ID
     *
     * @return the value of base_permission.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.DELETE_USER_ID
     *
     * @param deleteUserId the value for base_permission.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_permission.MARK_DELETE
     *
     * @return the value of base_permission.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_permission.MARK_DELETE
     *
     * @param markDelete the value for base_permission.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setMarkDelete(Integer markDelete) {
        this.markDelete = markDelete;
    }
}