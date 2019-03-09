package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IComputer;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:17
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class FactorMethodTest {
    public static void main(String[] args) {
        ASUSComputerFactory asusComputerFactory = new ASUSComputerFactory();
       IComputer IComputer = asusComputerFactory.createComputer();
        IComputer.createComputer();
    }
}
