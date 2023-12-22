//2. Add Two Numbers(Medium)
//Companies
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {


    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        int extra = 0;
        int y;
        if(l1.size() <= l2.size()){
            List<Integer> tmpList = l1;
            l1 = l2;
            l2 = tmpList;
        }
        for(int i =0; i< l1.size(); i++){
            if(i >= l2.size()){
                y = 0 + extra;
            }else{
                y = l2.get(i) + extra;
            }
            result.add((l1.get(i) + y) % 10);
            extra = (l1.get(i) + y)/10;
        }
        if (extra != 0){
            result.add(extra);
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(4);
        list1.add(4);
        list1.add(7);
        list1.add(4);
        list1.add(9);


        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(3);
        list2.add(9);
        list2.add(2);
        list2.add(9);
        list2.add(2);

        System.out.println(addTwoNumbers(list1, list2));
    }

}
