package com.anifyuli.kyutwilddictionary

object AnimalData {
    private val name = arrayOf(
        "Elang Botak",
        "Kasuari",
        "Jerapah",
        "Kuda Nil",
        "Badak",
        "Koala",
        "Singa",
        "Serigala",
        "Harimau",
        "Burung Unta"
    )

    private val brief = arrayOf(
        "Elang yang menjadi simbol negara Amerika",
        "Burung besar yang berhabitat di daratan Papua dan Australia",
        "Hewan berleher panjang khas Afrika",
        "Mamalia terbesar ketiga di dunia yang sangat suka berendam",
        "Makhluk bercula yang senang berkubang di lumpur",
        "Marsupialia yang gemar memakan daun Eucalyptus",
        "Sang raja hutan dari bangsa kucing besar",
        "Pemburu senyap yang masih berkerabat dengan Anjing",
        "Kucing besar yang terkenal dengan motif loreng di tubuhnya",
        "Burung tinggi besar yang berhabitat di sebagian Afrika Utara dan Arab"
    )

    private val detail = arrayOf(
        "Elang Botak adalah burung pemangsa yang terdapat di Amerika Utara. Elang botak merupakan burung nasional dan simbol Amerika Serikat. Elang ini sesungguhnya tidaklah botak (bald), tetapi penyematan kata \"bald\" pada burung ini dalam bahasa Inggris karena dahulunya kata tersebut juga dapat diartikan \"kepala yang berwarna putih\".",
        "Casuarius atau kasuari adalah salah satu dari dua genus burung di dalam suku Casuariidae. Genus ini terdiri dari tiga spesies kasuari yang berukuran sangat besar dan tidak dapat terbang.\n" +
                "\n" +
                "Kasuari diperlengkapi tanduk di atas kepalanya, yang membantu burung ini sewaktu berjalan di habitatnya di hutan yang lebat. Selain tanduk dikepalanya, kasuari mempunyai kaki yang sangat kuat dan berkuku tajam. Burung kasuari betina biasanya berukuran lebih besar dan berwarna lebih terang daripada jantan. ",
        "Jerapah atau zarafah adalah mamalia berkuku genap endemik Afrika dan merupakan spesies hewan tertinggi yang hidup di darat. Jerapah jantan dapat mencapai tinggi 4,8 sampai 5,5 meter dan memiliki berat yang dapat mencapai 1.360 kilogram. Jerapah betina biasanya sedikit lebih pendek dan lebih ringan.\n" +
                "\n" +
                "Jerapah berkerabat dengan rusa dan sapi tetapi dari suku yang berbeda, yaitu Giraffidae yang mencakup jerapah sendiri dan kerabat terdekatnya, okapi. Habitat aslinya mencakup area dari Chad sampai dengan Afrika Selatan ",
        "Kuda nil atau badak air adalah mamalia dari keluarga Hippopotamidae yang berukuran besar, omnivora, dan berasal dari Afrika sub-Sahara. Kuda nil adalah hewan darat terbesar ketiga setelah gajah dan badak putih.\n" +
                "\n" +
                "Kuda nil merupakan serapan dari Bahasa Belanda, nijlpaard, yang merupakan gabungan dari kata Nijl yang berarti \"sungai Nil\" dan kata paard yang berarti \"kuda\". Hipopotamus berasal dari bahasa Latin: hippopotamus, yang berasal dari bahasa Yunani: ἱπποπόταμος / hippopótamos, yang merupakan gabungan kata dari ίππος íppos \"kuda\" dan ποταμός potamós \"sungai\", sehingga secara harfiah berarti \"kuda sungai\". ",
        "Badak atau badak sumbu (Rhinocerotidae) adalah lima spesies hewan dari famili Rhinocerotidae, ordo Perissodactyla yang kesemuanya berasal dari Afrika dan Asia." + "\n" + "Badak termasuk hewan herbivora dengan cula sebagai ciri khasnya dan penyebab kelangkaannya di alam liar akibat perburuan untuk diambil culanya",
        "Koala Arnan adalah salah satu binatang berkantung (marsupial) khas dari Australia dan merupakan wakil satu-satunya dari keluarga Phascolarctidae.\n" +
                "\n" +
                "Pada umumnya, banyak dikatakan bahwa kata koala berasal dari bahasa Australia pribumi yang berarti tidak minum. Koala sebenarnya minum air tetapi sangat jarang karena makanannya, daun ekaliptus, sudah mengandung cukup air sehingga koala tidak perlu turun dari pohon untuk minum.\n" +
                "\n" +
                "Koala dapat ditemukan di sepanjang pesisir timur Australia mulai dari Adelaide sampai ke Semenanjung Cape York, dan sampai jauh ke pedalaman karena terdapat curah hujan yang cukup untuk mendukung hutan yang cocok bagi koala. ",
        "Singa (bahasa Sanskerta: Siṃha) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.\n" +
                "\n" +
                "Singa betina jauh lebih aktif dalam berburu, sedangkan singa jantan lebih santai bersikap menunggu dan meminta jatah dari hasil buruan para betinanya. Singa jantan dipercaya lebih unggul dan perkasa dibandingkan dengan kucing besar lainnya, tetapi kelemahan singa ialah tidak bisa memanjat pohon sebagus kucing-kucing besar lainnya. Singa jantan ditumbuhi bulu tebal di sekitar tengkuknya, hal ini lebih menguntungkan untuk melindungi tengkuknya, terutama dalam perkelahian bebas antara kucing besar yang cenderung menerkam tengkuk untuk melumpuhkan musuhnya. ",
        "Serigala abu-abu atau serigala adalah binatang mamalia karnivora. Serigala abu-abu mempunyai asal usul yang sama dengan anjing luar negeri dari keluarga Canis lupus melalui bukti pengurutan DNA dan penyelidikan genetika. Beberapa jenis anjing juga memiliki bentuk fisik yang mirip dengan serigala, contohnya anjing jenis Siberian Husky, Malamut Alaska dan Samoyed. Secara umum, serigala mempunyai tinggi sekitar 60 cm hingga 80 cm (26-32 inci) dan berat sekitar 23–59 kilogram. ",
        "Harimau adalah spesies kucing terbesar yang masih hidup dari genus Panthera. Harimau memiliki ciri loreng yang khas pada bulunya, berupa garis-garis vertikal gelap pada bulu oranye, dengan bulu bagian bawah berwarna putih. Harimau adalah pemangsa puncak, mereka terutama memangsa ungulata seperti rusa dan babi celeng. Harimau adalah hewan teritorial dan umumnya merupakan pemangsa soliter yang penyendiri, tetapi tetap memiliki sisi sosial, mereka tetap tinggal di area-area yang berdekatan, untuk mendukung kebutuhan makanan dan membesarkan keturunannya. Anak harimau tinggal bersama ibu mereka selama sekitar dua tahun, kemudian akan hidup mandiri dan meninggalkan daerah jelajah ibu mereka untuk membangun rumah mereka sendiri. ",
        "Burung unta merupakan burung terbesar yang masih hidup. Dengan ketinggian hingga 2,5 meter (8 kaki), ia cukup besar seukuran orang dewasa berbadan kecil menunggang mereka dan telah digunakan di sebagian Afrika Utara dan Arab sebagai hewan tunggangan perlombaan. Burung ini tidak dapat terbang dan termasuk dalam kumpulan primitif yang kurang dikenal, yaitu ratit (Palaeognaths).\n" +
                "\n" +
                "Burung unta berasal dari sabana dan bagian gurun Afrika di utara dan selatan zona hutan khatulistiwa. Spesies yang terdapat di Timur Tengah, yakni S. c. syriacus, telah lenyap.\n" +
                "\n" +
                "Burung unta dibudidayakan di berbagai tempat di dunia untuk diambil bulunya sebagai hiasan. Kulitnya dipakai untuk menghasilkan bahan tekstil dan dagingnya dijual secara komersial."
    )

