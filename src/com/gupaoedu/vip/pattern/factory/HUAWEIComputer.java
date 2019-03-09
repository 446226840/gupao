package com.gupaoedu.vip.pattern.factory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:38
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class HUAWEIComputer implements IComputer {
    @Override
    public void createComputer() {
        System.out.println("创建华为电脑");
    }
}
