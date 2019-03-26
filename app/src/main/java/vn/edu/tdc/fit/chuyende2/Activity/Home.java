package vn.edu.tdc.fit.chuyende2.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.HomeAdapter;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMuc;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    // Các thuộc tính
    private ViewFlipper viewFlipper;
    private RecyclerView rvdanhsach;
    private ArrayList<danhMuc> ds;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setControl();
        setInvent();
        importData();
        ViewFlipper();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Biểu tượng email trên home
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setInvent() {

    }

    private void setControl() {
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        rvdanhsach = (RecyclerView) findViewById(R.id.rvdanhsach);
        ds = new ArrayList<>();
        homeAdapter = new HomeAdapter(Home.this, ds);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Home.this, LinearLayoutManager.VERTICAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        rvdanhsach.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rvdanhsach.setAdapter(homeAdapter);

        rvdanhsach.setAdapter(new ScaleInAnimationAdapter(homeAdapter));


    }

    public void importData(){
        ds.add(new danhMuc(1,R.drawable.iconsanpham,"Sản phẩm","Tổng hợp một số sản phẩm tốt nhất"));
        ds.add(new danhMuc(2,R.drawable.icondadep,"Da đẹp","Tổng hợp phương pháp chăm sóc da tốt nhất"));
        ds.add(new danhMuc(3,R.drawable.icontrangdiem,"Trang điểm","Trợ giúp trong việc trang điểm"));
        ds.add(new danhMuc(4,R.drawable.icontocdep,"Tóc đẹp","Tổng hợp phương pháp chăm sóc và mẫu tóc"));
        ds.add(new danhMuc(5,R.drawable.iconmacdep,"Mặc đẹp","Nổi bậc với phong cách mới"));
        ds.add(new danhMuc(6,R.drawable.icondangdep,"Dáng đẹp","Chế độ ăn để có một vóc dáng đẹp"));
        ds.add(new danhMuc(7,R.drawable.icontapluyen,"Tập luyện","Giảm cân - Bài tập tổng hợp"));
        homeAdapter.notifyDataSetChanged();

    }

    private void ViewFlipper()
    {
        ArrayList<String> quangcao = new ArrayList<>();
        quangcao.add("https://incucre.com/wp-content/uploads/2017/03/thiet-ke-banner-2-1.jpg");
        quangcao.add("https://znews-photo.zadn.vn/w660/Uploaded/wyhktpu/2018_11_08/image001_12.jpg");
        quangcao.add("http://img.zanado.com/media/wysiwyg/2015/BLOG/KM/KM02/Banner_30-04-2015_710xN.jpg");
        quangcao.add("http://dongahotelgroup.com/wp-content/uploads/2018/10/Happy-201-10.jpg");
        quangcao.add("https://i.ytimg.com/vi/eCiJhX4BA-M/maxresdefault.jpg");
        quangcao.add("https://salt.tikicdn.com/ts/categoryblock/35/a7/c9/8a8d8cbf3a19342aaeecef4c001a872e.jpg");
        quangcao.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqbX-QSeeiy4Vcu8RM7hnkrWqik9jFF-tTEBxgu7m4F9oUDYr_");
        quangcao.add("http://sagishop.vn/wp-content/uploads/2017/11/deal-weekly-e1511511926979.png");
        for (int i = 0; i < quangcao.size(); i++)
        {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(quangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation animation_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_in_right);
        viewFlipper.setOutAnimation(animation_out_right);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

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
