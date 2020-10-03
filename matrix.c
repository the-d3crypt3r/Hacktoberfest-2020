 #include <stdio.h>
#include <stdlib.h>
  int main() {
        int **data, i, j, n, flag=1;

        
        printf("Enter the order of matrix:\n");
        scanf("%d", &n);

        
        data = (int **)malloc(sizeof (int) * n);
        for (i = 0; i < n; i++)
                data[i] = (int *)malloc(sizeof (int) * n);

        
        printf("Enter your inputs:\n");
        for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                        scanf("%d", &data[i][j]);

        
        printf("Upper triangular matrix:\n");
        for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                        if (j >= i)
                                printf("%3d", data[i][j]);
                        else
                                printf("%3d", 0);
                printf("\n");
        }

        
        printf("Lower triangular matrix:\n");
        for (i  = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                        if (j <= i)
                                printf("%3d", data[i][j]);
                        else
                                printf("%3d", 0);
                printf("\n");
        }
        
        printf("Diagonal matrix:\n");
        for (i  = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                        if (j == i)
                                printf("%3d", data[i][j]);
                        else
                                printf("%3d", 0);
                printf("\n");
        }
        
        printf("\n Identity matrix:");
        for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (i==j && data[i][j] != 1)
			{
				flag = 0;
				break;
			}
			else if(i!=j && data[j][i] != 0)
			{
				flag = 0;
				break;
			}
		}	
	}
	if (flag == 1 )
		printf("It is an identity matrix \n");
	else
		printf("It is not an identity matrix \n");
	return 0;
        return 0;
  }


/*
  Output:
  
 Enter the order of matrix:
3
Enter your inputs:
10 20 30
40 50 60
70 80 90
Upper triangular matrix:
 10 20 30
  0 50 60
  0  0 90
Lower triangular matrix:
 10  0  0
 40 50  0
 70 80 90
Diagonal matrix:
 10  0  0
  0 50  0
  0  0 90

 Identity matrix:It is not an identity matrix
 
 
 Enter the order of matrix:
3
Enter your inputs:
1 0 0
0 1 0
0 0 1
Upper triangular matrix:
  1  0  0
  0  1  0
  0  0  1
Lower triangular matrix:
  1  0  0
  0  1  0
  0  0  1
Diagonal matrix:
  1  0  0
  0  1  0
  0  0  1

 Identity matrix:It is an identity matrix

 
 
*/
