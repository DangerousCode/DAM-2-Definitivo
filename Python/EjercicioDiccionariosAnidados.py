from operator import itemgetter

__author__ = 'Alumnot'
'''
Inicializar dos diccionarios, uno comida y otro mesas
comidas={'Primero': ,'Segundo': ,'postre': }
mesas={precio:0}
1)Introducir los valores de los 2 diccionarios por el usuario.
P.Ej comidas={P:sopa,s:carne,p:flan}
mesas={P:[2.7,2.5,5]}
2)ordenar las claves de comidas
3)ordenar los valores de comidas
4)ordenar el precio de mesas
5)Crear un diccionario llamado comimesa que debe contener los dos dicccionarios
6)mostrar el precio de las mesas
7)Mostrar el postre
'''
mesas={'precio':0}
comidas={'Primero':'','Segundo':'','postre':''}

comidas['Primero']=raw_input("Introduzca el primero: ")
comidas['Segundo']=raw_input("Introduzca el segundo: ")
comidas['postre']=raw_input("Introduzca el postre: ")

lista=list()
for i in range(3):
    lista.append(float(raw_input("Introduce el precio: ")))

mesas['precio']=lista

print mesas
print comidas

print sorted(comidas.items(),key=itemgetter(0))
print sorted(comidas.items(),key=itemgetter(1))
mesas['precio'].sort()
print mesas

comimesa={'Comidas':comidas,'Precio':mesas}

print comimesa

print comimesa['Precio']
print comimesa['Comidas']['postre']
