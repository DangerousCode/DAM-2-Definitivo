__author__ = 'AlumnoT'
def porDos(n):
    return n*2

def multiporDos(lista):
    return map(porDos,lista)
#main
print multiporDos([1,4,5,2,3,10])

print map(lambda a:a*2,[1,2,3,4])