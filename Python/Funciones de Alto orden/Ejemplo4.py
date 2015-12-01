__author__ = 'AlumnoT'
'''Funcion dada una lista de numeros y un numero cota superior,
queremos devolver aquellos elementos menores a dicha
cota'''
lista=list(range(-5,5))
'''1)Modificar la sintaxis anterior para que solo nos muestre los numeros negativos'''
print filter(lambda x:x<0,lista)
'''2)Crear funcion a la que le vamos a pasar una lista de los valores 0,1,2,3,4 y esa funcion
tiene que devolvernos una lista formada por el cuadrado del primer valor con el cubo del primer valor
(con todos los valores)'''
print map(lambda x:[x*x,x*x*x],[0,1,2,3,4])
'''3)Generar dos listas una con valores numericos del 0 al 5 y otra con tres cadenas cuando ejecutemos la funcion
queremos que nnos muestre la media de la lista que contiene los numeros y que las tres cadenas de la segunda lista
aparezcan como una sola frase'''
lista=list(range(0,6))
listacad=["hola","que","tal"]

print (reduce(lambda x,z:x+z,lista))/len(lista)
print reduce(lambda a,b:a+" "+b,listacad)
'''4)Se nos va a facilitar una lista y una tupla con numeros debemos realizar una funcion que sume cada numero de la lista
con el correspondiente numero de su misma posicion en la tupla todo ello usando map,reduce,filter, lambda'''

lis=[1,2,3]
tup=(3,2,1)

print map(lambda x,y:x+y,lis,tup)