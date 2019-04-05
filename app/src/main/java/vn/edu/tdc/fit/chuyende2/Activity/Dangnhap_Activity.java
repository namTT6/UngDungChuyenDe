package vn.edu.tdc.fit.chuyende2.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import vn.edu.tdc.fit.chuyende2.R;

public class Dangnhap_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_nhap);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.dangnhap_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
