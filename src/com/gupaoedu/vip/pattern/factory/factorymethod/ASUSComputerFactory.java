package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ASUSIComputer;
import com.gupaoedu.vip.pattern.factory.IComputer;

/**
 * 描述：华硕的工厂类
 *
 * @auther yangke
 * @date 2019/3/8 22:15
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class ASUSComputerFactory implements IComputerFactory {
    @Override
    public IComputer createComputer() {
        return new ASUSIComputer();
    }
}
