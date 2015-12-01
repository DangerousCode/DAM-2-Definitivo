#-*-coding:utf-8-*-
__author__ = 'AlumnoT'
from math import sqrt

'''Crea una función que nos  haga la raíz cuadrada de un número que habremos elevado
antes al cuadrado. Lo que si debemos tener claro y ese es el objetivo del  ejercicio
es que debemos importar directamente la función que nos haga la raíz cuadrada'''

def raiz(num):
    return sqrt(num)
num=int(raw_input("Introduce el numero: "));
num=num**2
print "El numero introducido es: ",raiz(num)