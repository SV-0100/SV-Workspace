#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a;
        scanf("%d",&a);
        if(67<=a && a<=45000){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
}