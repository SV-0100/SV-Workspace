#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a,b;
        scanf("%d %d",&a,&b);
        int x=a/10;
        int y=x*b;
        printf("%d\n",y);
    }
}