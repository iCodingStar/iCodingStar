package cn.codingstar.user.client;

import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.user.common.UserResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description: WebUserClientTest
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserClientTest.java
 *          Create at:   2017/3/3
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/3           iCodingStar       1.0       1.0 Version
 */
public class WebUserClientTest extends AbstractSpringContextTest {

    @Autowired
    private WebUserClient webUserClient;

    @Test
    public void registerTest() {
        WebUser webUser = new WebUser();
        webUser.setUsername("iCodingStar");
        webUser.setPassword("xs12346");
        UserResult<WebUser> result = webUserClient.register(webUser);
        System.out.println(result);
    }

    @Test
    public void loginTest() {
        WebUser webUser = new WebUser();
        webUser.setUsername("iCodingStar");
        webUser.setPassword("xs1234");
        UserResult<WebUser> result = webUserClient.login(webUser);
        System.out.println(result);
    }
}
