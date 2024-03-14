/*
 * Run with `gcc main.c && ./a.out`
*/

#include <stdio.h>

void fizzBuzz(int end) {
    int i;
    for (i = 0; i < end; i++) {
        int isDivisibleByThree = i % 3 == 0;
        int isDivisibleByFive = i % 5 == 0;
        if (isDivisibleByThree && isDivisibleByFive) {
            printf("FizzBuzz\n");
        } else if (isDivisibleByThree) {
            printf("Fizz\n");
        } else if (isDivisibleByFive) {
            printf("Buzz\n");
        } else {
            printf("%d\n", i);
        }
    }
}

int main() {
    fizzBuzz(10);
    return 0;
}
