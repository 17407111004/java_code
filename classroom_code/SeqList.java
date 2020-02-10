package list;

public class SeqList {
    private int[] datas=new int[100];
    private int size=0;
    public int getSise(){
        //size这个成员不能提供set,只能提供get,且size是通过后面是增删方法来进行维护的
        return size;
    }
    public void display(){
        //依次打印出每个元素
        //形如：[1,2,3,4]
        String result="[";
        for(int i=0;i<size;i++){
            result+=datas[i];
            if(i<size-1){
                result+=",";
            }
        }
        result+="]";
        System.out.println(result);
    }
//pos表示新元素要插入的位置（下标）
    public void add(int pos,int data){
        //判断pos是否是有效值
        //写代码的时候时刻关注参数的有效性
        if(pos<0||pos>size){
            return;
        }
        //扩容的支持，顺序表如果不够了，就自动扩容
        if(size>datas.length){
            //扩容
            int[] newDatas=new int[2*datas.length];
            for(int i=0;i<datas.length;i++){
                newDatas[i]=datas[i];
            }
            datas=newDatas;
        }
        //1.尾插
        //把这个新元素放到下标为size的位置上
        if(pos==size){
            datas[pos]=data;
            size++;
            return;
        }
        //普通位置的插入
        for(int i=size-1;i>=pos;i--){
            datas[i+1]=datas[i];
        }
        datas[pos]=data;
        size++;
    }
    public boolean contains(int toFind){
        //循环访问每个元素并进行比较，如果发现某个元素和toFind相等，返回true,否则返回false；
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return true;
            }
        }
        return false;
    }

public int search(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return i;
            }
        }
        return -1;
}
public  int getPos(int pos) {
    return datas[pos];
}
public void setPos(int pos,int data){
        datas[pos]=data;
}
//toRemove表示要删除的元素
    public void remove(int toRemove){
        //先找toRemove对应的下标
        int pos=search(toRemove);
        if(pos==-1){//要找的元素不存在，没找到
            return;
        }
        //如果下标是最后一个元素，直接删除
        if(pos==size-1){
            size--;
            return;
        }
        //如果是中间元素,需要先搬运，再删除
        for(int i=pos;i<size-1;i++){
            datas[i]=datas[i+1];
        }
        size--;
    }
    public void clear() {
        size = 0;
    }
}
