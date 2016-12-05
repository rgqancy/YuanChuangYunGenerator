package com.yuanchuangyun.libra.model;

import java.util.Date;

public class BizPriorityInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.PATENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String patentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.PRIORITY_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String priorityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.COUNTRY_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String countryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.PRIORITY_NUMBER
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private String priorityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_priority_info.PRIORITY_DATE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    private Date priorityDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.ID
     *
     * @return the value of biz_priority_info.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.ID
     *
     * @param id the value for biz_priority_info.ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.PATENT_ID
     *
     * @return the value of biz_priority_info.PATENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getPatentId() {
        return patentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.PATENT_ID
     *
     * @param patentId the value for biz_priority_info.PATENT_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setPatentId(String patentId) {
        this.patentId = patentId == null ? null : patentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.PRIORITY_NAME
     *
     * @return the value of biz_priority_info.PRIORITY_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getPriorityName() {
        return priorityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.PRIORITY_NAME
     *
     * @param priorityName the value for biz_priority_info.PRIORITY_NAME
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName == null ? null : priorityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.COUNTRY_ID
     *
     * @return the value of biz_priority_info.COUNTRY_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.COUNTRY_ID
     *
     * @param countryId the value for biz_priority_info.COUNTRY_ID
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.PRIORITY_NUMBER
     *
     * @return the value of biz_priority_info.PRIORITY_NUMBER
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public String getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.PRIORITY_NUMBER
     *
     * @param priorityNumber the value for biz_priority_info.PRIORITY_NUMBER
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setPriorityNumber(String priorityNumber) {
        this.priorityNumber = priorityNumber == null ? null : priorityNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_priority_info.PRIORITY_DATE
     *
     * @return the value of biz_priority_info.PRIORITY_DATE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public Date getPriorityDate() {
        return priorityDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_priority_info.PRIORITY_DATE
     *
     * @param priorityDate the value for biz_priority_info.PRIORITY_DATE
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    public void setPriorityDate(Date priorityDate) {
        this.priorityDate = priorityDate;
    }
}