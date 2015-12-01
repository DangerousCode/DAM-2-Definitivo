#MAL que no amal
__author__ = 'AlumnoT'
def sumar(lista):
    if(len(lista)>0):
        acum=0
        acum+=lista[0]
        sumar(lista[1:])
    return acum
print(sumar([1,2,3]))