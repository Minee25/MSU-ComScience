#include <stdio.h>

int main() {
    for (int i = 1; i <= 5; i++) { // 1
        for (int j = 1; j <= i ; j++) { // 1
            if ( i <= j) {
                printf("*");
                if (i == 1 || i == 5) {
                    for (int k = 1; k <= 5; k++) {
                        printf("*");
                    }
                }
                else if (i < 5) {
                    for (int l = 1; l < 5; l++) {
                        printf(" ");
                    }printf("*");
                }
            }
        }
        printf("\n");
    }
}
