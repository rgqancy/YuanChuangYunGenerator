package com.yuanchuangyun.libra.dao;

import com.yuanchuangyun.libra.model.BizLinkman;

public interface BizLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insert(BizLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int insertSelective(BizLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    BizLinkman selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKeySelective(BizLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_linkman
     *
     * @mbg.generated Wed Oct 19 17:51:59 CST 2016
     */
    int updateByPrimaryKey(BizLinkman record);
}