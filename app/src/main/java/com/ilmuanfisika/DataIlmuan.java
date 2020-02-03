package com.ilmuanfisika;

import java.util.ArrayList;

public class DataIlmuan {
    private static String[] fisiknama = {
            "Albert Einstein",
            "Alessandro Volta",
            "Archimedes",
            "Arthur Compton",
            "Blaise Pascal",
            "Brian David Josephson",
            "Carl Friedrich Gauss",
            "Charles Wheatstone",
            "Christian Doppler ",
            "Daniel Bernoulli"
    };

    private static String[] penemuan = {
            "Teori Relativitas",
            "Batu Baterai",
            "Hidrostatika",
            "Efek Compton",
            "Mesin Hitung",
            "Efek Josephson",
            "Teori Bilangan",
            "Jembatan Wheatstone",
            "Efek Doppler",
            "Hukum Bernoulli"

    };

    private static String[] fisikdetail = {
            "Albert Einstein adalah seorang ilmuwan fisika teoretis yang dipandang luas sebagai ilmuwan terbesar dalam abad ke-20. Ia lahir di Ulm, Kerajaan Württemberg, Kerajaan Jerman, 14 Maret 1879 dan meninggal di Princeton, New Jersey, Amerika Serikat, 18 April 1955 pada umur 76 tahun. Dia mengemukakan teori relativitas dan juga banyak menyumbang bagi pengembangan mekanika kuantum, mekanika statistika, dan kosmologi. Dia dianugerahi Penghargaan Nobel dalam Fisika pada tahun 1921 untuk penjelasannya tentang efek fotolistrik dan \"pengabdiannya bagi Fisika Teoretis",
            "Alessandro Giuseppe Antonio Anastasio Gerolamo Umberto Volta (lahir di Como, Tanah Milik Duke Milan, (kini Italia), 18 Februari 1745 – meninggal di Como, Lombardi-Venetia, (kini Italia), 5 Maret 1827 pada umur 82 tahun) adalah seorang fisikawan Italia. Ia terutama dikenal karena mengembangkan baterai pada tahun 1800.",
            "Archimedes adalah matematikawan, filsuf, fisikawan, insinyur, penemu, dan astronom Yunani. Ia dianggap sebagai salah satu ilmuwan terkemuka di zaman klasik. Di antara kemajuan dalam fisika dasar adalah hidrostatika, statika dan penjelasan dari prinsip tuas. Dia dikreditkan dengan merancang mesin inovatif, termasuk mesin pengepungan dan pompa ulir yang menyandang namanya. Percobaan modern telah menguji dan mengklaim bahwa Archimedes merancang mesin yang mampu mengangkat kapal keluar dari air dan membakar kapal menggunakan sebuah array dari cermin.",
            "Arthur Holly Compton  adalah seorang fisikawan Amerika yang memenangkan Hadiah Nobel dalam Fisika pada tahun 1927 atas sumbangannya dalam penemuan sebuah efek yang dinamai menurut namanya (efek Compton). Ia juga dikenal karena kepemimpinannya di Manhattan Project 's Metallurgical Laboratory. Ia menjabat sebagai Kanselir dari Washington University di St Louis 1945-1953.",
            "Blaise Pascal adalah seorang ahli matematika, fisikawan, penemu, penulis dan filsuf Kristen berkebangsaan Perancis. Ia lahir di Clermont-Ferrand, Perancis pada 19 Juni 1623 dan meninggal di Paris, Perancis pada 19 Agustus 1662 pada umur 39 tahun. Minat utamanya ialah filsafat dan agama, sedangkan hobinya yang lain adalah matematika dan geometri proyektif. Bersama dengan Pierre de Fermat menemukan teori tentang probabilitas. Pada awalnya minat riset dari Pascal lebih banyak pada bidang ilmu pengetahuan dan ilmu terapan, di mana dia telah berhasil menciptakan mesin penghitung yang dikenal pertama kali.",
            "Brian David Josephson adalah fisikawan Inggris dan pemenang Hadiah Nobel dalam Fisika tahun 1973, Bagian hadiah lainnya diberikan kepada Leo Esaki dan Ivar Giaever.. Ia menemukan efek Josephson saat ia berusia 22 tahun. Brian Josephson lahir pada 4 Januari 1940 di Cardiff, Wales. orang tuanya seorang Yahudi, Mimi (née Weisbard, 1911-1998), dan Abraham Josephson. Ia belajar di SMA Cardiff, ia mendapat bimbingan dari Master fisika, EMRYS Jones, yang memperkenalkannya kepada teori fisika. Pada tahun 1957 ia pergi ke Cambridge, di mana ia belajar matematika di Trinity College.",
            "Johann Carl Friedrich Gauss adalah matematikawan, astronom, dan fisikawan Jerman yang memberikan beragam kontribusi, termasuk teori bilangan,aljabar , statistik, analisis, geometri diferensial, geodesi, geofisika,elektrostatika, astronomi, dan optik. Ia dipandang sebagai salah satu matematikawan terbesar sepanjang masa selain Archimedes dan Isaac Newton. Carl Friedrich Gauss lahir di Brunswick, Duchy of Brunswick-Wolfenbüttel, Kekaisaran Romawi Suci pada 30 April 1777. Saat umurnya belum genap 3 tahun, ia telah mampu mengoreksi kesalahan daftar gaji tukang batu ayahnya.",
            "Sir Charles Wheatstone adalah seorang ilmuwan Inggris dan penemu banyak terobosan ilmiah di era Ratu Victoria, Diantara penemuannya ialah English concertina, stereoscope (perangkat untuk menampilkan gambar tiga dimensi), dan cipher Playfair (sebuah enkripsi teknik). Namun, Wheatstone terkenal karena kontribusinya dalam pengembangan jembatan Wheatstone, awalnya diciptakan oleh Samuel Hunter Christie, yang digunakan untuk mengukur hambatan listrik yang tidak diketahui, dan sebagai tokoh utama dalam pengembangan telegrafi.",
            "Christian Andreas Doppler adalah pakar matematika dan fisika berkebangsaan Austria yang dikenal dunia melalui berbagai temuan dan penelitiannya. Doppler dilahirkan pada tanggal 29 November 1803 di Salzburg, Austria. Christian Doppler merupakan anak dari pasangan suami istri Johann Evngelist Doppler dan Therese Doppler. Ia juga memiliki seorang saudara laki-laki yang bernama Johann Doppler dan tiga orang saudara perempuan yang bernama Katharina Doppler Mullbauer, Anna Doppler, dan Theresia Doppler.",
            "Daniel Bernoulli adalah seorang seorang matematikawan dan fisikawan Swiss. Salah satu pemikirannya yang penting dalam dunia fisika adalah persamaan Bernoulli pada tabung arus yang digunakan untuk pengukuran kecepatan aliran karena tekanan. Ia merupakan salah satu dari banyak matematikawan terkemuka dalam keluarga Bernoulli . Dia diingat karena aplikasi matematika untuk mekanik, khususnya mekanika fluida , dan untuk kepeloporannya dalam probabilitas dan statistik. Namanya disebut dalam prinsip Bernoulli, contoh tertentu dari konservasi energi, yang menggambarkan matematika dari mekanisme yang mendasari pengoperasian dua teknologi penting dari abad ke-20: Karburator dan Sayap pesawat."
    };

