ENUNCIADO

La ciudad de Buenavista está llevando a cabo un censo dedicado a conocer las características de los teléfonos celulares de sus residentes. Dicho censo permitirá proyectar la infraestructura más acorde a las necesidades y también, recopilar datos en referencia a las tendencias y preferencias de los usuarios.

Todo teléfono celular tiene un número único de contacto, está inscrito en un operador (Obvio, Migo o Teletónica), su batería tiene una duración máxima establecida (en horas) y tiene configurado un tono de timbre (“Todero”, ”Bye bye“ o “Silencio”). Después de analizar los tipos de teléfonos predominantes en el mercado, se pudo establecer que se existen dos grupos: “SmartPhone“ y “Flecha”.

A los teléfonos Flecha su batería siempre les dura hasta 96 horas, se les configura como tono de timbre “Todero” (el éxito de los 90s) y tienen incorporado un sintonizador de radio (“AM”, “FM”, “AM/FM” o “No lo sé”). A su vez, los teléfonos SmartPhone siempre su batería les dura hasta 8 horas, se les configura como tono de timbre “Silencio”, y tienen conectividad por Wifi (“Apagado”, “Del vecino” o “Siempre Free”).

El piloto del censo en la localidad central permite llevar a cabo la tarea por medio de dispositivos portátiles que son utilizados por los funcionarios que visitan las residencias que les son asignadas. Dichos dispositivos responden a un conjunto de instrucciones (expresadas a través de cadenas de caracteres) con una serie de campos separados por el carácter especial ‘:’. Los campos correspondientes son:

1. “1” -> Censar, “2” -> Listar Censados, “3” -> Apagar.

Cuando en el primer campo va el valor “1” (Censar), se utilizan los siguientes campos complementarios:

2. Indica el tipo de teléfono celular (“Flecha” o “SmartPhone”).

3. Indica el número de teléfono.

4. Indica el operador del usuario (“Obvio”, “Migo” o “Teletónica”).

5. Campo adicional: Cuando se trata de un teléfono celular “Flecha”, indica el tipo de sintonizador incorporado (“AM”, “FM”, “AM/FM” o “No lo sé”). Para el caso de los SmartPhone, indica la conectividad wifi (“Apagado”, “Del vecino” o “Siempre Free”).

Ejemplo1: La cadena “1:Flecha:305-5447.948:Teletónica:AM” significa censar un teléfono celular Flecha, con número de telefónico 305-5447.948, operado por Teletónica, que adicionalmente tiene un sintonizador AM.

Ejemplo2: La cadena “1:SmartPhone:323-7883.718:Obvio:Siempre Free” significa censar un teléfono celular SmartPhone, con número de telefónico 323-7883.718, operado por Obvio, que adicionalmente tiene un conectividad wifi Siempre Free.

Cuando en el primer campo va el valor “2” (Listar Censados), se debe imprimir por consola la frase “***Teléfonos Celulares Censados***” y en las líneas subsiguientes listar cada teléfono celular censado, de la siguiente manera:

Para Flecha (De conformidad con el Ejemplo 1):

\tTeléfono Celular Flecha en el operador Teletónica

\tNúmero Telefónico : 305-5447.948

\tDuración Máxima Batería: 96 horas

\tTono de Timbre: Todero

\tTipo de Sintonizador: AM

Para SmartPhone (De conformidad con el Ejemplo 2):

\tTeléfono Celular Smart Phone en el operador Obvio

\tNúmero Telefónico : 323-7883.718

\tDuración Máxima Batería: 8 horas

\tTono de Timbre: Silencio

\tConnectividad Wifi: Siempre Free

El siguiente diagrama de clases presenta el modelamiento orientado por objetos de la situación descrita:Diagrama de Clases

Objetivo: Implementar un programa en Java que contenga las clases descritas en el diagrama, utilizando 4 diferentes archivos (una clase en cada archivo):

1. TeléfonoCelular.java: Implementación de la clase TeléfonoCelular.

2. Flecha.java: Implementación de la clase Flecha.

3. SmartPhone.java: Implementación de la clase SmartPhone.

4. DispositivoPortatil.java: Implementación de la clase DispositivoPortatil. Adicionalmente, debe tener la función (método público y estático) main que sea el punto de arranque del programa, y partir de cada ingreso por consola que haga el usuario de este programa, debe responder de conformidad con el conjunto de instrucciones especificadas.

Nota: No debe existir definición de paquete en esta implementación (todas las clases estarán en el paquete por defecto en Java).




1:SmartPhone:323-7883.718:Obvio:Siempre Free
1&PARTICULAR&LMC555&150&6&ROJO

1 : SmartPhone : 323-7883.718 : Obvio :Siempre Free

1 & PARTICULAR & LMC555 & 150 & 6 & ROJO
1:Flecha:305-5447.948:Teletónica:AM
