x: int
y: int

print("Digite dois numeros: ")
x = int(input())
y = int(input())

while x != y:
    if x > y:
        print("Decrescente")
    elif x < y:
        print("Crescente")

    print("Digite dois numeros: ")
    x = int(input())
    y = int(input())