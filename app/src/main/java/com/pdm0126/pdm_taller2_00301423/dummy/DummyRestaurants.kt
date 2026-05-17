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
        imageUrl = "https://www.giallozafferano.es/images/195-19518/smash-burger_1200x800.jpg",
        categories = listOf("Americana", "Hamburguesas", "Comida Rápida", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Classic Burger",
                description = "Carne de res, queso cheddar y vegetales frescos",
                imageUrl = "https://www.giallozafferano.es/images/195-19518/smash-burger_1200x800.jpg"
            ),
            Dish(
                id = 2,
                name = "Bacon Double Burger",
                description = "Doble carne con tocino y salsa especial",
                imageUrl = "https://www.giallozafferano.es/images/195-19518/smash-burger_1200x800.jpg"
            ),
            Dish(
                id = 3,
                name = "Crispy Chicken Burger",
                description = "Pollo empanizado con mayonesa chipotle",
                imageUrl = "https://www.giallozafferano.es/images/195-19518/smash-burger_1200x800.jpg"
            )
        )
    ),

    Restaurant(
        id = 3,
        name = "Pizza Palace",
        description = "El palacio de las pizzas",
        imageUrl = "https://www.shutterstock.com/image-vector/tasty-illustration-pepperoni-pizza-mushrooms-600w-2714406037.jpg",
        categories = listOf("Italiana", "Pizza", "Variedad", "Comida rapida"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Hawaiana",
                description = "Jamón, piña, mozzarella y salsa de tomate",
                imageUrl = "https://www.shutterstock.com/image-vector/tasty-illustration-pepperoni-pizza-mushrooms-600w-2714406037.jpg"
            ),
            Dish(
                id = 2,
                name = "Pizza Suprema",
                description = "Carne, vegetales, pepperoni y queso mozzarella",
                imageUrl = "https://www.shutterstock.com/image-vector/tasty-illustration-pepperoni-pizza-mushrooms-600w-2714406037.jpg"
            ),
            Dish(
                id = 3,
                name = "Calzone Italiano",
                description = "Masa rellena de queso, jamón y salsa italiana",
                imageUrl = "https://www.shutterstock.com/image-vector/tasty-illustration-pepperoni-pizza-mushrooms-600w-2714406037.jpg"
            )
        )
    ),

    Restaurant(
        id = 4,
        name = "Bella Pasta",
        description = "Solo una pasta, tú y yo, piénsalo",
        imageUrl = "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/e60896c0281485b09a0953df66afd0d4.jpg?itok=yJ57mOvF",
        categories = listOf("Italiana", "Pasta", "Familiar", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Fettuccine Alfredo",
                description = "Pasta cremosa con queso parmesano",
                imageUrl = "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/e60896c0281485b09a0953df66afd0d4.jpg?itok=yJ57mOvF"
            ),
            Dish(
                id = 2,
                name = "Spaghetti Bolognesa",
                description = "Pasta con salsa de carne y tomate",
                imageUrl = "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/e60896c0281485b09a0953df66afd0d4.jpg?itok=yJ57mOvF"
            ),
            Dish(
                id = 3,
                name = "Ravioli de Queso",
                description = "Pasta rellena con queso y salsa de tomate",
                imageUrl = "https://www.recetasnestlecam.com/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/e60896c0281485b09a0953df66afd0d4.jpg?itok=yJ57mOvF"
            )
        )
    ),

    Restaurant(
        id = 5,
        name = "Sushi Zen",
        description = "Te garantizamos que será como comer en el cielo",
        imageUrl = "https://glovo.dhmedia.io/image/global-menu-service/GV_ES/vendor/282318/product/11739152495/b1af4549-002a-4d77-bd1c-1fcd76ab8dc4.jpg?t=W3sicmVzaXplIjp7Im1vZGUiOiJmaXQiLCJ3aWR0aCI6MzIwLCJoZWlnaHQiOjMyMH19XQ==",
        categories = listOf("Asiática", "Sushi", "Relajado", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "California Roll",
                description = "Cangrejo, aguacate y pepino",
                imageUrl = "https://glovo.dhmedia.io/image/global-menu-service/GV_ES/vendor/282318/product/11739152495/b1af4549-002a-4d77-bd1c-1fcd76ab8dc4.jpg?t=W3sicmVzaXplIjp7Im1vZGUiOiJmaXQiLCJ3aWR0aCI6MzIwLCJoZWlnaHQiOjMyMH19XQ=="
            ),
            Dish(
                id = 2,
                name = "Salmon Nigiri",
                description = "Arroz japonés con salmón fresco",
                imageUrl = "https://glovo.dhmedia.io/image/global-menu-service/GV_ES/vendor/282318/product/11739152495/b1af4549-002a-4d77-bd1c-1fcd76ab8dc4.jpg?t=W3sicmVzaXplIjp7Im1vZGUiOiJmaXQiLCJ3aWR0aCI6MzIwLCJoZWlnaHQiOjMyMH19XQ=="
            ),
            Dish(
                id = 3,
                name = "Ramen Tonkotsu",
                description = "Sopa japonesa con cerdo, huevo y fideos",
                imageUrl = "https://glovo.dhmedia.io/image/global-menu-service/GV_ES/vendor/282318/product/11739152495/b1af4549-002a-4d77-bd1c-1fcd76ab8dc4.jpg?t=W3sicmVzaXplIjp7Im1vZGUiOiJmaXQiLCJ3aWR0aCI6MzIwLCJoZWlnaHQiOjMyMH19XQ=="
            )
        )
    ),

    Restaurant(
        id = 6,
        name = "Green Bowl",
        description = "Comida fresca, saludable y llena de sabor",
        imageUrl = "https://greenbowl.com.do/wp-content/uploads/2024/03/greenbowl-shrimp-salad.png",
        categories = listOf("Saludable", "Ensaladas", "Fit", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Caesar Salad",
                description = "Lechuga, pollo, crutones y aderezo césar",
                imageUrl = "https://greenbowl.com.do/wp-content/uploads/2024/03/greenbowl-shrimp-salad.png"
            ),
            Dish(
                id = 2,
                name = "Protein Bowl",
                description = "Arroz integral, pollo, aguacate y vegetales",
                imageUrl = "https://greenbowl.com.do/wp-content/uploads/2024/03/greenbowl-shrimp-salad.png"
            ),
            Dish(
                id = 3,
                name = "Veggie Wrap",
                description = "Tortilla con vegetales frescos y salsa ligera",
                imageUrl = "https://greenbowl.com.do/wp-content/uploads/2024/03/greenbowl-shrimp-salad.png"
            )
        )
    ),

    Restaurant(
        id = 7,
        name = "Dragon Wok",
        description = "Sabores asiáticos preparados al momento",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNQyuKbEKyA4cb6VOKjZ3SLumlVxf53M9EiA&s",
        categories = listOf("Asiática", "China", "Fuerte", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pollo Agridulce",
                description = "Pollo crujiente con salsa dulce y vegetales",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNQyuKbEKyA4cb6VOKjZ3SLumlVxf53M9EiA&s"
            ),
            Dish(
                id = 2,
                name = "Chow Mein",
                description = "Fideos salteados con vegetales y salsa oriental",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNQyuKbEKyA4cb6VOKjZ3SLumlVxf53M9EiA&s"
            ),
            Dish(
                id = 3,
                name = "Arroz Frito Especial",
                description = "Arroz con pollo, huevo y vegetales",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNQyuKbEKyA4cb6VOKjZ3SLumlVxf53M9EiA&s"
            )
        )
    ),

    Restaurant(
        id = 8,
        name = "Sweet Heaven",
        description = "Postres dulces para cualquier antojo",
        imageUrl = "https://s3.ppllstatics.com/diariovasco/www/multimedia/201909/09/media/cortadas/postres-sin-azucar-kPaE-RHqLy3xgNxM4BJcU7OrSbTL-1248x770@Diario%20Vasco-k71C-RHqLy3xgNxM4BJcU7OrSbTL-1248x770@Diario%20Vasco.jpg",
        categories = listOf("Postres", "Dulces", "Gustito", "Variedad"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Chocolate Brownie",
                description = "Brownie caliente con chocolate derretido",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXFhZFp9RQjHxb2hCTBFpVW30cEUaNRbQvVA&s"
            ),
            Dish(
                id = 2,
                name = "Cheesecake de Fresa",
                description = "Pastel cremoso con topping de fresa",
                imageUrl = "https://www.seriouseats.com/thmb/VAuEFUAePPa4QXEP3dhBHA4RvJA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/20250904-SEA-WhiteChocolateCheesecake-LorenaMasso-HERO-206c88529afb4abbb2ca8f114b1d0f2b.jpg"
            ),
            Dish(
                id = 3,
                name = "Donas Glaseadas",
                description = "Donas suaves con glaseado dulce",
                imageUrl = "https://cdn.shopify.com/s/files/1/0173/8181/8422/files/20250701184251-donutglaze.jpg?v=1751395372&width=1600&height=900"
            )
        )
    ),

    Restaurant(
        id = 9,
        name = "Taco Fiesta",
        description = "Comida mexicana rápida y llena de sabor",
        imageUrl = "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg",
        categories = listOf("Mexicana", "Comida Rápida", "Familiar", "Gustito"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Tacos al Pastor",
                description = "Cerdo marinado con piña, cebolla y cilantro",
                imageUrl = "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg"
            ),
            Dish(
                id = 2,
                name = "Burrito Supremo",
                description = "Carne, arroz, frijoles, queso y salsa",
                imageUrl = "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg"
            ),
            Dish(
                id = 3,
                name = "Nachos Especiales",
                description = "Nachos con queso, carne y jalapeños",
                imageUrl = "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg"
            )
        )
    ),

    Restaurant(
        id = 10,
        name = "Café Central",
        description = "Café, bebidas y postres para relajarte",
        imageUrl = "https://hips.hearstapps.com/hmg-prod/images/cafe-1599479980.jpg?crop=1xw:0.75xh;center,top&resize=1200:*",
        categories = listOf("Bebidas", "Postres", "Café", "Familiar"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Cappuccino Clásico",
                description = "Café espresso con leche",
                imageUrl = "https://hips.hearstapps.com/hmg-prod/images/cafe-1599479980.jpg?crop=1xw:0.75xh;center,top&resize=1200:*"
            ),
            Dish(
                id = 2,
                name = "Croissant de Jamón",
                description = "Croissant relleno de jamón y queso",
                imageUrl = "https://hips.hearstapps.com/hmg-prod/images/cafe-1599479980.jpg?crop=1xw:0.75xh;center,top&resize=1200:*"
            ),
            Dish(
                id = 3,
                name = "Muffin de Chocolate",
                description = "Pan dulce con chispas de chocolate",
                imageUrl = "https://hips.hearstapps.com/hmg-prod/images/cafe-1599479980.jpg?crop=1xw:0.75xh;center,top&resize=1200:*"
            )
        )
    )
)