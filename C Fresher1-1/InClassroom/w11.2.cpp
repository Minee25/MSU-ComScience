#include <stdio.h>

int main() {
    int score, sCount = 0, uCount = 0;
    for (int i = 1; i <= 6; i++) {
        printf("Score: ");
        scanf("%d", &score);

        if (score < 70) {
            printf("U\n");
            uCount += 1;
        } else {
            printf("S\n");
            sCount += 1;
        }
    }
    printf("U count: %d\n", uCount);
    printf("S count: %d\n", sCount);

    return 0;
}
