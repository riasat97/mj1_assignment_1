#include <stdio.h>
#include <stdlib.h>
#define Size 20
//write a method which will remove any given character from a string ?

int getLength(char str[Size]) {

	int i, length = 0;
	for (int i = 0; str[i] != '\0'; i++)
		length++;

	return length;
}
void removeCharFromString(char ch,char str[Size]){
     int len,i;
     len=getLength(str);

     for(i=0;i<len;i++){
        if(str[i] == ch){
            for(int j=i;j<len;j++){
                str[j]=str[j+1];
            }
        }
     }
     str[i]='\0';
     printf("%s",str);
}
int main(){
    char str[Size],ch;
    printf("write a sentence :\n");
    gets(str);
    printf("Enter a character to remove :\n");
    scanf(" %c",&ch);
    removeCharFromString(ch,str);

    return 0;

}

/*
*/
