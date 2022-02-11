# Tracing Recursive Code

Consider the following code:

```
public class Mystery {
    static int val = 0;

    public static String foo(String s) {
        val += 1;
        if (s.length() == 1)
            return s;

        String res1 = foo(s.substring(0,s.length()/2));
        String res2 = foo(s.substring(s.length()/2));
        if (res1.charAt(res1.length()-1) == res2.charAt(0)) {
            return res1 + res2.substring(1);
        }
        else {
            return res1 + res2;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo("abcde"));
        System.out.println(val);
        System.out.println(foo("aabcbba"));
        System.out.println(val);
        System.out.println(foo("aaabbbccdeff"));
        System.out.println(val);
    }
}
```
What is the output of this code?

Line 1:

Line 2:

Line 3:

Line 4:

Line 5:

Line 6:
