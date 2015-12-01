__author__ = 'Alvaro'

#Creamos una funcion que gestionara el numero que le pasemos

def comprobar(num):
    #declaracion de funciones
    def sumaDosDigitos(numero):
        #Se pasa a string para poder recorrerlo y se castea en el for para sumarlo
        aux=str(numero)
        sum=0
        for i in aux:
            sum+=int(i)
        return sum
    def sumaTresDigitos(numero):
        aux=str(numero)
        sum=0
        for i in aux:
            sum+=int(i)
        return sum

    if num>=0 and num<10:
        return num
    elif num>9 and num<100:
        return sumaDosDigitos(num)
    elif num>=100 and num<1000:
        return sumaTresDigitos(num)
    elif num<0:
        return -1

#main
print comprobar(5)
