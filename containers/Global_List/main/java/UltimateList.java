public class UltimateList {
    private Holder head;
    private int size;
    {
        head=null;
        size=0;
    }
    public UltimateList(BaseType val)
        {head=new Holder(val); ++size;}
    public void pushBack(BaseType val)
    {
        Holder iter=head;
        if(head==null){head=new Holder(val); ++size;}
        else{
            while(iter.next!=null) {iter=iter.next;}
            iter.next=new Holder(val);
            ++size;
        }
    }
    public BaseType popBack()
    {
        Holder iter=head;
        BaseType res=null;
        if(iter==null){}
        else if(iter.next==null){res=iter.data; head=null;--size;}
        else{
            while(iter.next.next!=null) {iter=iter.next;}
            res=iter.next.data;
            iter.next=null;
            --size;
        }
        return res;
    }
    public int getSize()
    {
        return this.size;
    }


}
