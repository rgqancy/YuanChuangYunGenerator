package com.yuanchuangyun.libra.model;

import java.util.Date;

public class BizStyle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.NAME_ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String nameAbbr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String abbr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String treePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String isLeaf;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date creationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String creationUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String lastUpdateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String deleteUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_style.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Integer markDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.ID
     *
     * @return the value of biz_style.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.ID
     *
     * @param id the value for biz_style.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.NAME
     *
     * @return the value of biz_style.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.NAME
     *
     * @param name the value for biz_style.NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.NAME_ABBR
     *
     * @return the value of biz_style.NAME_ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getNameAbbr() {
        return nameAbbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.NAME_ABBR
     *
     * @param nameAbbr the value for biz_style.NAME_ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr == null ? null : nameAbbr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.CODE
     *
     * @return the value of biz_style.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.CODE
     *
     * @param code the value for biz_style.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.ABBR
     *
     * @return the value of biz_style.ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.ABBR
     *
     * @param abbr the value for biz_style.ABBR
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr == null ? null : abbr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.DESCRIPTION
     *
     * @return the value of biz_style.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.DESCRIPTION
     *
     * @param description the value for biz_style.DESCRIPTION
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.PARENT_ID
     *
     * @return the value of biz_style.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.PARENT_ID
     *
     * @param parentId the value for biz_style.PARENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.TREE_PATH
     *
     * @return the value of biz_style.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.TREE_PATH
     *
     * @param treePath the value for biz_style.TREE_PATH
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.IS_LEAF
     *
     * @return the value of biz_style.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.IS_LEAF
     *
     * @param isLeaf the value for biz_style.IS_LEAF
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.ORDER_NO
     *
     * @return the value of biz_style.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.ORDER_NO
     *
     * @param orderNo the value for biz_style.ORDER_NO
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.CREATION_TIME
     *
     * @return the value of biz_style.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.CREATION_TIME
     *
     * @param creationTime the value for biz_style.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.CREATION_USER_ID
     *
     * @return the value of biz_style.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.CREATION_USER_ID
     *
     * @param creationUserId the value for biz_style.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId == null ? null : creationUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.LAST_UPDATE_TIME
     *
     * @return the value of biz_style.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.LAST_UPDATE_TIME
     *
     * @param lastUpdateTime the value for biz_style.LAST_UPDATE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.LAST_UPDATE_USER_ID
     *
     * @return the value of biz_style.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.LAST_UPDATE_USER_ID
     *
     * @param lastUpdateUserId the value for biz_style.LAST_UPDATE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.DELETE_TIME
     *
     * @return the value of biz_style.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.DELETE_TIME
     *
     * @param deleteTime the value for biz_style.DELETE_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.DELETE_USER_ID
     *
     * @return the value of biz_style.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.DELETE_USER_ID
     *
     * @param deleteUserId the value for biz_style.DELETE_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_style.MARK_DELETE
     *
     * @return the value of biz_style.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Integer getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_style.MARK_DELETE
     *
     * @param markDelete the value for biz_style.MARK_DELETE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setMarkDelete(Integer markDelete) {
        this.markDelete = markDelete;
    }
}