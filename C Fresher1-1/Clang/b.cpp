#include <stdio.h>

int main() {
  int score;

  printf("Enter score: ");
  scanf("%d", &score);

  if (score >= 80 && score <= 100) {
    printf("A");
  }
  else if (score >= 75 && score <= 79) {
    printf("B+");
  }
  else if (score >= 70 && score <= 74) {
    printf("B");
  }
  else if (score >= 65 && score <= 69) {
    printf("C+");
  }
  else if (score >= 60 && score <= 64) {
    printf("C");
  }
  else if (score >= 55 && score <= 59) {
    printf("D+");
  }
  else if (score >= 50 && score <= 54) {
    printf("D");
  }
  else if (score >= 0 && score <= 49) {
    printf("F");
  }

  return 0;
}