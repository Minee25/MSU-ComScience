#include <stdio.h>

int main() {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
            if (j == 1) {
                printf("*");
            }
            else if (i == 1 || i == 5) {
                printf("*");
            }
            else if (j == 5) {
                printf("*");
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }
}
