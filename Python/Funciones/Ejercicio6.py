__author__ = 'AlumnoT'
'''Crear una funcin a la que le pasaremos los valores 3 5
y 10 y nos tiene que decir cual es la media de los tres
valores pasados por parmetro'''

def media(num, *tupla):
    med=num
    for i in range(len(tupla)):
       med+=tupla[i]
    return med/(len(tupla)+1)

print media(3,5,10)