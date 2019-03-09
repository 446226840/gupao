package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IComputer;

/**
 * 描述：简单电脑工厂
 *
 * @auther yangke
 * @date 2019/3/8 21:52
 **/
public class ComputerFactory {
   public IComputer create(Class clazz){
        if(clazz!=null){
            IComputer IComputer = null;
            try {
                IComputer = (IComputer) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return IComputer;
        }
        return null;
    }
}
