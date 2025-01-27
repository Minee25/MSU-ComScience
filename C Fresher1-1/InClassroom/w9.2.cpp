 #include <stdio.h>

 int main() {
    int i = 1, sum = 0, sum2 = 0;

    while (i <= 10) {
        sum = sum + i;
        printf("Round: %d is %d + %d = %d\n", i, sum2, i, sum);
        sum2 = sum2 + i;
        i++;
    }
    printf("Sum: %d\n", sum);
 }

