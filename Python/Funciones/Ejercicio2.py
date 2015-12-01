#-*-coding:utf-8-*-
__author__ = 'AlumnoT'
'''Crear una función  a la que fijamos como parámetro un valor concreto  y muestre en
pantalla el perímetro y la superficie de un  cuadrado que tenga como lado el número
que se ha indicado como parámetro'''

def ap(lado):
    perimetro=lado*4
    area=lado*lado
    return area,perimetro
lado=int(raw_input("Introduce el lado: "))
area,perimetro=ap(lado)
print "El area es: ",area," el perimetro es: ",perimetro