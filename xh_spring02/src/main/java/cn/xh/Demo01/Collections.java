package cn.xh.Demo01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Collections {
    private String[] str;
    private List<String> list;
    private Map<String,String> map;
    private Properties prop;

    @Override
    public String toString() {
        return "Collections{" +
                "str=" + Arrays.toString(str) +
                ", list=" + list +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
