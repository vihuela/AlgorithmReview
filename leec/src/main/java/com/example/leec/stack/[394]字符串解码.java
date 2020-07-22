package com.example.leec.stack;//给定一个经过编码的字符串，返回它解码后的字符串。
//
// 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。 
//
// 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。 
//
// 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。 
//
// 
//
// 示例 1： 
//
// 输入：s = "3[a]2[bc]"
//输出："aaabcbc"
// 
//
// 示例 2： 
//
// 输入：s = "3[a2[c]]"
//输出："accaccacc"
// 
//
// 示例 3： 
//
// 输入：s = "2[abc]3[cd]ef"
//输出："abcabccdcdcdef"
// 
//
// 示例 4： 
//
// 输入：s = "abc3[cd]xyz"
//输出："abccdcdcdxyz"
// 
// Related Topics 栈 深度优先搜索 
// 👍 418 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
//        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    //2[a2[bc]]
    public static String decodeString(String s) {
        char[] chars = s.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            //数字
            if (c != ']') {
                stack.push(c);
            } else {
                String nt = getIntervalVal();
                char[] ntc = nt.toCharArray();

                res = res.concat(new String(ntc));

                //把bcbc塞入栈
                for (char ci : ntc) {
                    stack.push(ci);
                }

                System.out.println();
            }
        }
        return res;
    }

    private static String getIntervalVal() {
        //取]到[直接的值bc
        String t = "";
        Stack<Character> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            if (stack.peek() != '[') {
                tmp.push(stack.pop());
            } else {
                stack.pop();
                break;
            }
        }

        while (!tmp.isEmpty()) {
            t = t.concat(tmp.pop().toString());
        }
        //取2，同时形成新的字符串
        String nt = "";
        int n = Integer.parseInt(stack.pop().toString());
        while (n != 0) {
            nt = nt.concat(t);
            n--;
        }
        return nt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
