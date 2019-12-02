package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xuchu
 * @email chu@atguigu.com
 * @date 2019-12-02 22:21:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
