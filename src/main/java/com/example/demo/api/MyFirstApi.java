package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {

    @GetMapping ("/hi")
    public String Hello(){
        return " hi! how are you";
    }

    @GetMapping ("/reverse")
    public int reverse() {

        int num = 5678, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;

    }


    @GetMapping("/twosum")
    public int[] twoSum() {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] solution = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    solution[0]=i;
                    solution[1]=j;
                    return solution;
                }
            }
        }
        return solution;
    }
}
