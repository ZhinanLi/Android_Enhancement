package android;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * on 2020/5/21
 */
public class _1_Activity的布局深度 {

    public void getLayoutDepth(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        int layoutDepth = getViewDepth(decorView, 1);
        Log.e("ll", activity.getClass().getSimpleName() + "getLayoutDepth: " + layoutDepth);
    }

    private int getViewDepth(View decorView, int curDepth) {
        int maxDepth = curDepth;
        if (decorView instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) decorView;
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                int viewDepth = getViewDepth(childAt, curDepth + 1);
                if (viewDepth > maxDepth) {
                    maxDepth = viewDepth;
                }
            }
            return maxDepth;
        }
        return curDepth;
    }


}
