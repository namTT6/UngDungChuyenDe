package vn.edu.tdc.fit.chuyende2.Activity;

import android.app.Activity;
import android.content.Intent;

import vn.edu.tdc.fit.chuyende2.R;

public class ThemeManagement {

    public static int currentTheme = 0;  // Thiết lập theme mặc định cũng chính là theme hiện tại (Current theme)

    public final static int DarkTheme = 0;
    public final static int LightTheme = 1;


    // Thay đổi theme theo ý muốn gọi phương thức này để thay đổi
    public static void changeToTheme(Activity activity, int theme) {
        currentTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }


    // Phương thức này giúp set theme lúc ban đầu
    public static void onActivityCreateSetTheme(Activity activity) {

        switch (currentTheme) {

            case DarkTheme:
                activity.setTheme(R.style.DarkTheme);
                break;

            case LightTheme:
                activity.setTheme(R.style.LightTheme);
                break;
        }
    }
}
