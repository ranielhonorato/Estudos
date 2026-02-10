print("Quantos numeros voce vai digitar? ", end="")
n = int(input())

x = [0 for x in range(n)]

for i in range(0, n):
    x[i] = float(input("Digite um numero: "))


soma = 0
for i in range(0, n):
    soma += x[i]


print()
print("Valores = ", end="")
for i in range(0, n):
    print(x[i], end=" ")

print()
media: float
media = soma / n
print(f"soma = {soma}")
print(f"Media = {media}")