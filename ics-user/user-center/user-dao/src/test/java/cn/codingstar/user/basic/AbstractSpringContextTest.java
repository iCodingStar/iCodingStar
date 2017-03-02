package cn.codingstar.user.basic;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description: AbstractSpringContextTest
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    AbstractSpringContextTest.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context-dao.xml"})
public abstract class AbstractSpringContextTest {

}
