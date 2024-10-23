#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  char input[20];
  int money = 1000, bank = 500, withdraw;

  // if start program
  printf("\n<<-----[command]----->>\n");
  printf("Withdraw\n");
  printf("Deposit\n");
  printf("Checkmoney\n");
  printf("Exit\n");
  printf("----------\n");

  printf("Input: ");
  scanf("%s", &input);

  // run
  while (1) {
    printf("\n<<-----[command]----->>\n");
    printf("Withdraw\n");
    printf("Deposit\n");
    printf("CheckMoney\n");
    printf("CheckBank\n");
    printf("CheckMB (money & bank)\n");
    printf("Exit\n");
    printf("----------\n");

    for (int i = 0; input[i]; i++) {
      printf("%c\n", input[i]);
      input[i] = tolower(input[i]);
      printf("%c\n", input[i]);
    }

    // condition

    if (strcmp("exit", input) == 0 || strcmp("EXIT", input) == 0) {
      printf("Exit Program!");
      break;
    } else if (strcmp("checkmoney", input) == 0) {
      printf("Your money: %d", money);
    } else if (strcmp("checkbank", input) == 0) {
      printf("Your bank: %d", bank);
    } else if (strcmp("checkmb", input) == 0) {
      printf("Your money: %d\n", money);
      printf("Your bank: %d", bank);
    } else if (strcmp("withdraw", input) == 0) {
      while (true) {
        printf("Your money: %d\n", money);
        printf("Your bank: %d\n\n", bank);
        printf("Back\n");
        printf("Exit\n");

        printf("Withdraw: ");
        scanf("%s", &input);

        if (strcmp("exit", input) == 0) {
          printf("Exit Program!");
          break;
          break;
        } else if (strcmp("back", input) == 0) {
          printf("Back Program!");
          break;
        } else {
          withdraw = atoi(input);
          bank -= withdraw;
          money += withdraw;
        }
      }
    } else {
      printf("Not invalid Plase try again!");
    }
    printf("\nInput: ");
    scanf("%s", &input);
  }
}