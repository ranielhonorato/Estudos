import math

base: float
altura: float
area: float
diagonal: float

print("Digite a base do retangulo: ", end="")
base = float(input())

print("Digite a altura do retangulo: ", end="")
altura = float(input())


area = base * altura
perimetro: float
perimetro = 2 * (base + altura)
diagonal = math.sqrt(pow(base,2) + pow(altura,2))

print(f"Area do retangulo = {area:.4f}")
print(f"Perimetro do retangulo = {perimetro:.4f}")
print(f"Diagonal do retangulo = {diagonal:.4f}")

