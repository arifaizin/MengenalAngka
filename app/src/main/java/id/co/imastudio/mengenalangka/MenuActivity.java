package id.co.imastudio.mengenalangka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MenuActivity extends AppCompatActivity {

    GridView gridMenu;
//    int[] listMenu = {
//            R.drawable.menu01,
//            R.drawable.menu02,
//            R.drawable.menu03,
//            R.drawable.menu04,
//            R.drawable.menu05,
//            R.drawable.menu06,
//            R.drawable.menu07,
//            R.drawable.menu08,
//            R.drawable.menu09
//    };

    String[] listu = {
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",
            "1",

    };
    private ImageView btnMenuBack;
    private ImageView btnMenuNext;
    private ImageView btnBurungUnta;
    private ImageView btnBeo;
    private ImageView btnGajah;
    private ImageView btnJerapah;
    private ImageView btnKera;
    private ImageView btnMacan;
    private ImageView btnRusa;
    private ImageView btnSapi;
    private ImageView btnZebra;
    private ImageView btnUnta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        initView();

        Glide.with(this).load(R.drawable.hewan_burungunta).into(btnBurungUnta);
        Glide.with(this).load(R.drawable.hewan_beo).into(btnBeo);
        Glide.with(this).load(R.drawable.hewan_gajah).into(btnGajah);
        Glide.with(this).load(R.drawable.hewan_jerapah).into(btnJerapah);
        Glide.with(this).load(R.drawable.hewan_kera).into(btnKera);
        Glide.with(this).load(R.drawable.hewan_macan).into(btnMacan);
        Glide.with(this).load(R.drawable.hewan_rusa).into(btnRusa);
        Glide.with(this).load(R.drawable.hewan_sapi).into(btnSapi);
        Glide.with(this).load(R.drawable.hewan_zebra).into(btnZebra);
        Glide.with(this).load(R.drawable.hewan_unta).into(btnUnta);

        btnMenuNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, PlayActivity.class);
                startActivity(pindah);
            }
        });

        //        gridMenu = (GridView) findViewById(R.id.gridView);
//        MenuAdapter adapter = new MenuAdapter(MenuActivity.this, listMenu, listu);
//        gridMenu.setAdapter(adapter);
//        gridMenu.setNumColumns(3);
//
//        gridMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent pindah = new Intent(MenuActivity.this, PlayActivity.class);
//                pindah.putExtra("posisi", position);
//                startActivity(pindah);
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }

    private void initView() {
        btnMenuBack = (ImageView) findViewById(R.id.btn_menu_back);
        btnMenuNext = (ImageView) findViewById(R.id.btn_menu_next);
        btnBurungUnta = (ImageView) findViewById(R.id.btnBurungUnta);
        btnBeo = (ImageView) findViewById(R.id.btnBeo);
        btnGajah = (ImageView) findViewById(R.id.btnGajah);
        btnJerapah = (ImageView) findViewById(R.id.btnJerapah);
        btnKera = (ImageView) findViewById(R.id.btnKera);
        btnMacan = (ImageView) findViewById(R.id.btnMacan);
        btnRusa = (ImageView) findViewById(R.id.btnRusa);
        btnSapi = (ImageView) findViewById(R.id.btnSapi);
        btnZebra = (ImageView) findViewById(R.id.btnZebra);
        btnUnta = (ImageView) findViewById(R.id.btnUnta);
    }
}
