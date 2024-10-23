#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main() {
  char answerSetting[3][20] = {"Apple", "Mango", "Orange"};
  char answer[20] = "";
  char answerLetter[60] = "";
  char gress[20] = "";

  srand(time(NULL));
  int r = rand() % 3;
  strcat(answer, answerSetting[r]);

  for (int i = 0; answer[i]; i++) {
    char letter[2] = {answer[i], '\0'};
    strcat(answerLetter, letter);
    // if (answer[i + 1]) {
    //     strcat(answerLetter, " ");  // Add a space between characters, but
    //     not after the last one
    // }
  }

  while (1) {
    // UI
    printf(
        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        "\n\n\n\n\n");
    printf("====================");
    printf("\n\n\n");
    // printf("A | p | p | l | e");
    // printf("%s", answerLetter);
    printf("| ");
    for (int i = 0; answerLetter[i]; i++) {
      printf("%c | ", answerLetter[i]);
    }
    printf("\n\n\n");
    printf("Gress: ");
    scanf("%s", &gress);
  }

  return 0;
}