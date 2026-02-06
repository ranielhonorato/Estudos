n: int

print("Qual ordem da matriz? ", end="")
n = int(input())

x: int = [[0 for x in range(0, n)] for x in range(0, n)]

for i in range(0, n):
    for j in range(0, n):
        x[i][j] = int(input(f"Elemento [{i},{j}]: "))

print("Diagonal principal: ")

for i in range(0, n):
    print(x[i][i], end=" ")


negativos = 0
for i in range(0, n):
    for j in range(0, n):
        if x[i][j] < 0:
            negativos += 1 

print()
print(f"Quantidade negativos = {negativos}")