package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IComputer;

/**
 * 描述：创建电脑的对象
 *
 * @auther yangke
 * @date 2019/3/8 22:08
 **/
public interface IComputerFactory {
  IComputer createComputer();
}
