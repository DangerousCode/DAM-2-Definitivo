__author__ = 'Alumnot'

cadena="el gato y el pato son amigos"
print cadena
lista=cadena.split()

diccionario=dict()

for i,k in enumerate(lista):
	diccionario[k]=0

	for j,l in enumerate(k):
		num=diccionario.get(k)
		num+=1
		diccionario[k]=num

for i,k in enumerate(diccionario):
	print k,diccionario[k]