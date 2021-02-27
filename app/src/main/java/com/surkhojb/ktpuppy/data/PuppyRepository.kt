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
            "Hi, I am Suko a retired dog from Spanish Police Force\n I am a sociable dog and I love childs but I can't promise nothing about cats...",
            "https://www.heroesde4patas.org/perro/suko/"
        ),
        Puppy(2,
            "Argo",
            "8 years",
            MALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-09-at-19.23.45-scaled.jpeg",
            HERO,
            "Hi, I am Argo a retired dog from Spanish Army.\n I am a sociable dog but after a few surgeries I will need a home with some peace.",
            "https://www.heroesde4patas.org/perro/argo/"
        ),
        Puppy(3,
            "Neida",
            "9 years",
            FEMALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-03-at-12.46.16-2-scaled.jpeg",
            HERO,
            "Hi, I am Nieda a retired dog from Spanish Police Force.\n I am a bit grumpy ( age's things ) so I am not a good dog-friend....",
            "https://www.heroesde4patas.org/perro/neida/"
        ),
        Puppy(4,
            "Lardy",
            "10 years",
            MALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/01/WhatsApp-Image-2021-01-02-at-20.39.43-3-scaled.jpeg",
            HERO,
            "Hi, I am Lardy a retired dog from Spanish Police Force.\n After a bit of help from to adapt myself to civil life I am ready to find a home!!!",
            "https://www.heroesde4patas.org/perro/lardy/"
        ),
        Puppy(5,
            "Nora",
            "10 years",
            FEMALE,
            "https://www.heroesde4patas.org/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-12-at-12.51.34-1-scaled.jpeg",
            HERO,
            "Hi, I am Nora a retired dog from private security.\n After some years of hard work I am looking for a good retairment and I can't wait to meet my new family!! ",
            "https://www.heroesde4patas.org/perro/nora/"
        ),
        Puppy(12345,
            "More dogs",
            breed = HERO,
            contactUrl = "https://www.heroesde4patas.org"
        )
    )
    private val rodeoList = listOf(
        Puppy(6,
            "Chipirón",
            "6 years",
            MALE,
            "http://chuchos-gr.org/imas/animales/_1498/a_14981613675510.jpg",
            SOME_RODEOS,
            "Hi, I am Chipiron a small dog living in Granada now, I am a little bit scared of human but I am up to find a good family for me.",
            "http://chuchos-gr.org/ficha.php?animal=1498&foto=1"
        ),
        Puppy(7,
            "Bubu",
            "6 years",
            MALE,
            "http://chuchos-gr.org/imas/animales/_927/a_9271606682104.jpg",
            SOME_RODEOS,
            "Hi, I am Bubu a small dog living in Granada now,I am a very good-behave dog and I am a bit tired of be in a animal shelter maybe you can find me a spot at your home.",
            "http://chuchos-gr.org/ficha-927"
        ),
        Puppy(8,
            "Mika",
            "5 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1018/a_10181484651581.jpg",
            SOME_RODEOS,
            "Hi, I am Mika a medium size dog living in Granada, I am a bit shy with strangers but I would love to find a home to stay.",
            "http://chuchos-gr.org/ficha-1018"
        ),
        Puppy(9,
            "Rufina",
            "4 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1261/a_12611576412618.jpg",
            SOME_RODEOS,
            "Hi, I am Rufina a medium size dog living in Granada.\n I am a strong and active dog but I am very sweet and lovely and If you adopt me I promise I won't destroy our home.",
            "http://chuchos-gr.org/ficha-1261"
        ),
        Puppy(10,
            "Yang",
            "10 years",
            FEMALE,
            "http://chuchos-gr.org/imas/animales/_1426/a_14261613676256.jpg",
            SOME_RODEOS,
            "Hi, I am Yang a medium size dog living in Granada..\n After living as a wild dog with my brother, the people from the animal shelter helped me to change my behavior and now I can't wait to meet a new family! ",
            "http://chuchos-gr.org/ficha-1426"
        ),
        Puppy(678910,
            "More dogs",
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
            "Hi, I am Maluma a cute puppy and I want find a home to stay and grow up!",
            "https://adoptaunperroabandonado.es/maluma"
        ),
        Puppy(12,
            "Dos",
            "7 months",
            MALE,
            "https://adoptaunperroabandonado.es/image/cache/catalog/perros/Dos/VHXR4471-891x1000.JPG",
            NEWBIE,
            "Hi, I am Dos a cute puppy and I want find a home to stay and grow up!",
            "https://adoptaunperroabandonado.es/dos"
        ),
        Puppy(13,
            "Floyd",
            "5 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/374/show_main/uploads_2Fc8304719-8314-4394-b844-3c9233c9f293_2FIMG-20210222-WA0045.jpg",
            NEWBIE,
            "Hi, I am Floyd a cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo/19084-floyd"
        ),
        Puppy(14,
            "Marley",
            "7 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/146/show_main/uploads_2F63050170-5334-4192-9756-bbbc74740cb6_2FIMG-20210207-WA0025.jpeg",
            NEWBIE,
            "Hi, I am Marley a cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo-de-labrador/19017-marley"
        ),
        Puppy(15,
            "Oliva",
            "3 months",
            MALE,
            "https://adopt-a-pet.s3.amazonaws.com/pet_pictures/assets/000/044/377/show_main/uploads_2Ff7265a05-b1d1-43a9-82ba-f55f81de25b3_2FIMG-20210219-WA0090.jpg",
            NEWBIE,
            "Hi, I am Oliva a cute puppy and I want find a home to stay and grow up!",
            "https://www.kiwokoadopta.org/en-adopcion/perros/madrid/mestizo/19085-oliva"
        ),
        Puppy(1112131415,
            "More dogs",
            breed = NEWBIE,
            contactUrl = "https://www.kiwokoadopta.org/en-adopcion/perros"
        )
    )
}