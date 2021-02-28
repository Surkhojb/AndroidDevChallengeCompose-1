package com.surkhojb.ktpuppy.data

import com.surkhojb.ktpuppy.merge
import com.surkhojb.ktpuppy.model.BreedType.*
import com.surkhojb.ktpuppy.model.GenderType.*
import com.surkhojb.ktpuppy.model.Puppy

object PuppyRepository {

    fun getAll(): List<Puppy> = merge(heroeList,rodeoList,newbieList)

    private val heroeList = listOf(
        Puppy(1,
            "Suko",
            "10 years",
            MALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-15-at-11.30.49-2-scaled.jpeg",
            HERO,
            "A Belgian Shepherd Malinois, 10 years old, belonging to the Guardia Civil who is retiring due to age.\n" +
                    "\n" +
                    "He is a sociable dog who gets on well with dogs of both sexes, adults and children. With cats is unknown.\n" +
                    "\n" +
                    "As a good Malinois, he will need his dose of activity.",
            "https://www.heroesde4patas.org/perro/suko/"
        ),
        Puppy(2,
            "Argo",
            "8 years",
            MALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-09-at-19.23.45-1-scaled.jpeg",
            HERO,
            "We present to you Argo, German Shepherd of 8 years old belonging to the Regiment of Infantry.\n" +
                    "\n" +
                    "He is retired because of his age and because of a spondylosis in his lumbar vertebra which does not prevent him from having a normal life.\n" +
                    "\n" +
                    "During his life he has suffered two operations of 2 otohaematomas in the same ear (right ear) and an operation on his stomach more than 6 years ago to remove a piece of plush that he swallowed while working.\n" +
                    "\n" +
                    "He is an easy going dog who has no problems with dogs or people.\n" +
                    "\n" +
                    "We are looking for a family with no other animals or children to give him the peace of mind he needs.",
            "https://www.heroesde4patas.org/perro/argo/"
        ),
        Puppy(3,
            "Neida",
            "9 years",
            FEMALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-03-at-12.46.16-2-scaled.jpeg",
            HERO,
            "Belgian Shepherd Malinois female, 9 years old, belonging to the Guardia Civil who is retiring due to age.\n" +
                    "\n" +
                    "She is very good with humans, but not suitable with other dogs.\n" +
                    "\n" +
                    "She is in good health and as a good \"Mali\" she needs her daily dose of activity.",
            "https://www.heroesde4patas.org/perro/neida/"
        ),
        Puppy(4,
            "Lardy",
            "10 years",
            MALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/01/WhatsApp-Image-2021-01-02-at-20.39.43-1-scaled.jpeg",
            HERO,
            "We present to you Lardy. A 10 year old German Shepherd belonging to the @policianacional .\n" +
                    "\n" +
                    "Lardy after his retirement has had to go through a process of adaptation to civilian life, and it is now when after his passage through Proyecto Perro we consider that he is ready to be adopted but with several considerations.\n" +
                    "\n" +
                    "It must be a family without children or other animals, with a lot of experience and patience to work with him. He has some dysplasia so exercise should not be excessive.\n" +
                    "\n" +
                    "We need your help so that Lardy can have the life he deserves.",
            "https://www.heroesde4patas.org/perro/lardy/"
        ),
        Puppy(5,
            "Nora",
            "10 years",
            FEMALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-12-at-11.05.20.jpeg",
            HERO,
            "We present Nora, 9 years old female German Shepherd belonging to private security.\n" +
                    "\n" +
                    "In perfect health, she is retired because of her age.\n" +
                    "\n" +
                    "She must take special feed to control her weight. As she is sterilised she tends to put on weight.\n" +
                    "\n" +
                    "She is not suitable with other dogs or other animals as she is aggressive.\n" +
                    "\n" +
                    "She gets on very well with people except with men who show strange behaviour towards her and her handler.\n" +
                    "\n" +
                    "She is perfectly adapted to live in a flat. She has a very calm character.",
            "https://www.heroesde4patas.org/perro/nora/"
        ),
        Puppy(12345,
            "More dogs",
            image = "https://i.pinimg.com/originals/13/75/88/137588392545fb5d22845c5ed4efad73.png",
            breed = HERO,
            contactUrl = "https://www.heroesde4patas.org"
        )
    )
    private val rodeoList = listOf(
        Puppy(6,
            "Chipirón",
            "6 years",
            MALE,
            "http://chuchos-gr.org/imas/animales/_1498/a_14981613675508.jpg",
            SOME_RODEOS,
            "A small dog living in Granada now, I am a little bit scared of human but I am up to find a good family for me.",
            "http://chuchos-gr.org/ficha.php?animal=1498&foto=1"
        ),
        Puppy(7,
            "Bubu",
            "6 years",
            MALE,
            "http://chuchos-gr.org/imas/animales/_927/a_9271468159065.jpg",
            SOME_RODEOS,
            "A small dog living in Granada now,I am a very good-behave dog and I am a bit tired of be in a animal shelter maybe you can find me a spot at your home.",
            "http://chuchos-gr.org/ficha-927"
        ),
        Puppy(8,
            "Mika",
            "5 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1018/a_10181484651581.jpg",
            SOME_RODEOS,
            "A medium size dog living in Granada, I am a bit shy with strangers but I would love to find a home to stay.",
            "http://chuchos-gr.org/ficha-1018"
        ),
        Puppy(9,
            "Rufina",
            "4 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1261/a_12611576412618.jpg",
            SOME_RODEOS,
            "A medium size dog living in Granada.\n I am a strong and active dog but I am very sweet and lovely and If you adopt me I promise I won't destroy our home.",
            "http://chuchos-gr.org/ficha-1261"
        ),
        Puppy(10,
            "Yang",
            "10 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1426/a_14261613676256.jpg",
            SOME_RODEOS,
            "A medium size dog living in Granada..\n After living as a wild dog with my brother, the people from the animal shelter helped me to change my behavior and now I can't wait to meet a new family! ",
            "http://chuchos-gr.org/ficha-1426"
        ),
        Puppy(678910,
            "More dogs",
            image = "https://i.pinimg.com/originals/13/75/88/137588392545fb5d22845c5ed4efad73.png",
            breed = SOME_RODEOS,
            contactUrl = "http://chuchos-gr.org"
        )
    )
    private val newbieList = listOf(
        Puppy(11,
            "Maluma",
            "1 month",
            MALE,
            "https://adoptaunperroabandonado.es/image/cache/catalog/perros/Maluma/E1A06A4C-31AC-45BD-BE70-F640EB0C164D-750x1000.jpeg",
            NEWBIE,
            "A cute puppy and I want find a home to stay and grow up!",
            "https://adoptaunperroabandonado.es/maluma"
        ),
        Puppy(12,
            "Dos",
            "7 months",
            MALE,
            "https://adoptaunperroabandonado.es/image/cache/catalog/perros/Dos/VHXR4471-891x1000.JPG",
            NEWBIE,
            "A cute puppy and I want find a home to stay and grow up!",
            "https://adoptaunperroabandonado.es/dos"
        ),
        Puppy(13,
            "Floyd",
            "5 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/374/show_main/uploads_2Fc8304719-8314-4394-b844-3c9233c9f293_2FIMG-20210222-WA0045.jpg",
            NEWBIE,
            "A cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo/19084-floyd"
        ),
        Puppy(14,
            "Marley",
            "7 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/146/show_main/uploads_2F63050170-5334-4192-9756-bbbc74740cb6_2FIMG-20210207-WA0025.jpeg",
            NEWBIE,
            "A cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo-de-labrador/19017-marley"
        ),
        Puppy(15,
            "Oliva",
            "3 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/377/show_main/uploads_2Ff7265a05-b1d1-43a9-82ba-f55f81de25b3_2FIMG-20210219-WA0090.jpg",
            NEWBIE,
            "A cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo/19085-oliva"
        ),
        Puppy(1112131415,
            "More dogs",
            breed = NEWBIE,
            image = "https://i.pinimg.com/originals/13/75/88/137588392545fb5d22845c5ed4efad73.png",
            contactUrl = "https://www.kiwokoadopta.org/en-adopcion/perros"
        )
    )
}