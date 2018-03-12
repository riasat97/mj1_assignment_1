#include <stdio.h>
#include <stdlib.h>
#define Size 100
#define Missing 97
//write a method which will remove any given character from a string ?

void initializeArray(int* arr) {

	int i;
	for ( i = 1; i<= Size;i++){
        if(i== Missing){
          for(int j=i;j<Size;j++){
            arr[j]=j+1;
          }
        break;
        }
    arr[i]=i;
	}

}
void findMissingNumberFromArray(int* arr){
    int sum= (Size)*(Size+1)/2;
    for(int i=1;i<Size;i++){
        sum-=arr[i];
    }
    printf("Missing Number is :%2d",sum);
}
int main(){
    int arr[Size];
    initializeArray(arr);

   findMissingNumberFromArray(arr);

    return 0;

}

/*
*/
