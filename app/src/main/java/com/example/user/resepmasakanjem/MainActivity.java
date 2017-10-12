package com.example.user.resepmasakanjem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Resepku> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparResepData();

    }

    public void preparResepData(){
        Resepku resepku;
        for (int i=0; i<3 ; i++){
            resepku = new Resepku("Nasi Gandul", R.drawable.nasigandul, "Nasi Gandul Jos",
                    "Bahan-bahan yang dibutuhkan untuk membuat nasi gandul :\n" +
                            "\n" +
                            "    250 gram Daging Kerbau, kemudian anda potong-potong berbentuk kotak\n" +
                            "    600 ml Santan dari ½ butir Kelapa\n" +
                            "    1 lembar Daun Salam\n" +
                            "    2 cm Lengkuas, kemudian anda memarkan\n" +
                            "    1 tangkai Serai, kemudian anda memarkan\n" +
                            "    600 gram Nasi\n" +
                            "    2 sendok makan Minyak untuk menumis\n" +
                            "\n" +
                            "Bumbu halus yang dibutuhkan :\n" +
                            "\n" +
                            "    8 butir Bawang Merah\n" +
                            "    4 siung Bawang Putih\n" +
                            "    2 buah Cabai Merah\n" +
                            "    1 cm Kencur\n" +
                            "    1 buah Kluwek, kemudian anda ambil isinya\n" +
                            "    ¼ sendok teh Jintan\n" +
                            "    ¼ sendok teh Ketumbar\n" +
                            "    ½ sendok teh Merica\n" +
                            "    1 sendok teh Garam\n" +
                            "\n" +
                            "Nah setelah anda menyiapkan semua bahan dan bumbu yang diperlukan, silahkan anda simak bagaimana cara membuat nasi gandul khas pati ini.\n" +
                            "\n" +
                            "Cara membuat nasi gandul khas pati :\n" +
                            "\n" +
                            "    Pertama anda tumis semua bumbu halusnya, kemudian anda tambahkan juga daun salam, serai dan lengkuas hingga harum.\n" +
                            "    Kemudian anda masukkan daging dan aduk hingga berubah warna dagingnya.\n" +
                            "    Selanjutnya anda tuangi santan dan masak dengan api kecil hingga dagingnya lunak dan kuah agak mengental.\n" +
                            "    Sajikan dengan nasi putih hangat.\n" +
                            "\n" +
                            "Nah seperti itulah proses pembuatan nasi gandul khas pati ini, silahkan anda mencobanya sendiri didapur ya.\n" +
                            "\n" +
                            "Selamat mencoba.");
            resepList.add(resepku);

            resepku = new Resepku("Sate Ayam", R.drawable.sateayam, "Sate Ayam Is The Best",
                    "\n" +
                            "Bahan-bahan\n" +
                            "2 porsi\n" +
                            "\n" +
                            "    500 grm daging ayam potong kotak2\n" +
                            "    jeruk nipis\n" +
                            "    1 sdt garam\n" +
                            "    2 siung bawang putih\n" +
                            "    2 sdm kecap manis\n" +
                            "    1 sdm minyak\n" +
                            "    minyak oles\n" +
                            "    secukupnya minyak goreng\n" +
                            "    3 siung bawang putih\n" +
                            "    secukupnya ketumbar\n" +
                            "    saos kacang\n" +
                            "    3 sdm kacang tanah goreng\n" +
                            "    2 cabe rawit agak besar * boleh tambah kalau suka pedas\n" +
                            "    2 siung bawang putih\n" +
                            "    1/2 sdm gula merah\n" +
                            "    1 sdt petis\n" +
                            "    secukupnya kecap manis\n" +
                            "    garam\n" +
                            "    gula\n" +
                            "    air\n" +
                            "\n" +
                            "Langkah\n" +
                            "\n" +
                            "    Dalam wadah daging ayam beri perasan jeruk nipis secukupnya diamkan + - 10 menit lalu bilas cuci bersih lg\n" +
                            "\n" +
                            "    Rendam ayam dgn bawang putih yg sudah di haluskan kecap, garam dan minyak diamkan + - 15 menit kemudian tusuk dgn tusuk sate\n" +
                            "\n" +
                            "    Buat minyak oles panaskan minyak goreng bawang putih dgn ketumbar sampai harum tunggu dingin kemudian saring ambil minyak nya saja\n" +
                            "\n" +
                            "    Sebelum memangang olesi ayam dgn minyak oles lalu pangang dan ulangi oles lg sebelum ayam matang sempurna\n" +
                            "\n" +
                            "    Halus kan semua bahan saos tes rasa ya kalau kurang manis tambahin gula atau kurang gurih tambahkan garam \uD83D\uDE01 kecap manis nya boleh di tambahkan langsung atau di beri kalau mau di sajikan\n" +
                            "\n" +
                            "    Sajikan sate ayam siram saos kacangnya kemudian kasih kecap manis kalau mau tambahkan irisan bawang merah dan cabe rawit serta bawang goreng\n" +
                            "\n" +
                            "    Siap santap yumm yummm\uD83D\uDE0A\uD83D\uDE0A\uD83D\uDE0A\n");
            resepList.add(resepku);
            resepku = new Resepku("Steak Ayam", R.drawable.steakayam, "Steak Ayam Goyang Lidah",
                    "\n" +
                            "Bahan-bahan\n" +
                            "2 porsi\n" +
                            "\n" +
                            "    2 buah Daging Ayam\n" +
                            "    3 sendok makan Saus Tiram\n" +
                            "    1 sendok teh Kaldu Bubuk\n" +
                            "    1 sendok teh Lada (Merica)\n" +
                            "    50 gram Tepung Terigu\n" +
                            "    1 sendok makan Tepung Maizena\n" +
                            "    150 gram Tepung Bumbu\n" +
                            "    1 butir Telur Ayam\n" +
                            "    gram SAUS STEAK\n" +
                            "    1 siung Bawang Bombay\n" +
                            "    5 siung Bawang Merah\n" +
                            "    4 siung Bawang Putih\n" +
                            "    2 buah Tomat\n" +
                            "    170 ml Saus Tomat\n" +
                            "    1 sendok teh Lada Bubuk\n" +
                            "    1 sendok teh Garam\n" +
                            "    1 sendok makan Saus Tiram\n" +
                            "    1 sendok teh Kaldu bubuk\n" +
                            "    1 sendok makan Gula Pasir\n" +
                            "    200 ml Air\n" +
                            "    secukupnya Mentega\n" +
                            "    gram PELENGKAP\n" +
                            "    secukupnya Kentang\n" +
                            "    secukupnya Buncis\n" +
                            "    secukupnya Wortel\n" +
                            "\n" +
                            "Langkah\n" +
                            "30 menit\n" +
                            "\n" +
                            "    SAUS : Rebus tomat sampai kulitnya terkelupas, hilangkan kulit dan isinya, cincang halus, sisihkan.\n" +
                            "    llelahkan mentega lalu tumis bawang bombay, bawang merah dan bawang putih sampai harum. Masukkan tomat cincang, lalu air, masukkan bumbu-bumbu, masak sampai mengental, cicipi. jika kurang kental tambahi ciran maizena.\n" +
                            "    Saring saus.\n" +
                            "\n" +
                            "    STEAK : rendam daging ayam dengan saus tiram, merica bubuk dan kaldu bubuk. diamkan di kulkas 30 menit.\n" +
                            "\n" +
                            "    Siapkan 3 piring :\n" +
                            "    piring 1 : tepung terigu.\n" +
                            "    piring 2 : telur kocok.\n" +
                            "    piring 3 : tepung bumbu dan tepung maizena.\n" +
                            "\n" +
                            "    Celupkan daging ke piring 1, lalu piring 2 kemudian piring 3. Cubit cubit agar bisa keriting saat di goreng.\n" +
                            "\n" +
                            "    goreng daging dengan minyak yang panas dan cukup banyak.\n" +
                            "    goreng kentang hingga matang, rebus wortel dan buncis.\n" +
                            "\n" +
                            "    sajikan steak dengan saus dan pelengkap. tambahkan saus sambal tambah yummm");
            resepList.add(resepku);
        }
        mAdapter.notifyDataSetChanged();

    }
}
