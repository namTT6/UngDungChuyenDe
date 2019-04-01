package vn.edu.tdc.fit.chuyende2.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class chiTietSanPham extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView imgicon, imgShow;
    TextView tensanpham, giasanpham, mota, showTenSP;
    Spinner spinner;
    Button btnthemhang, clickchonhinh, btnclose;
    ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_san_pham);
        // Set theme
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_chi_tiet_san_pham);

        setControl();
        setInvent();
        GetInformation();
        CashEventSpinner();

        //Bắt sự kiện phóng to thu nhỏ imageview
        scaleGestureDetector = new ScaleGestureDetector(this, new MyGesture());



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //Gọi class scale
    class MyGesture extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        float scale = 1.0F, onScaleStart = 0, onScaleEnd = 0;

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            imgShow.setScaleX(scale);
            imgShow.setScaleY(scale);
            return super.onScale(detector);
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            Toast.makeText(getApplicationContext(), "onScale start", Toast.LENGTH_SHORT).show();
            Log.d("scalexxxx", "Giá trị trước khi bắt đầu scale: " + onScaleStart);
            onScaleStart = scale;
            return super.onScaleBegin(detector);
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector detector) {
            Toast.makeText(getApplicationContext(), "onScale End", Toast.LENGTH_SHORT).show();
            Log.d("scalexxxx", "Giá trị sau khi được scale: " + onScaleEnd);
            onScaleEnd = scale;
            super.onScaleEnd(detector);
        }
    }

    private void setInvent() {


        clickchonhinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(chiTietSanPham.this);
                dialog.setTitle("Show Image");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.activity_show_images_product);
                btnclose = (Button) dialog.findViewById(R.id.btnclose);
                imgShow = (ImageView) dialog.findViewById(R.id.imgShow);
                showTenSP = (TextView) dialog.findViewById(R.id.showTenSP);
                //Bắt dự kiện chạm vào imageview;
                imgShow.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        scaleGestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }
                });


                sanPham sp = (sanPham) getIntent().getSerializableExtra("thongtinsanpham");
                imgShow.setImageResource(sp.getHinhAnh());
                showTenSP.setText(sp.getTenSanPham());


                //Tạo hiệu ứng phóng to và thu nhỏ hình ảnh sản phẩm;


                btnclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
    }


    private void CashEventSpinner() {
        Integer[] soluong = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.support_simple_spinner_dropdown_item, soluong);
        spinner.setAdapter(arrayAdapter);
    }

    private void setControl() {
        imgicon = (ImageView) findViewById(R.id.imgicon);
        tensanpham = (TextView) findViewById(R.id.tensanpham);
        giasanpham = (TextView) findViewById(R.id.giasanpham);
        mota = (TextView) findViewById(R.id.mota);
        spinner = (Spinner) findViewById(R.id.spinner);
        btnthemhang = (Button) findViewById(R.id.btnthemhang);
        clickchonhinh = (Button) findViewById(R.id.clickchonhinh);
    }

    private void GetInformation() {
        sanPham sp = (sanPham) getIntent().getSerializableExtra("thongtinsanpham");
        int ID = 0;
        int IDSP = 0;
        ID = sp.getId();
        IDSP = sp.getIdSanPham();
        imgicon.setImageResource(sp.getHinhAnh());
        tensanpham.setText(sp.getTenSanPham());
        giasanpham.setText("Giá: " + sp.getGiaTien());
        mota.setText(sp.getMoTa());
        //imgicon.setImageResource(Integer.parseInt(hinhAnhChiTiet));
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // sự kiện kích chọn vào navigationview chuyển màn hình
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else {
            if (id == R.id.nav_sanpham) {
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
