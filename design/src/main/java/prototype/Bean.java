package prototype;

import java.util.List;
import lombok.Data;

@Data
public class Bean implements Cloneable {

    public String name;
    public int age;
    public List<Bean> family;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
