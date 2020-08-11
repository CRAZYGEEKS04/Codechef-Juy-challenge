t=int(input())
for i in range(t):
    h,p=map(int,input().split())
    while h>0:
        h = h - p
        p = p // 2
        if p>h:
            print(1)
            break
        elif p==0 and h!=0:
            print(0)
            break
        elif p==0 and h==0:
            print(1)
            break
