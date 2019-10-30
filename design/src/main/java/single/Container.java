package single;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式-容器式
 */
public class Container {

    /**
     * 私有化构造方法
     */
    private Container() {
    }

    /**
     * map容器
     */
    private static Map<String, Object> map = new HashMap<String, Object>();

    public static void putInstance(String key, Object value) {
        if (key != null && !key.equals("") && value != null) {
            if (!map.containsKey(key)) {
                map.put(key, value);
            }
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }


}
