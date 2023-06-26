# Patterns

1. [Basic Patterns](#basic-patterns)
    1. [Solid Pattenrs](#solid-rectangle)
    2. []
# Basic Patterns

---

## Solid Rectangle

Print the pattern 

```
Pattern/Solid Rectangle:
*****
*****
*****
*****
```
[Solid Rectangle Code](./BasicPatterns/SolidRectangle.java)

## Hollow Rectangle

Print the pattern 

```
Pattern/Solid Rectangle:
*****
*   *
*   *
*****
```

```java
package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {

        /*
         * Print the hollow parrer
         * *****
         * *   *
         * *   *
         * *****
         */

         int row = 4;
         int col = 5;

        //  outter loop

        for(int i = 1; i <= 4; i++) {

            // inner loop
            for (int j = 1; j <= 5; j++) {
                // cell (i, j)
                if(i == 1 || j == 1 || i == row || j == col) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
```

## Half Pyramid

```
Pattern/Solid Rectangle:
*
**
***
****
```

```java
package Patterns;

public class HalfPyramid {
    public static void main(String[] args) {
        /*
         * row will be the collumn
         * 1 row 1 col
         * 2 row 2 col
         * 3 row 3 col
         */
        int n = 4;
        // outter loop
        for(int i = 1; i <= 4; i++) {
            // inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
```

## Inverted Half Pyramid

```
Pattern/Solid Rectangle:
****
***
**
*
```

```java
package Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        // Inverted pyramid
        int n = 4;
        // outter loop
        for(int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Inverted Half Pyramid rotated by 180 deg

```
Pattern/Solid Rectangle:
   *
  **
 ***
**** 
```

```java
package Patterns;

public class InvertedHalfPyramidRotated180Deg {
    public static void main(String[] args) {
        int n = 4;
        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop -> space print

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop -> * print

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // this will go to new row
            System.out.println();
        }

    }
}
```

## Print number pyramid

```
Number Pattern:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

```java
package Patterns;

/*
 * print the following pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class PrintNumberPyramid {
    public static void main(String[] args) {
        // here n is number of row
        int n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // this will print number which depends on outter `i`
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // This will go to next line
            System.out.println();
        }
    }
}
```

## Inverted half pyramid with numbers

```
Number Pattern:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

```java
package Patterns;

public class InvertedHalfPyramidsWithNumbers {
    public static void main(String[] args) {
        // define row number
        int n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                /*
                 * row 1 / i == 1 : j -> 1 - 5 => n - i + 1
                 * row 2 / i == 2 : j -> 1 - 4 => n - i + 1
                 * row 3 / i == 3 : j -> 1 - 3 => n - i + 1
                 * row 4 / i == 4 : j -> 1 - 2 => n - i + 1
                 * row 5 / i == 5 : j -> 1 - 1 => n - i + 1
                 */
                System.out.print(j + " ");
            }

            // go to new line
            System.out.println();
        }
    }
}
```

## Floyd’s Triangle

```
Number Pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

```java
package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        // define row number
        int n = 5;
        int flag = 1;

        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                // increse the flag
                flag++;
            }
            System.out.println();
        }
    }
}
```

## 01 Triangle

```
Number Pattern:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

```java
package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        // define row number
        int n = 5;

        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // when i+j == event print 1 | when i+j == odd print 0
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
```