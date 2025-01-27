#include <stdio.h>

int main() {
    int n = 5, sum = 0;
    int numer[n] = {};
    float avg = 0;

    for (int i = 0; i < n; i++) {
        printf(">> ");
        scanf("%d", &numer[i]);
    }

    for (int i = 0; i < n; i++) {
        printf("%d+", numer[i]);
        sum += numer[i];
    }

    avg = sum/n;

    printf("\b=%d\n", sum);
    printf("ABG = %.2f", avg);
}
