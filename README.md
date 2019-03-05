# Warehouse

Program przedstawiajacy funkcje ktore moglyby byc uzyte przy tworzeniu magazynu.Mozna dodawac produkty, usuwac je, wyszukiwac produckt po nazwie(lub tylko kilku liter)
oraz sprawdzac zaplenienie magazynu. Dodatkowo jest mozliwosc tworzenia sieci magazynow.



Wydruk program:


FulfillmentCenter{name='dziewiatka', products=[Item{name='szafa', condition=USED, mass=125.0, value=1}, Item{name='krzeslo', condition=NEW, mass=5.25, value=30}, Item{name='sofa', condition=NEW, mass=70.0, value=10}], maxCapacity=1000.0}
Item{name='krzeslo', condition=NEW, mass=5.25, value=30}
[Item{name='krzeslo', condition=NEW, mass=5.25, value=30}, Item{name='sofa', condition=NEW, mass=70.0, value=10}, Item{name='szafa', condition=USED, mass=125.0, value=1}]
[Item{name='krzeslo', condition=NEW, mass=5.25, value=30}, Item{name='sofa', condition=NEW, mass=70.0, value=10}, Item{name='szafa', condition=USED, mass=125.0, value=1}]
1
[Item{name='szafa', condition=USED, mass=125.0, value=1}]
Item{name='szafa', condition=USED, mass=125.0, value=1}
krzeslo
krzeslo
dupa
true
Item{name='sofa', condition=NEW, mass=70.0, value=10}
FulfillmentCenter{name='dziewiatka', products=[Item{name='sofa', condition=NEW, mass=70.0, value=10}], maxCapacity=1000.0}
true
true
true
true
[FulfillmentCenter{name='Debiec', products=[], maxCapacity=500.0}]
Magazyn Debiec jest zapelniony w 0.0 %
Magazyn dziewiatka jest zapelniony w 98.25 %
