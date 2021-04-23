public class _61_v1 {

    public static void main(String[] args) {

        _61_v1 v1 = new _61_v1();
        int[] test = {1,2,0,4,5};
        boolean straight = v1.isStraight(test);
        System.out.println(straight);
    }
    public boolean isStraight(int[] nums) {
        //是顺子必须得是一个递增序列
        //这和能不能凑成一个顺子有一点点不同，如果是问能不能凑成一个顺子，则需要先排序一下
        int cheat = nums[0] == 0 ? 1 : 0;
        int gap = 0;//记录牌之间的间隔
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                cheat++;
                i += 2;
                continue;
            }
            if (nums[i] <= nums[i - 1]) return false;
            int check = nums[i] - nums[i - 1];
            if (check == 1) continue;
            else gap += check - 1;
        }
        return cheat >= gap ? true : false;
    }
}
