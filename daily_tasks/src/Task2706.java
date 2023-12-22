import java.util.Arrays;

//20.12.2023
// 2706.Buy Two Chocolate Easy
//Companies
//You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
//You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
//Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
public class Task2706 {
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(money - prices[0] - prices[1] >= 0){
            return money - prices[0] - prices[1];
        }else{
            return money;
        }
    }
    public static void main(String[] args){
        System.out.println(buyChoco(new int[]{234,545,23,2345,23,23,13,54,324,643,324,123,15,3,342}, 100));
    }

}
