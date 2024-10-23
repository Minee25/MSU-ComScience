#include <stdio.h>

int main() {
    int i = 1, sum = 0;
    float avg;

    while (i <= 10) {
        sum = sum + i;
        i += 1;
    }

    avg = (float)sum / (i - 1);

    printf("Sum: %d\n", sum);
    printf("Avg: %.2f\n", avg);
}
