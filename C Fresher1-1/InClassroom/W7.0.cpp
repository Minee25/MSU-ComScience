#include <stdio.h>

int main() {
    int people, threeInFive, stadium, runM, runKM;
    printf("Enter people: ");
    scanf("%d", &people);

    if (people < 10) {
        threeInFive = 100 / 5 * 3; // find 3 in 5
        stadium = threeInFive * 2 + 100 * 2;
        runM = people * stadium;
    }
    else if (people >= 10 && people <= 20) {
        threeInFive = 300 / 5 * 3;
        stadium = threeInFive * 2 + 300 * 2;
        runM = people * stadium * 2;
    }
    else if (people >= 21 && people <= 50) {
        threeInFive = 500 / 5 * 3;
        stadium = threeInFive * 2 + 500 * 2;
        runM = people * stadium * 3;
    } else {
        threeInFive = 600 / 5 * 3;
        stadium = threeInFive * 2 + 600 * 2;
        runM = people * stadium * 4;
    }

    runKM = runM / 1000;

    printf("Run: %d", runKM);

}
