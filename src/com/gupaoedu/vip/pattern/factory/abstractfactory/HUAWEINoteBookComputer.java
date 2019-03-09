package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.IComputer;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2019/3/8 22:33
 * @email yangke@tydic.com
 * @copyright 2019 www.tydic.com Inc. All rights reserved.
 **/
public class HUAWEINoteBookComputer implements INotBookComputer {
    @Override
    public void createNoteBookComputer() {
        System.out.println("创建华为笔记本电脑");
    }
}
