abstract public class BaseType<T>{
    private T data;
    {
        data=null;
    }
    public T getData()
    {
        return this.data;
    }
    public void setData(T val)
    {
        this.data=val;
    }
}

class INT extends BaseType<Integer>{
    public INT(int val)
    {
        this.setData(val);
    }
}
class DOUBLE extends BaseType<Double>{
    public DOUBLE(double val)
    {
        this.setData(val);
    }
}
class CHAR extends BaseType<Character>{
    public CHAR(char val)
    {
        this.setData(val);
    }
}
