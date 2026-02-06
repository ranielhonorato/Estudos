Nome1: str
Nome2: str
idade1: int
idade2: int


print("Dados da primeira pessoa: ")
Nome1 = input("Nome: ")
idade1 = int(input("Idade: "))

print("Dados da segunda pessoa: ")
Nome2 = input("Nome: ")
idade2 = int(input("Idade: "))

media: float
media = (idade1 + idade2) / 2

print(f"A idade media de {Nome1} e {Nome2} e de {media} anos")