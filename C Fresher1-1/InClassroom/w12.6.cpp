#include <stdio.h>

int main() {
    int n;
    printf(">> ");
    scanf("%d", &n);
    if (n % 2 != 0) {
        n = n + 1;
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {

            if (j == n / 2) {
                printf("*");
            }
            else if (i == n / 2) {
                printf("*");
            }
            else {
                printf(" ");
            }

        }
        printf("\n");
    }
}
