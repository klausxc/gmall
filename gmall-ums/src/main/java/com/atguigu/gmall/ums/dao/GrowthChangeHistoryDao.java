package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author xuchu
 * @email chu@atguigu.com
 * @date 2019-12-02 22:30:08
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
