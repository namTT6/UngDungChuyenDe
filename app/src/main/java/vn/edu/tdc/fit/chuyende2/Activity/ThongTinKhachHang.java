package vn.edu.tdc.fit.chuyende2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import vn.edu.tdc.fit.chuyende2.R;

public class ThongTinKhachHang extends AppCompatActivity {
    Button btnxacnhanthongtin, btnhuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_khach_hang);
        goiLaiTheme();
        toolBar();
        setControl();
        setInvent();

    }

    private void setInvent() {
        btnxacnhanthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongTinKhachHang.this, ThongBao.class);
                startActivity(intent);

            }
        });
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongTinKhachHang.this, cartActivity.class);
                startActivity(intent);

            }
        });
    }

    private void setControl() {
        btnxacnhanthongtin = (Button) findViewById(R.id.btnxacnhanthongtin);
        btnhuy = (Button) findViewById(R.id.btnhuy);
    }

    // Set theme
    private void goiLaiTheme() {
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_thong_tin_khach_hang);
    }

    private void toolBar() {
        // Khởi tạo tool bar và thay thế action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Loại bỏ tiêu đề tool bar
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        // Hiển thị nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Bắt sự kiên trên tool bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:

                // Hủy màn hình
                finish();
                onBackPressed();
                return true;

            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
