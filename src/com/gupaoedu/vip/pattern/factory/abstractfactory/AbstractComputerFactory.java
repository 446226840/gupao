package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:20
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public abstract class AbstractComputerFactory {

   abstract IDesktopComputer createDesktop();

   abstract IIntegrativeComputer createIntegrative();

   abstract INotBookComputer createINotBook();
}
