A1, B1, C1 = map(int,input().split())
A2, B2, C2 = map(int,input().split())
S = 0
if A2>A1:
    S = S + (A2 - A1)
if B2>B1:
    S = S + (B2 - B1)
if C2>C1:
    S = S + (C2 - C1)
print(S)