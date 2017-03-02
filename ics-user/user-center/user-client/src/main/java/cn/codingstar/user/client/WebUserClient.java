package cn.codingstar.user.client;

import cn.codingstar.user.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;

/**
 * Description: WebUserClient
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserClient.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@Service("webUserClient")
public class WebUserClient {

    @Autowired
    private WebUserService webUserService;
}
