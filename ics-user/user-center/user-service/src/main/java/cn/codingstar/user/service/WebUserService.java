package cn.codingstar.user.service;

import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.user.common.UserResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description: WebUserService
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserService.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
public interface WebUserService {

    WebUser register(WebUser registerUser);

    WebUser login(WebUser loginUser);

}
