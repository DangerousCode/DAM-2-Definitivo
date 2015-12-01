mnombre={1:"Pepe",2:"Manuel"}
mnacionalidad={1:"Espanyol",2:"Cubano"}
mmarca={1:"Kawasaki",2:"Yamaha"}
mclasificacion={1:"Primero",2:"Cuarto"}
cnombrepiloto={1:"Jhon",2:"Michael"}
cnombrecopiloto={1:"Antonio",2:"Bryan"}
cnacionalidadpiloto={1:"EEUU",2:"Ingles"}
cnacionalidadcopiloto={1:"Espanyol",2:"Peruano"}
cmarca={1:"Nissan",2:"Volkswagen"}
cclasificacion={1:"Segundo",2:"Quinto"}
flag=False
while not flag:
    opcion=int(raw_input("Introduzca la opcion(1:mostrar,2:aniadir,3:modificar posicion,4:abandono). Para salir introduzca otro numero: "))
    if opcion==1:
        print "Motos: \n"
        print mnombre.items()
        print mnacionalidad.items()
        print mmarca.items()
        print mclasificacion.items()
        print "\nCoches: \n"
        print cnombrepiloto.items()
        print cnacionalidadpiloto.items()
        print cnombrecopiloto.items()
        print cnacionalidadcopiloto.items()
        print cmarca.items()
    elif opcion==2:
        print "Ha elegido la opcion para aniadir a los diccionarios.\n"
        print "Motos\n"
        clave=int(raw_input("Introduce nuevo dorsal: "))
        valornombrem=raw_input("Introduce el nombre: ")
        valornacionalidadm=raw_input("Introduce la nacionalidad: ")
        valormarcam=raw_input("Introduce la marca de la moto: ")
        valorclasificacionm=raw_input("Introduce el puesto: ")

        print "\nCoches\n"
        clavenombrec=int(raw_input("Introduce nuevo dorsal: "))
        valornombrepiloto=raw_input("Introduce el nombre del piloto: ")
        valornombrecopiloto=raw_input("Introduce le nombre del copiloto: ")
        valornacionalidadpiloto=raw_input("Introduce la nacionalidad del piloto: ")
        valornacionalidadcopiloto=raw_input("Introduce la nacionalidad del copiloto: ")
        valormarcac=raw_input("Introduce la marca del coche: ")
        valorclasificacionc=raw_input("Introduce el puesto: ")

        if mnombre.has_key(clave):
            print "Ya existe la clave. Para modificar el diccionario utilice la opcion tres."

        else:
            mnombre[clave]=valornombrem
            mnacionalidad[clave]=valornacionalidadm
            mmarca[clave]=valormarcam
            mclasificacion[clave]=valorclasificacionm

            cnombrepiloto[clavenombrec]=valornombrepiloto
            cnombrecopiloto[clavenombrec]=valornombrecopiloto
            cnacionalidadpiloto[clavenombrec]=valornacionalidadpiloto
            cnacionalidadcopiloto[clavenombrec]=valornacionalidadcopiloto
            cmarca[clavenombrec]=valormarcac
            cclasificacion[clavenombrec]=valorclasificacionc

    elif opcion==3:
        print "Ha elegido la opcion para modificar una posicion."
        mc=raw_input("Introduce que diccionarios quiere cambiar:<coches o motos> ")
        clave=int(raw_input("Introduce la clave a cambiar: "))

        if mnombre.has_key(clave) or cnombrepiloto.has_key(clave):
            if mc=="motos":
                clavenombrem=int(raw_input("Introduce nuevo dorsal: "))
                valornombrem=raw_input("Introduce el nombre: ")
                valornacionalidadm=raw_input("Introduce la nacionalidad: ")
                valormarcam=raw_input("Introduce la marca de la moto: ")
                valorclasificacionm=raw_input("Introduce el puesto: ")

                mnombre[clave]=valornombrem
                mnacionalidad[clave]=valornacionalidadm
                mmarca[clave]=valormarcam
                mclasificacion[clave]=valorclasificacionm

            elif mc=="coches":
                clavenombrec=int(raw_input("Introduce nuevo dorsal: "))
                valornombrepiloto=raw_input("Introduce el nombre del piloto: ")
                valornombrecopiloto=raw_input("Introduce le nombre del copiloto: ")
                valornacionalidadpiloto=raw_input("Introduce la nacionalidad del piloto: ")
                valornacionalidadcopiloto=raw_input("Introduce la nacionalidad del copiloto: ")
                valormarcac=raw_input("Introduce la marca del coche: ")
                valorclasificacionc=raw_input("Introduce el puesto: ")

                cnombrepiloto[clave]=valornombrepiloto
                cnombrecopiloto[clave]=valornombrecopiloto
                cnacionalidadpiloto[clave]=valornacionalidadpiloto
                cnacionalidadcopiloto[clave]=valornacionalidadcopiloto
                cmarca[clave]=valormarcac
                cclasificacion[clave]=valorclasificacionc
        else:
            print "La clave no existe en el diccionario. Para aniadir acceda a la opcion 2"

    elif opcion==4:
        print "Ha elegido la opcion para especificar abandonos."
        mc=raw_input("Introduce que diccionarios quiere cambiar:<coches o motos> ")
        clave=int(raw_input("Introduce la clave a cambiar: "))

        if mnombre.has_key(clave) or cnombrepiloto.has_key(clave):
            if mc=="motos":

                mnombre[clave]="0"
                mnacionalidad[clave]="0"
                mmarca[clave]="0"
                mclasificacion[clave]="0"

                print mnombre.items()
                print mnacionalidad.items()
                print mmarca.items()
                print mclasificacion.items()

            elif mc=="coches":

                cnombrepiloto[clave]="0"
                cnombrecopiloto[clave]="0"
                cnacionalidadpiloto[clave]="0"
                cnacionalidadcopiloto[clave]="0"
                cmarca[clave]="0"
                cclasificacion[clave]="0"

                print cnombrepiloto.items()
                print cnacionalidadpiloto.items()
                print cnombrecopiloto.items()
                print cnacionalidadcopiloto.items()
                print cmarca.items()
        else:
            print "La clave no existe en el diccionario."

    else:
        flag=True;