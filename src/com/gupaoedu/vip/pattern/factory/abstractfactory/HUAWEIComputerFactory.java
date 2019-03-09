package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.HUAWEIComputer;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:30
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class HUAWEIComputerFactory extends AbstractComputerFactory {
    @Override
    IDesktopComputer createDesktop() {
        return new HUAWEIDesktopComputer();
    }

    @Override
    IIntegrativeComputer createIntegrative() {
        return new HUAWEIIntgrativeComputer();
    }

    @Override
    INotBookComputer createINotBook() {
        return new HUAWEINoteBookComputer();
    }
}
