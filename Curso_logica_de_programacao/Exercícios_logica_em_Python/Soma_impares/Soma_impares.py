x: int
y: int

print("Digite dois numeros:")
x = int(input())
y = int(input())

troca: int
if x > y:
    troca = x
    x = y
    y = troca


soma: int
soma = 0 
for i in range(x + 1, y):
    if i % 2 != 0:
        soma += i

print(f"Soma dos impares = {soma}")