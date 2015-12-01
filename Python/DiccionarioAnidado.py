__author__ = 'Alumnot'
diccionario={'nombre':{'Primero':'xxx','Apellido':'yyy'},'trabajo':['desarrollador','jefe'],'edad':30}
print diccionario
print diccionario['nombre']
print diccionario['nombre']['Apellido']
print diccionario['trabajo']
print diccionario['trabajo'][-1]
diccionario['trabajo'].append('junior')
print diccionario['trabajo']