__author__ = 'AlumnoT'
'''Crear una funcin a la que pasaremos un prefijo y un nmero
indeterminado de parmetros de tal manera que nos genere nuevas palabras
por ejemplo poner_prefijo_cadena('bi', 'cicleta', 'centenario', 'polar', 'direccional', 'zcocho') ? bicicleta, bicentenario etc'''

def poner_prefijo_cadena(pref,*lista):
    for i in range(len(lista)):
        print(pref+str(lista[i]))

#pref=raw_input("Introduce el prefijo: ")
#for i in range(5):
 #   lista=(raw_input("Introduce palabra sin prefijo: "))




poner_prefijo_cadena("bi","cicleta","centenario","polar")