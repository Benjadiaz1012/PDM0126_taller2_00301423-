package com.pdm0126.pdm_taller2_00301423.dummy

import com.pdm0126.pdm_taller2_00301423.model.Dish
import com.pdm0126.pdm_taller2_00301423.model.Restaurant


val sampleRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Place",
        description = "Las mejores pizzas artesanales de la ciudad",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Italiana", "Pizza", "Casera", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Margarita",
                description = "Mozzarella, albahaca y tomate fresco",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Pizza Pepperoni",
                description = "Pepperoni con queso mozzarella derretido",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Pizza Cuatro Quesos",
                description = "Mozzarella, parmesano, cheddar y queso azul",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 2,
        name = "Smash Burger",
        description = "El hogar de las hamburguesas",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Americana", "Hamburguesas", "Comida Rápida", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Classic Burger",
                description = "Carne de res, queso cheddar y vegetales frescos",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Bacon Double Burger",
                description = "Doble carne con tocino y salsa especial",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Crispy Chicken Burger",
                description = "Pollo empanizado con mayonesa chipotle",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 3,
        name = "Pizza Palace",
        description = "El palacio de las pizzas",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Italiana", "Pizza", "Variedad", "Comida rapida"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Hawaiana",
                description = "Jamón, piña, mozzarella y salsa de tomate",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Pizza Suprema",
                description = "Carne, vegetales, pepperoni y queso mozzarella",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Calzone Italiano",
                description = "Masa rellena de queso, jamón y salsa italiana",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 4,
        name = "Bella Pasta",
        description = "Solo una pasta, tú y yo, piénsalo",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Italiana", "Pasta", "Familiar", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Fettuccine Alfredo",
                description = "Pasta cremosa con queso parmesano",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Spaghetti Bolognesa",
                description = "Pasta con salsa de carne y tomate",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Ravioli de Queso",
                description = "Pasta rellena con queso y salsa de tomate",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 5,
        name = "Sushi Zen",
        description = "Te garantizamos que será como comer en el cielo",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Asiática", "Sushi", "Relajado", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "California Roll",
                description = "Cangrejo, aguacate y pepino",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Salmon Nigiri",
                description = "Arroz japonés con salmón fresco",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Ramen Tonkotsu",
                description = "Sopa japonesa con cerdo, huevo y fideos",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 6,
        name = "Green Bowl",
        description = "Comida fresca, saludable y llena de sabor",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Saludable", "Ensaladas", "Fit", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Caesar Salad",
                description = "Lechuga, pollo, crutones y aderezo césar",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Protein Bowl",
                description = "Arroz integral, pollo, aguacate y vegetales",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Veggie Wrap",
                description = "Tortilla con vegetales frescos y salsa ligera",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 7,
        name = "Dragon Wok",
        description = "Sabores asiáticos preparados al momento",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Asiática", "China", "Fuerte", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pollo Agridulce",
                description = "Pollo crujiente con salsa dulce y vegetales",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Chow Mein",
                description = "Fideos salteados con vegetales y salsa oriental",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Arroz Frito Especial",
                description = "Arroz con pollo, huevo y vegetales",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 8,
        name = "Sweet Heaven",
        description = "Postres dulces para cualquier antojo",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Postres", "Dulces", "Gustito", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Chocolate Brownie",
                description = "Brownie caliente con chocolate derretido",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Cheesecake de Fresa",
                description = "Pastel cremoso con topping de fresa",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Donas Glaseadas",
                description = "Donas suaves con glaseado dulce",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 9,
        name = "Taco Fiesta",
        description = "Comida mexicana rápida y llena de sabor",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Mexicana", "Comida Rápida", "Familiar", "Gustito"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Tacos al Pastor",
                description = "Cerdo marinado con piña, cebolla y cilantro",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Burrito Supremo",
                description = "Carne, arroz, frijoles, queso y salsa",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Nachos Especiales",
                description = "Nachos con queso, carne y jalapeños",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    ),

    Restaurant(
        id = 10,
        name = "Café Central",
        description = "Café, bebidas y postres para relajarte",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
        categories = listOf("Bebidas", "Postres", "Café", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Cappuccino Clásico",
                description = "Café espresso con leche",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Croissant de Jamón",
                description = "Croissant relleno de jamón y queso",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 3,
                name = "Muffin de Chocolate",
                description = "Pan dulce con chispas de chocolate",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            )
        )
    )
)