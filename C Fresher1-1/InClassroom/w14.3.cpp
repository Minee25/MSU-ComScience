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

    // loop print
    for (int i = 0; i < n; i++) {
        printf("%d\t", num[i]);
    }
    printf("\n");

    // create star down
    for (int t = 0; t < maxium; t++) {
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

    return 0;
}
