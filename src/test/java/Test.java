import com.chen.leetcode.NineThreeThree.RecentCounter;
import com.chen.leetcode.TwoSevenNine.Solution;
import com.chen.leetcode.SevenZeroFive.MyHashSet;


import java.util.List;


public class Test {


//    @org.junit.Test
//    public void TestTree() {
//        TreeNode root = new TreeNode(10,
//                new TreeNode(5,
//                        new TreeNode(3),
//                        new TreeNode(7)),
//                new TreeNode(15, null,
//                        new TreeNode(7)));
//        Solution solution = new Solution();
//        //System.out.println(solution.levelOrder(root));
//        for (List<Integer> list : solution.levelOrder(root)) {
//            System.out.println(list);
//        }
//    }

    @org.junit.Test
    public void Test62(){
        Solution solution = new Solution();
        int [] a = {186,419,83,408};
        System.out.println(solution.numSquares(1));
    }



    @org.junit.Test
    public void Test933() {

        RecentCounter recentCounter = new RecentCounter();

        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));


    }

    @org.junit.Test
    public void test705() {

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.printMyMap();
        myHashSet.add(302);      // set = [1, 2]
        myHashSet.printMyMap();
        System.out.println(myHashSet.contains(302));
        myHashSet.remove(302);   // set = [1]
        myHashSet.printMyMap();
        System.out.println(myHashSet.contains(2));
        myHashSet.printMyMap();

    }

}
