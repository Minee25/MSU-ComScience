#include <stdio.h>

int main() {
  float point = 0, point_left = 0, real_point = 0;
  int ticket_100 = 0, ticket_500 = 0, all_ticket = 0, left_ticket500 = 0;

  printf("Input Point : ");
  scanf("%f", &point);

  real_point = point * 2.15 / 100;
  all_ticket = ticket_100 + ticket_500;

  while (point >= 500) {
    ticket_500 += 1;
    point -= 500;
    all_ticket += 1;
  }

  while (point >= 100) {
    ticket_100 += 1;
    point -= 100;
    all_ticket += 1;
  }

  printf("\033[34m======================033[00m\n");
  printf("Point : %.2f\n", real_point);
  printf("Ticket 100 : %d\n", ticket_100);
  printf("Ticket 500 : %d\n", ticket_500);
  printf("All Ticket : %d\n", all_ticket);
  printf("Left Point : %.2f\n", point);
  printf("======================\n");

  return 0;
}