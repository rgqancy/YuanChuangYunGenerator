package com.yuanchuangyun.libra.dao;

import com.yuanchuangyun.libra.model.BizPriorityPerson;

public interface BizPriorityPersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insert(BizPriorityPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insertSelective(BizPriorityPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    BizPriorityPerson selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKeySelective(BizPriorityPerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_priority_person
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKey(BizPriorityPerson record);
}