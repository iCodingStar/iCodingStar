package cn.codingstar.user.mapper;

import cn.codingstar.model.persistent.webUser;
import cn.codingstar.model.persistent.webUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface webUserMapper {
    int countByExample(webUserExample example);

    int deleteByExample(webUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(webUser record);

    int insertSelective(webUser record);

    List<webUser> selectByExample(webUserExample example);

    webUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") webUser record, @Param("example") webUserExample example);

    int updateByExample(@Param("record") webUser record, @Param("example") webUserExample example);

    int updateByPrimaryKeySelective(webUser record);

    int updateByPrimaryKey(webUser record);
}