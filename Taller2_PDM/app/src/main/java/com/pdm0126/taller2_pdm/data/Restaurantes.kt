package com.pdm0126.taller2_pdm.data

import com.pdm0126.taller2_pdm.model.Dish
import com.pdm0126.taller2_pdm.model.Restaurant

val Restaurantes = listOf(
    Restaurant(
        id = 1,
        name = "Burgers La Carnosa",
        review = 4.5f,
        description = "Las mejores hamburguesas artesanales de la ciudad.",
        imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&amp;w=930&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida rápida", "Comida americana"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Cheeseburger clásica",
                description = "Hamburguesa con queso cheddar, lechuga, tomate y salsa de la casa.",
                imageUrl = "https://images.unsplash.com/photo-1508736793122-f516e3ba5569?q=80&w=686&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Hamburguesa Bacon BBQ",
                description = "Crujiente tocino, aros de cebolla y nuestra salsa BBQ especial.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1667682209336-9079678199d8?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Loaded fries",
                description = "Papas fritas con aceite de trufa y queso cheddar",
                imageUrl = "https://images.unsplash.com/photo-1609530127564-bee93ebe1c9e?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Sweet Heaven",
        review = 4.8f,
        description = "Pastelería artesanal con los postres más deliciosos y recién horneados",
        imageUrl = "https://plus.unsplash.com/premium_photo-1681826507324-0b3c43928753?q=80&amp;w=1169&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Postres", "Panadería"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Red Velvet Cheesecake",
                description = "Combinación perfecta de pastel red velvet y cheesecake cremoso con betún de queso crema.",
                imageUrl = "https://images.unsplash.com/photo-1685957652870-d56b0e5bea52?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Chocolate Lava Cake",
                description = "Bizcocho de chocolate oscuro con un centro líquido y caliente, acompañado de helado de vainilla.",
                imageUrl = "https://images.unsplash.com/photo-1673551490812-eaee2e9bf0ef?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Macarons Surtidos",
                description = "Caja de 6 macarons franceses de sabores tradicionales: pistacho, frambuesa y chocolate.",
                imageUrl = "https://images.unsplash.com/photo-1558326567-98ae2405596b?q=80&w=759&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "El Mariachi",
        review = 4.6f,
        description = "Tacos tradicionales con el verdadero sabor de México, listos al instante.",
        imageUrl = "https://images.unsplash.com/photo-1613591630496-fdfb1d723c19?q=80&amp;w=1170&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Mexicana", "Comida Rápida"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Tacos al Pastor",
                description = "Tres tacos de carne al pastor con piña, cilantro y cebolla.",
                imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Quesadillas de Birria",
                description = "Tortillas de maíz con queso fundido y carne de birria, acompañadas de caldo.",
                imageUrl = "https://images.unsplash.com/photo-1606350383072-4b031d6bd834?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Guacamole con nachos",
                description = "Aguacate machacado con pico de gallo y nachos crujientes.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1681406689584-2f7612fa98a4?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Sakura Sushi",
        review = 4.7f,
        description = "Sushi premium y comida japonesa contemporánea.",
        imageUrl = "https://images.unsplash.com/photo-1613591630496-fdfb1d723c19?q=80&amp;w=1170&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Asiática", "Sushi"),
        menu = listOf(
            Dish(
                id = 1,
                name = "California Roll",
                description = "Rollo con cangrejo, aguacate, pepino y cobertura de ajonjolí.",
                imageUrl = "https://images.unsplash.com/photo-1559410545-0bdcd187e0a6?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Tonkotsu Ramen",
                description = "Fideos en caldo concentrado de cerdo con huevo nitamago y chashu.",
                imageUrl = "https://images.unsplash.com/photo-1591325418441-ff678baf78ef?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Ebi Tempura",
                description = "Camarones rebozados fritos acompañados de salsa tentsuyu.",
                imageUrl = "https://images.unsplash.com/photo-1677743537607-f7fc9273ec4d?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Crispy Chicken Shack",
        review = 4.3f,
        description = "El pollo frito más crujiente y jugoso de la zona.",
        imageUrl = "https://images.unsplash.com/photo-1426869981800-95ebf51ce900?q=80&amp;w=1170&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Rápida", "Pollo"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Crispy Chicken Tender Combo",
                description = "4 tiras de pollo frito acompañadas de papas fritas y salsa honey mustard.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1683657860968-7474e7ea2d80?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Spicy Chicken Sandwich",
                description = "Pechuga de pollo picante, pepinillos y mayonesa en pan brioche.",
                imageUrl = "https://images.unsplash.com/photo-1703219342329-fce8488cf443?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Mac and Cheese",
                description = "Macarrones cremosos con una mezcla de tres quesos.",
                imageUrl = "https://images.unsplash.com/photo-1708184528301-b0dad28dded5?q=80&w=1082&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "The Waffle Corner",
        review = 4.9f,
        description = "Waffles belgas preparados al momento con los toppings más dulces.",
        imageUrl = "https://images.unsplash.com/photo-1563009390-639e10013c92?q=80&amp;w=1170&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Postres", "Waffles"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Waffle Nutella Extravaganza",
                description = "Waffle crujiente cubierto de Nutella, fresas frescas, plátano y una bola de gelato de vainilla",
                imageUrl = "https://images.unsplash.com/photo-1652101898564-034889096be4?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Copa de Gelato Artesanal",
                description = "Tres bolas de gelato a elección entre pistacho siciliano, chocolate belga y frutos del bosque.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1664391698459-2281b443d16c?q=80&w=1063&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Crepa de Cajeta y Nuez",
                description = "Crepa delgada rellena de dulce de leche (cajeta) caliente y espolvoreada con nuez pecana picada.",
                imageUrl = "https://images.unsplash.com/photo-1579180563511-b0b9740d814b?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "El Rincón del Taco",
        review = 4.4f,
        description = "Antojitos mexicanos con sabor hogareño.",
        imageUrl = "https://plus.unsplash.com/premium_photo-1682092241497-1133454a21e3?q=80&amp;w=687&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Mexicana", "Postres"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Enchiladas Verdes",
                description = "Tres tortillas rellenas de pollo, bañadas en salsa verde con crema y queso.",
                imageUrl = "https://images.unsplash.com/photo-1613514967307-d5b3471b2453?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Burrito Supremo de Res",
                description = "Gran tortilla de harina rellena de carne, frijoles, arroz y queso gouda.",
                imageUrl = "https://images.unsplash.com/photo-1591599606971-f8a2d746703a?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Churros con Cajeta",
                description = "Porción de 4 churros fritos espolvoreados con azúcar y canela.",
                imageUrl = "https://images.unsplash.com/photo-1590872809871-8a1602d5842d?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "Wok And Roll",
        review = 4.5f,
        description = "Salteados rápidos al wok con ingredientes frescos de temporada.",
        imageUrl = "https://images.unsplash.com/photo-1742646803028-94ac3bd00762?q=80&amp;w=1170&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3DD",
        categories = listOf("Comida Asiática", "Wok"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pad Thai de Camarón",
                description = "Fideos de arroz salteados con camarones, huevo, tofu y maní triturado.",
                imageUrl = "https://images.unsplash.com/photo-1655091273851-7bdc2e578a88?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Arroz Frito Yakimeshi",
                description = "Arroz salteado con verduras, carne de res y pollo al estilo japonés.",
                imageUrl = "https://images.unsplash.com/photo-1705088293300-8fc8c7be90e2?q=80&w=1071&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Dumplings de Cerdo al Vapor",
                description = "5 empanadad asiáticas rellenas de cerdo, acompañadas de salsa de soya.",
                imageUrl = "https://images.unsplash.com/photo-1638502338747-f7f368214cce?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 9,
        name = "Pizza Planet",
        review = 4.1f,
        description = "Pizzas rápidas y deliciosas listas para llevar en minutos.",
        imageUrl = "https://images.unsplash.com/photo-1541745537411-b8046dc6d66c?q=80&amp;w=688&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Rápida", "Pizza"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza de Pepperoni Individual",
                description = "Masa delgada con salsa de tomate, abundante queso mozzarella y pepperoni crujiente.",
                imageUrl = "https://images.unsplash.com/photo-1602658015641-55d0d1fef6ad?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Palitroques con Queso",
                description = "Bastones de pan horneados con ajo, mantequilla y queso fundido.",
                imageUrl = "https://images.unsplash.com/photo-1746203103063-60f44fbf5c11?q=80&w=627&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Pizza de Jamón Gigante",
                description = "Masa delgada con salsa de tomate, abundante queso mozzarella y jamón crujiente, rinde hasta 10 porciones.",
                imageUrl = "https://images.unsplash.com/photo-1692737580563-7ba2d896f0f6?q=80&w=915&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "Taste of Bangkok",
        review = 4.6f,
        description = "Especias y sabores exóticos traídos directamente de Tailandia.",
        imageUrl = "https://images.unsplash.com/photo-1675150277436-9c7348972c11?q=80&amp;w=1164&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Asiática", "Thai"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Curry Verde con Pollo",
                description = "Pollo cocinado en leche de coco con curry verde y albahaca tailandesa (picoso).",
                imageUrl = "https://images.unsplash.com/photo-1668665772043-bdd32e348998?q=80&w=881&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Tom Yum Soup",
                description = "Sopa tradicional tailandesa agripicante con camarones y champiñones.",
                imageUrl = "https://images.unsplash.com/photo-1628430043175-0e8820df47c3?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Mango Sticky Rice",
                description = "Arroz glutinoso dulce con leche de coco acompañado de mango fresco.",
                imageUrl = "https://images.unsplash.com/photo-1705234384751-84081009588e?q=80&w=737&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    ),
    Restaurant(
        id = 11,
        name = "Pho Vietnam",
        review = 4.5f,
        description = "Tradicionales sopas Pho y rollos primavera vietnamitas.",
        imageUrl = "https://plus.unsplash.com/premium_photo-1695936034269-6305525a79a9?q=80&amp;w=687&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida Asiática", "Saludable"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pho de Res Tradicional",
                description = "Caldo aromatizado de res con fideos de arroz, láminas delgadas de carne, albahaca y brotes de soja.",
                imageUrl = "https://images.unsplash.com/photo-1582878826629-29b7ad1cdc43?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 2,
                name = "Spring Rolls",
                description = "Dos rollos de papel de arroz rellenos de camarón, fideos de arroz y vegetales con salsa de cacahuate.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1663850685040-19a026ba8032?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            ),
            Dish(
                id = 3,
                name = "Café Vietnamita Helado",
                description = "Café filtrado intenso mezclado con leche condensada dulce sobre hielo.",
                imageUrl = "https://images.unsplash.com/photo-1461023058943-07fcbe16d735?q=80&w=1169&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
            )
        )
    )
)