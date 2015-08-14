package com.aquarids.library;

import android.content.res.Resources;
import android.util.TypedValue;

import java.util.List;

public class BasicUtil {


    public static int dpToPx(float dp, Resources resources) {
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
        return (int) px;
    }


    public static String passwordToString(List<Integer> password) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < password.size(); i++) {
            sb.append(password.get(i));
            if (i != password.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }


}
