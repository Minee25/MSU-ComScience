#include <stdio.h>

int main() {
    int n = 0, maxium = 0;

    printf("N > ");
    scanf("%d", &n);
    int num[n] = {};

    // assign to array
    for (int i = 0; i < n; i++) {
        printf("> ");
        scanf("%d", &num[i]);
    }

    // find max
    for (int i = 0; i < n; i++) {
        if (num[i] > maxium) {
            maxium = num[i];
        }
    }

    // create star up
    for (int t = maxium; t >= 0; t--) {
        for (int i = 0; i < n; i++) {
            if (t < num[i]) {
                printf("*\t");
            }
            else {
                printf("\t");
            }
        }
        printf("\n");
    }

    // loop print
    for (int i = 0; i < n; i++) {
        printf("%d\t", num[i]);
    }
    printf("\n");

    return 0;
}
