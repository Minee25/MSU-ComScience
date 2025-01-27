#include <stdio.h>

int main() {
    int n, minium = 0, maxium = 0, sum = 0,
        sSize = 0, mSize = 0, lSize= 0;
    float avg = 0;

    printf("N: ");
    scanf("%d", &n);

    int weight[n] = {};

    // loop เพื่อ input ใน array
    for (int i = 0; i < n; i++) {
        printf(">> ");
        scanf("%d", &weight[i]);
    }

    printf("\n");

    // loop เพื่อหา max, min จาก array
    maxium = weight[0];
    minium = weight[0];
    for (int i = 1; i < n; i++) {
        if (weight[i] > maxium) {
            maxium = weight[i];
        }
        if (weight[i] < minium) {
            minium = weight[i];
        }
        }
    // loop เพื่อหา sum จาก array
    for (int i = 0; i < n; i++) {
        sum += weight[i];
    }
    avg = (float)sum / n;

    // OUTPUT
    // loop เพื่อ print จาก array
    for (int i = 0; i< n ;i++) {
        if (weight[i] < 250) {
            printf("%d ", weight[i]);
            printf("Small size\n");
            sSize += 1;
        }
        else if (weight[i] >= 250 && weight[i] <= 375) {
            printf("%d ", weight[i]);
            printf("Medium Size\n");
            mSize += 1;
        }
        else {
            printf("%d ", weight[i]);
            printf("Large Size\n");
            lSize += 1;
        }
    }

    printf("\n");

    printf("Max: %d\n", maxium);
    printf("Min: %d\n", minium);
    printf("Avg: %.2f\n", avg);

    printf("\n");

    printf("Small: %d\n", sSize);
    printf("Medium: %d\n", mSize);
    printf("Large: %d\n", lSize);

    printf("\n");

    return 0;
}
