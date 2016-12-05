package com.yuanchuangyun.libra.model;

import java.util.Date;

public class BizObjectGroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_object_group.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_object_group.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_object_group.FIELD_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String fieldName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_object_group.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date creationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_object_group.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String creationUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_object_group.ID
     *
     * @return the value of biz_object_group.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_object_group.ID
     *
     * @param id the value for biz_object_group.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_object_group.CODE
     *
     * @return the value of biz_object_group.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_object_group.CODE
     *
     * @param code the value for biz_object_group.CODE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_object_group.FIELD_NAME
     *
     * @return the value of biz_object_group.FIELD_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_object_group.FIELD_NAME
     *
     * @param fieldName the value for biz_object_group.FIELD_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_object_group.CREATION_TIME
     *
     * @return the value of biz_object_group.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_object_group.CREATION_TIME
     *
     * @param creationTime the value for biz_object_group.CREATION_TIME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_object_group.CREATION_USER_ID
     *
     * @return the value of biz_object_group.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_object_group.CREATION_USER_ID
     *
     * @param creationUserId the value for biz_object_group.CREATION_USER_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId == null ? null : creationUserId.trim();
    }
}