/*
 * Copyright 2019 Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public final class App {

    //Mensajes
    public static final String USR_MSG = "Introducir número ....: ";
    public static final String ERR_MSG = "ERROR: Entrada Incorrecta";

    public final void launchApp() {

        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        //Mensaje de introducir numero
        int n = UtilesEntrada.leerNumero(USR_MSG, ERR_MSG);

        //Separador
        System.out.println("---");

        //Mostrar numero introducido
        System.out.printf("Número introducido ...: %d%n", n);
    }

}
