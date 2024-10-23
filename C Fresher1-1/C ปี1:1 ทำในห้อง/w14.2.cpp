#include <stdio.h>

int main() {
    int n;
    printf("N > ");
    scanf("%d", &n);
    int num[n] = {};

    for (int i = 0; i < n; i++) {
        scanf("%d", &num[i]);
    }

    for (int i = 0; i < n; i++) {
        printf("%d", num[i]);
        for (int j = 0; j < num[i]; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
