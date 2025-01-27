#include <stdio.h>

int main() {
    int n = 6, x[n] = {}, a = 0, center = 0;
    float mid = 0;
    printf("> ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }

    for (int i = 0; i < n; i++) {
        printf("%d, ", x[i]);
    }

    for (int i = 0; i < n - 1; i++) { // 1
        for (int j = 0; j < n - 1; j++) { // 1
            if (x[j] > x[j+1]) {
                a = x[j];
                x[j] = x[j+1];
                x[j+1] = a;
            }
        }
    }
    printf("\n");
    for (int i = 0; i < n; i++) {
        printf("%d, ", x[i]);
    }

    if (n % 2 == 0) {
        center = n / 2;
        mid = (x[center-1] + x[center]) / 2.0;
    } else {
        center = n / 2;
        mid = x[center] / 2;
    }

    printf("\n\nStart: %d", x[n-n]);
    printf("\nMid: %f", mid);
    printf("\nFinal: %d", x[n-1]);
}
