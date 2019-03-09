package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IComputer;
import com.gupaoedu.vip.pattern.factory.ToshibaIComputer;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:03
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        IComputer IComputer = computerFactory.create(ToshibaIComputer.class);
        IComputer.createComputer();
    }
}
