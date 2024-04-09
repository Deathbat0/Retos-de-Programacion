import asyncio
## DeathbatO

async def ejecutar_tarea(nombre, segundos):
    print(f"Tarea '{nombre}' empezando.")
    print(f"Tarea '{nombre}' durará {segundos} segundo(s).")
    await asyncio.sleep(segundos)
    print(f"Tarea '{nombre}' finalizada.")

async def main():
    # Ejecutar las funciones C, B y A en paralelo
    tarea_c = ejecutar_tarea("C", 3)
    tarea_b = ejecutar_tarea("B", 2)
    tarea_a = ejecutar_tarea("A", 1)
    await asyncio.gather(tarea_c, tarea_b, tarea_a)

    # Ejecutar la función D después de que las funciones C, B y A han finalizado
    tarea_d = ejecutar_tarea("D", 1)
    await tarea_d

asyncio.run(main())
