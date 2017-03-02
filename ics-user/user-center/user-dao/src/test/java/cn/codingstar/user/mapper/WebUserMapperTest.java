package cn.codingstar.user.mapper;

import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.user.basic.AbstractSpringContextTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description: WebUserMapperTest
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserMapperTest.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
public class WebUserMapperTest extends AbstractSpringContextTest{

    @Autowired
    private WebUserMapper webUserMapper;

    @Test
    public void selectUserTest(){
        WebUser webUser = webUserMapper.selectByPrimaryKey(1);
        System.out.println(webUser);
    }
}
