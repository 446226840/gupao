package com.gupaoedu.vip.pattern.factory;

/**
 * 描述：华硕电脑
 *
 * @auther yangke
 * @date 2019/3/8 21:54
 **/
public class ToshibaIComputer implements IComputer {
    @Override
    public void createComputer() {
        System.out.println("创建东芝笔记本电脑");
    }
}
