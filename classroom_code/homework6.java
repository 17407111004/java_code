/*
public class homework6 {
    //给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        subsets(nums,list,nums.length-1);
        return list;
    }

    public static void subsets(int[] nums,List<List<Integer>> list,int end) {

        List<Integer> mList =new ArrayList<Integer>();
        for(int i=end+1;i<nums.length;i++){
            mList.add(nums[i]);
        }
        list.add(mList);

        for(int i=0;i<=end;i++){
            if(end<nums.length-1&&nums[end+1]<nums[i])
                continue;
            swap(nums,i,end);
            subsets(nums,list,end-1);
            swap(nums,i,end);
        }
    }
    public static  void swap(int[] nums,int n,int m){
        int a = nums[n];
        nums[n] =nums[m];
        nums[m] = a;

    }
}
*/
/*
//给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
public class homework6 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            while(count > 0){
                count--;
                TreeNode cur = queue.poll();
                if(count == 0){
                    res.add(cur.val);
                }
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
        }
        return res;

    }
}
*/