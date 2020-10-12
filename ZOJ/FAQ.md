
# Frequently Asked Questions

---

## About Input and Output

> Where is the input and output?

Your program shall read input from stdin('Standard Input') and write output to stdout('Standard Output').For example,you can use 'scanf' in C or 'cin' in C++ to read from stdin,and use 'printf' in C or 'cout' in C++ to write to stdout.

User programs are not allowed to open and read from/write to files, you will get a "Runtime Error" if you try to do so.

Here is a sample solution for problem 1001 using C++:

```c++
#include <iostream>
using namespace std;

int main()
{
    int a,b;
    while(cin >> a >> b)
        cout << a+b << endl;
}
```

Here is a sample solution for problem 1001 using C:

```c
#include <stdio.h>

int main()
{
    int a,b;
    while(scanf("%d %d",&a, &b) != EOF)
        printf("%d\n",a+b);
    return 0;
}
```

Here is a sample solution for problem 1001 using PASCAL(FPC):

```pascal
program p1001(Input,Output); 
var 
  a,b:Integer; 
begin 
   while not eof(Input) do 
     begin 
       Readln(a,b); 
       Writeln(a+b); 
     end; 
end.
```

Here is a sample solution for problem 1001 using Java:

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
	}
}
```

Here is a sample solution for problem 1001 using Python2:

```python
import sys
for line in sys.stdin:
    a = line.split()
    print int(a[0]) + int(a[1])
```

Here is a sample solution for problem 1001 using Python3:

```python
import sys
for line in sys.stdin:
    a = line.split()
    print(int(a[0]) + int(a[1]))
```

Here is a sample solution for problem 1001 using PHP:

```php
<?php
while (fscanf(STDIN, "%d%d", $a, $b) == 2) {
    print ($a + $b) . "\n";
}
```

---

## About Compilers

> What is the compiler the judge is using and what are the compiler options?

The online judge system is running on Linux. We are using GNU GCC/G++ for C/C++, Free Pascal for Pascal and OpenJDK 1.8 for Java. The supported compilers and the compiling options are listed in the following table.

|Compiler|Version|Compiler Commands|
|---|---|---|
|python3|3.6.7|
|gcc|6.5.0|gcc -DONLINE_JUDGE -fno-tree-ch -O2 -Wall -std=c99 -pipe $src -lm -o $exe|
|sbcl|1.3.1|
|g++|6.5.0|g++ -DONLINE_JUDGE -fno-tree-ch -O2 -Wall -std=c++14 -pipe $src -lm -o $exe|
|fpc|3.0.4|fpc -dONLINE_JUDGE -O2 $src|
|php|7.0.32|
|perl|5.22.1|
|python2|2.7.12|

---

## About Judge Reply

> What is the meaning of the judge's reply XXXXX?

|Judge Reply|Description|
|---|---|
|Queuing|The judge is so busy that it can't judge your submit at the moment, usualy you just need to wait a minute and your submit will be judged.|
|<div style="color: red">Accepted</div>|OK! Your program is correct!.|
|<div style="color: green">Presentation Error</div>|Your output format is not exactly the same as the judge's output, although your answer to the problem is correct. Check your output for spaces, blank lines,etc against the problem output specification.|
|<div style="color: green">Wrong Answer</div>|Correct solution not reached for the inputs. The inputs and outputs that we use to test the programs are not public (it is recomendable to get accustomed to a true contest dynamic ;-).|
|<div style="color: green">Time Limit Exceeded</div>|Your program tried to run during too much time.|
|<div style="color: green">Memory Limit Exceeded</div>|Your program tried to use more memory than the judge default settings.|
|<div style="color: green">Output Limit Exceeded</div>|Your program tried to write too much information. This usually occurs if it goes into a infinite loop. Currently the output limit is 1M bytes.|
|<div style="color: green">Non Zero Exit Error</div>|Your program exited returning a non-zero value to the shell. For languages such as C, this probably means you forgot to add "return 0" at the end of the program. For interpreted languages NZEC will usually mean that your program either crashed or raised an uncaught exception.|
|Compilation Error|The compiler (gcc, g++, fpc, etc) could not compile your program. Of course, warning messages are not error messages. Click the link at the judge reply to see the actual error message.|
|Out of Contest Time|This message can only appear during a contest, if a program is submitted out of contest time.|
|<div style="color: green">Segmentation Fault</div>|The possible cases of your encountering this error are:<ol><li>buffer overflow --- usually caused by a pointer reference out of range.</li><li>stack overflow --- please keep in mind that the default stack size is 8192K.</li></ol>|
|<div style="color: green">Float Point Exception</div>|Divide by 0|
|<div style="color: green">Runtime Error</div>|If you are using Java, please check the class signature as well as the main method signature, and don't use any class which is not allowed. If you are using other languages, your program may have executed a forbidden operation, like invoking privileged syscalls, file operation, etc. Notice that buffer overflow and stack overflow can also lead to this error.|

---

## About Java

> Which Java classes can I use?

You can only use classes in those packages: java.lang, java.io, java.nio, java.math, java.util, java.text and java.net. You are not allowed to catch any Error in your try-catch, read, write or create any file, or create Socket, etc. In one word, don't do anything other than solving the problem.

> How to submit a Java solution?

See the sample solution above. Basically you should submit a single source file which contains a public class Main and it should have a method with signature `public static void main(String[] args)` which is the entry of your program.