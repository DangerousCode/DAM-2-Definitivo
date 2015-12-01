__author__ = 'AlumnoT'
'''Crear una funcin llamada calculo_impuestos  que nos
 calcular el valor a pagar por cada producto   si sabemos que cada
producto se le tiene que aplicar una tasa del 21% fijo'''

def calculo_impuestos(precio):
    return precio*1.21

precio=float(raw_input("Introduce un precio: "))
print "El precio con IVA es: ",calculo_impuestos(precio)
