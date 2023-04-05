package com.company.Arrays;

public class ReverseInteger {
    public static int reverse(int x) {

//        StringBuilder result= new StringBuilder();
//        boolean negative=false;
//        if(x<0)
//        {
//            negative=true;
//            x=-(x);
//        }
//        while(x!=0)
//        {
//            if(x<=9)
//            {
//                result.append(x);
//
//            }
//       if(x/10!=0)
//       {
//           if(x%10!=0)
//           result.append(x % 10);
//
//       }
//            x=x/10;
//        }
//        if(negative==true)
//        {
//           return Integer.parseInt(result.toString()) *-1;
//        }
//     return Integer.parseInt(result.toString());
        int ans = 0;
        while (x != 0)
        {
            if (ans > 214748364 || ans < -214748364)
            {
                return 0;
            }

            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=123;
        System.out.println(reverse(a));
    }
}
