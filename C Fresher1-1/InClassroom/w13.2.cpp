#include <stdio.h>

int main() {
    int n;

    printf("N: ");
    scanf("%d", &n);

    int weight[n] = {};

    for (int i = 0; i < n; i++) {
        printf(">> ");
        scanf("%d", &weight[i]);
    }

    printf("\n");

    for (int i = 0; i< n ;i++) {
        if (weight[i] < 250) {
            printf("%d ", weight[i]);
            printf("Small size\n");
        }
        else if (weight[i] >= 250 && weight[i] <= 375) {
            printf("%d ", weight[i]);
            printf("Medium Size\n");
        }
        else {
            printf("%d ", weight[i]);
            printf("Large Size\n");
        }
    }

    printf("\n");

    for (int i = 0; i < n; i++) {
        printf("%d ", weight[i]);
    }
    printf("\n");
    for (int i = 0; i< n ;i++) {
        if (weight[i] < 250) {
            printf("Small ");
        }
        else if (weight[i] >= 250 && weight[i] <= 375) {
            printf("Medium ");
        }
        else {
            printf("Large ");
        }
    }
    printf("\n");

    return 0;
}
