#include <stdio.h>

int main() {
    int i = 1, sum = 0, n, x;
    float avg;

    printf("N: ");
    scanf("%d", &n);

    while (i <= n) {
        printf("X: ");
        scanf("%d", &x);

        sum += x;
        i += 1;
    }

    avg = (float)sum / n;
    printf("Sum : %d\n", sum);
    printf("Avg : %.2f\n", avg);
}
