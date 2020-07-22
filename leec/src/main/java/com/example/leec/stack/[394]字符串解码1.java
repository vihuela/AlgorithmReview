package com.example.leec.stack;//����һ������������ַ������������������ַ�����
//
// �������Ϊ: k[encoded_string]����ʾ���з������ڲ��� encoded_string �����ظ� k �Ρ�ע�� k ��֤Ϊ�������� 
//
// �������Ϊ�����ַ���������Ч�ģ������ַ�����û�ж���Ŀո�������ķ��������Ƿ��ϸ�ʽҪ��ġ� 
//
// ���⣬�������Ϊԭʼ���ݲ��������֣����е�����ֻ��ʾ�ظ��Ĵ��� k �����粻������� 3a �� 2[4] �����롣 
//
// 
//
// ʾ�� 1�� 
//
// ���룺s = "3[a]2[bc]"
//�����"aaabcbc"
// 
//
// ʾ�� 2�� 
//
// ���룺s = "3[a2[c]]"
//�����"accaccacc"
// 
//
// ʾ�� 3�� 
//
// ���룺s = "2[abc]3[cd]ef"
//�����"abcabccdcdcdef"
// 
//
// ʾ�� 4�� 
//
// ���룺s = "abc3[cd]xyz"
//�����"abccdcdcdxyz"
// 
// Related Topics ջ ����������� 
// ? 418 ? 0


import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {

    public static void main(String[] args) {
//        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    static int ptr;

    public static String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;

        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {
                // ��ȡһ�����ֲ���ջ
                String digits = getDigits(s);
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                // ��ȡһ����ĸ����ջ
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<String>();
                while (!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                // �����ų�ջ
                stk.removeLast();
                // ��ʱջ��Ϊ��ǰ sub ��Ӧ���ַ���Ӧ�ó��ֵĴ���
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                // �����ַ���
                while (repTime-- > 0) {
                    t.append(o);
                }
                // ������õ��ַ�����ջ
                stk.addLast(t.toString());
            }
        }

        return getString(stk);
    }

    public static String getDigits(String s) {
        StringBuffer ret = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    public static String getString(LinkedList<String> v) {
        StringBuffer ret = new StringBuffer();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }

}
//leetcode submit region end(Prohibit modification and deletion)
