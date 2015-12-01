__author__ = 'AlumnoT'
'''Crear funcion que nos sume los valores de una lista'''
def sumar(a,b):return a+b

def sumaconReduce(numeros):
    return reduce(sumar,numeros)
#main
print sumaconReduce([2,3,10,11])

print reduce(lambda a,b:a+b,[2,3,10,11])