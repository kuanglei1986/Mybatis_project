package cn.xh.Factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Map<String,Object> map = new HashMap<String,Object>();

    static {
        Properties prop = new Properties();
        Object obj = null;
        try {
            //加载bean.properties文件里的内容到prop
            prop.load(BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties"));

            //获取到prop里面所有的键
            Enumeration keys = prop.keys();
            //遍历键获取值
            while(keys.hasMoreElements()){
                //获取键
                String key =  (String) keys.nextElement();
                // 获取值
               String value = (String)prop.get(key);
               obj = Class.forName(value).newInstance();
               map.put(key,obj);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    根据传进去的参数作为键获取该键对应的值的对象
     */
    public static Object getBean(String name){
        return map.get(name);
    }
}
