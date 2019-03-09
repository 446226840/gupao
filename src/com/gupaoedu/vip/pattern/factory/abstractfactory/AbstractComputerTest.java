package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:47
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class AbstractComputerTest {
    public static void main(String[] args) {
        HUAWEIComputerFactory huaweiComputerFactory = new HUAWEIComputerFactory();
        huaweiComputerFactory.createDesktop();
        huaweiComputerFactory.createINotBook().createNoteBookComputer();
        huaweiComputerFactory.createIntegrative();
    }
}