    private val bio_name = arrayOf(
        "Haliaeetus leucocephalus",
        "Casuarius casuarius",
        "Giraffa camelopardalis",
        "Hippopotamus amphibius",
        "Rhinoceros unicornis",
        "Phascolarctos cinereus",
        "Panthera leo",
        "Canis lupus",
        "Panthera tigris",
        "Struthio camelus"
    )

    private val kingdom = arrayOf(
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia"
    )

    private val filum = arrayOf(
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata"
    )

    private val kelas = arrayOf(
        "Aves",
        "Aves",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Aves"
    )

    private val ordo = arrayOf(
        "Accipitriformes",
        "Struthioniformes",
        "Artiodactyla",
        " Artiodactyla",
        "Perissodactyla",
        "Diprotodontia",
        "Carnivora",
        "Carnivora",
        "Carnivora",
        "Struthioniformes"
    )

    private val family = arrayOf(
        "Accipitridae",
        "Casuariidae",
        "Giraffidae",
        "Hippopotamidae",
        "Rhinocerotidae",
        "Phascolarctidae",
        "Felidae",
        "Canidae",
        "Felidae",
        "Struthionidae"
    )

    private val photo = intArrayOf(
        R.drawable.bald_eagle,
        R.drawable.cassowary,
        R.drawable.giraffa_camelopardalis,
        R.drawable.hippopotamus,
        R.drawable.indian_rhinoceros,
        R.drawable.koala,
        R.drawable.male_african_lion,
        R.drawable.mexican_wolf,
        R.drawable.panthera_tigris_sumatraencis,
        R.drawable.somali_ostrich
    )

    val listData: ArrayList<Animal>
        get() {
            val list = arrayListOf<Animal>()
            for (position in name.indices) {
                val animal = Animal()
                animal.name = name[position]
                animal.brief = brief[position]
                animal.detail = detail[position]
                animal.bio_name = bio_name[position]
                animal.kingdom = kingdom[position]
                animal.filum = filum[position]
                animal.ordo = ordo[position]
                animal.kelas = kelas[position]
                animal.family = family[position]
                animal.photo = photo[position]
                list.add(animal)
            }
            return list
        }


}