    private static String[] refrensi = {
            "http://blogpenemu.blogspot.com/2014/02/Albert-Einstein-Penemu-Teori-Relativitas.html",
            "http://blogpenemu.blogspot.com/2014/02/penemu-batu-baterai-alessandro-volta.html",
            "http://blogpenemu.blogspot.com/2014/03/Archimedes-Ilmuwan-Fisika-di-Zaman-Klasik.html",
            "http://blogpenemu.blogspot.com/2014/04/arthur-compton-penemu-efek-compton.html",
            "http://blogpenemu.blogspot.com/2014/02/Blaise-Pascal-Penemu-Mesin-Hitung.html",
            "http://blogpenemu.blogspot.com/2015/03/brian-david-josephson-penemu-efek-josephson.html",
            "http://blogpenemu.blogspot.com/2014/06/biografi-carl-friedrich-gauss-penemu-Teori-Bilangan.html",
            "http://blogpenemu.blogspot.com/2015/08/charles-wheatstone-penemu-stereogram.html",
            "http://blogpenemu.blogspot.com/2014/05/biografi-christian-doppler-penemu-efek-Doppler.html",
            "http://blogpenemu.blogspot.com/2014/06/daniel-bernoulli-penemu-hukum-bernoulli.html"

    };

    private static int[] ilmuangambar = {
            R.drawable.albert_einstein,
            R.drawable.alessandro_volta,
            R.drawable.archimedes,
            R.drawable.arthur,
            R.drawable.blaise,
            R.drawable.brian,
            R.drawable.carl,
            R.drawable.charles,
            R.drawable.christian,
            R.drawable.daniel

    };

    static ArrayList<ilmuan> listdata(){
        ArrayList<ilmuan> list = new ArrayList<>();

        for (int i = 0; i<fisiknama.length;i++){
            ilmuan ilmufisik = new ilmuan();
            ilmufisik.setNama(fisiknama[i]);
            ilmufisik.setPenemuan(penemuan[i]);
            ilmufisik.setDeskripsi(fisikdetail[i]);
            ilmufisik.setRefrensi(refrensi[i]);
            ilmufisik.setPhoto(ilmuangambar[i]);
            list.add(ilmufisik);
        }
        return list;
    }
}
