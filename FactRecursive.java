#include <stdio.h> 
public class FactRecursive {

	int factorial(int n) { 

	if (n == 1 || n == 0) 

	{ 

	printf("%d", n); 

	return 1; 

	} 

	else  

	{ 

	printf("%d*", n); 

	return n * factorial(n - 1); 

	} 

	} 

	int main() 

	{ 

	int num; 

	printf("숫자를 입력해주세요 : "); 

	scanf_s("%d", &num); 

	if(num < 0) 

	printf("양의 정수만 입력할 수 있습니다. 프로그램을 종료합니다.\n"); 

	else 

	{ 

	printf("\n%d팩토리얼 : ", num); 

	printf("\n = %d\n\n", factorial(num)); 

	} 

	return 0; 

	}


}
