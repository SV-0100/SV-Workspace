#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a,b;
        scanf("%d%d",&a,&b);
        if(a>b){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
}