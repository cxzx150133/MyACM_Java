# OJ 小技巧

> 请勿在提交到 OJ 的代码中使用中文
>
> 慎重选择初始值

## 1. 更快的整形数字输入获取

一般来说，我们习惯直接用封装的方法来获取输入，以 HDOJ1000 举例：

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();

            System.out.println(a+b);
        }

        input.close();
    }
}
```

运行结果：

|Run ID|Submit Time|Judge Status|Pro.ID|Exe.Time|Exe.Memory|Code Len.|Language|Author|
|---|---|---|---|---|---|---|---|---|
|34127231|2020-10-13 08:11:53|Accepted|1000|312MS|9296K|334 B|Java|GPLer|

但实际上稍微原始一点能更快

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        while (input.hasNext()) {
            a = Integer.parseInt(input.next());
            b = Integer.parseInt(input.next());

            System.out.println(a+b);
        }

        input.close();
    }
}
```

|Run ID|Submit Time|Judge Status|Pro.ID|Exe.Time|Exe.Memory|Code Len.|Language|Author|
|---|---|---|---|---|---|---|---|---|
|34127244|2020-10-13 08:16:20|Accepted|1000|343MS|9268K|363 B|Java|GPLer|

emm, A+B 循环次数太少了不足以体现优势，但我记得是更快的，等我比赛回来我再更新这一贴。