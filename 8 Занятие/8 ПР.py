def S_sqr(a, b):
    return a * b

def S_tr(a, b):
    return 0.5 * a * b

def F():
    a = int(input('Введите длину верхнего основания, так чтобы оно было меньше чем другое основание: '))
    b = int(input('Введите длину нижнего основания, так чтобы оно было больше чем другое основание: '))
    c = int(input('Введите длину высоты (меньшей боковой стороны): '))
    print(S_sqr(a, c) + S_tr(b - a, c))


F()


def H():
    a = int(input('Введите неотрицательное число: '))
    a = oct(a)[2:]
    while len(a) != 10:
        a = '0' + a
    print(a)


H()