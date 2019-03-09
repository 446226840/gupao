package com.gupaoedu.vip.pattern.factory;

/**
 * 描述：笔记本电脑
 *
 * @auther yangke
 * @date 2019/3/8 21:53
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class ASUSIComputer implements IComputer {
    @Override
    public void createComputer() {
        System.out.println("创建华硕笔记本电脑");
    }

}
