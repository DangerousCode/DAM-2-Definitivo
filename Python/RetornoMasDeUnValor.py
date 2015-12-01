__author__ = 'AlumnoT'
def intercambio(num1,num2):
    inter=num1
    num1=num2
    num2=inter
    return(num1,num2)
num1=4
num2=7
num1,num2=intercambio(num1,num2)
print "El valor de n1 es: ",num1," el valor de n2 es: ",num2