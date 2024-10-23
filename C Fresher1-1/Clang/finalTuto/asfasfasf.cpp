#include <stdio.h>
#include <math.h>

int returnSoon(){
    return 0;
}

int main() {
    int n = 0, sum = 0;
    printf("N > ");
    scanf("%d", &n);
    int score[n];
    int scoreABCDF[5] = {0, 0 ,0 ,0 ,0};
    float varian = 0, sd = 0,avg = 0,
        scoreDiv[n], scoreDiv2[n], sumScoreDiv2 = 0;

    for (int i = 0; i < n; i++) {
        printf("> ");
        scanf("%d", &score[i]);
    }

    // print array
    for (int i = 0; i < n; i++) {
        printf("%d\t", score[i]);
    }
    printf("\n");

    // loop sum
    for (int i = 0; i < n; i++) {
        sum += score[i];
    }
    avg = (float)sum / n; // avg

    // scoreDiv
    for (int i = 0; i < n; i++) {
        scoreDiv[i] = score[i] - avg;
    }

    // scoreDiv2
    for (int i = 0; i < n; i++) {
        scoreDiv2[i] = scoreDiv[i] * scoreDiv[i];
    }

    // sumScoreDiv2
    for (int i = 0; i < n; i++) {
        sumScoreDiv2 += scoreDiv2[i];
    }

    // varian
    varian = (float)sumScoreDiv2 / (n-1);

    // root
    sd = sqrt(varian);

    // ********** OUTPUT
    printf("\n");
    printf("sum: %d\n", sum);
    printf("avg: %.2f\n", avg);

    // print scoreDiv
    for (int i = 0; i < n; i++) {
        printf("%.2f\t", scoreDiv[i]);
    }
    printf("\n");
    // print scoreDiv2
    for (int i = 0; i < n; i++) {
        printf("%.2f\t", scoreDiv2[i]);
    }

    printf("\nSumScoreDiv2: %.2f\n", sumScoreDiv2);
    printf("Varian: %.2f\n", varian);
    printf("SD: %.2f\n", sd);


    // OUTput 2

    printf("\nScore and Grade\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t", score[i]);
    }
    printf("\n");
    for (int i = 0; i < n; i++) {
        if (score[i] <= 50 ) {
            scoreABCDF[4]++;
            printf("F\t");
        }
        else if (score[i] >= 51 && score[i] <= 59 ) {
            scoreABCDF[3]++;
            printf("D\t");
        }
        else if (score[i] >= 60 && score[i] <= 69 ) {
            scoreABCDF[2]++;
            printf("C\t");
        }
        else if (score[i] >= 70 && score[i] <= 79 ) {
            scoreABCDF[1]++;
            printf("B\t");
        }
        else if (score[i] >= 80) {
            scoreABCDF[0]++;
            printf("A\t");
        }
    }

    printf("\n\n");

    char grade[5] = {'A', 'B', 'C', 'D', 'F'};

    for (int i = 0; i < 5 ; i++) {
        printf("%c ", grade[i]);
        for (int j = 1; j <= scoreABCDF[i] ; j++) {
            printf("*");
        }
        printf("\n");
    }

    return returnSoon();
}