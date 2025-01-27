#include <stdio.h>

int main() {
    int area;
    printf(">> ");
    scanf("%d", &area);
    for (int i = 1; i <= area; i++) {
        for (int j = 1; j <= area; j++) {
            if (j == 1) {
                printf("*");
            }
            else if (i == j) {
                printf("*");
            }
            else if (i == area) {
                printf("*");
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }
}
