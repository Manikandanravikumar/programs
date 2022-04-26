#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,size,i,dub,ans;
    scanf("%d",&n);
    scanf("%d",&size);
    for(i=0;i<size;i++)
    {scanf("%d",&dub);
    if(dub==n)
        ans=i;}
    printf("%d",ans);
    return 0;
}
