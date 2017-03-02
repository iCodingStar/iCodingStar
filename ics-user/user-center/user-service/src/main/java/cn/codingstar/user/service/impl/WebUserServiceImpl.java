package cn.codingstar.user.service.impl;

import cn.codingstar.user.mapper.WebUserMapper;
import cn.codingstar.user.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: WebUserServiceImpl
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserServiceImpl.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@Service("webUserService")
public class WebUserServiceImpl implements WebUserService{

    @Autowired
    private WebUserMapper webUserMapper;


}
