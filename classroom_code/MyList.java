package list;
public class MyList {
    private int[] arr;
    private int size;
    public MyList(){
        arr=new int[2];//数组初始化；
        size=0;//大小初始化为0；（字节数）
    }
    //扩容
    private void ensureCapity(){
        if(this.size<this.arr.length){
            return;
        }
        else{
            int[] array=new int[this.arr.length*2];
            for(int i=0;i<this.size;i++){
                array[i]=arr[i];
            }
            arr=array;
        }
    }
    //插入
    //插入指定位置
    public void insert(int index,int v){
        for(int i=this.size;i>=index;i--){
            this.arr[i]=this.arr[i-1];
        }
        this.arr[index]=v;
        this.size++;
    }
    //尾插法
    public void pushBack(int v){
        this.ensureCapity();
        this.arr[this.size++]=v;
    }
    //头插法
    public void pushFront(int v){
        for(int i=size;i>=1;i--){
            this.arr[i]=this.arr[i-1];
        }
        this.arr[0]=v;
        this.size++;
    }
    //删除
    //删除指定位置
    public boolean popArray(int index){
        if(this.size<=0){
            System.out.println("该顺序表为空");
            return false;
        }
        if(index<0||index>this.size-1){
            System.out.println("下标无效");
            return false;
        }
        for(int i=index;i<this.size-1;i++){
            this.arr[i]=this.arr[i+1];
        }
        this.arr[--this.size]=0;
        return true;
    }
    //尾删法
    public boolean popBack(){
        if(this.size<=0){
            System.out.println("该顺序表为空表");
            return false;
        }
        this.arr[--this.size]=0;
        return true;
    }
    //头删法
    public boolean popFront(){
        if(this.size<=0){
            System.out.println("该顺序表为空表");
            return false;
        }
        for(int i=0;i<this.size-1;i++){
            this.arr[i]=this.arr[i+1];
        }
        this.arr[--this.size]=0;
        return true;
    }
    //修改指定位置数据
public void alterArray(int index,int v){
        if(index<0||index>this.size-1){
            System.out.println("下标无效");
            return;
        }
        this.arr[index]=v;
}
//查询指定位置的数据
public int searchArray(int index){
        if(index<0||index>this.size){
            System.out.println("下标无效");
            return -1;
        }
        return this.arr[index];
}
//打印顺序表
    public void printList(){
        for(int i=0;i<this.size;i++){
            System.out.println(this.arr[i]+" ");
        }
        System.out.println("当前容量："+this.arr.length);
        System.out.println();
    }

    public static void main(String[] args) {
        MyList m=new MyList();
        m.insert(1,5);
        m.pushBack(1);
        m.pushBack(2);
        m.pushFront(10);
        m.pushBack(1);
        m.pushBack(1);
        m.popArray(1);
        m.popBack();
        m.popFront();
        m.alterArray(1,1);
        m.searchArray(6);
        m.printList();
    }
}
