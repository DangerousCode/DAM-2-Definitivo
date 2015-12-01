__author__ = 'AlumnoT'
def cambiar(*param):
    print param
    cambio=list(param)
    aux=cambio[0]
    cambio[0]=cambio[-1]
    cambio[-1]=aux
    return tuple(cambio)
#main
print(cambiar(5,7,9,10,90))