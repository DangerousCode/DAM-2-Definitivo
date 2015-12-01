__author__ = 'AlumnoT'
def esPositivo(n):
    return n>=0
def filterpositivos(numeros):
    return filter(esPositivo,numeros)
#main
print filterpositivos([2,-1,4,10])

print map(lambda x: x if (x>0) else "aaaaahhh",[2,-1,4,10])