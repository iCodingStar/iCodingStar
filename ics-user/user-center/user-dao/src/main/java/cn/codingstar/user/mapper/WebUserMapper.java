package cn.codingstar.user.mapper;

import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.model.persistent.WebUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebUserMapper {
    int countByExample(WebUserExample example);

    int deleteByExample(WebUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebUser record);

    int insertSelective(WebUser record);

    List<WebUser> selectByExample(WebUserExample example);

    WebUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebUser record, @Param("example") WebUserExample example);

    int updateByExample(@Param("record") WebUser record, @Param("example") WebUserExample example);

    int updateByPrimaryKeySelective(WebUser record);

    int updateByPrimaryKey(WebUser record);
}