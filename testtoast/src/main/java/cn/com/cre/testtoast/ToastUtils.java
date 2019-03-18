package cn.com.cre.testtoast;

import android.content.Context;
import android.widget.Toast;

/**
 * created by lc on 2019/3/18 0018
 */
public class ToastUtils
{
    private static ToastUtils instance;

    private ToastUtils()
    {

    }

    public static ToastUtils getInstance()
    {
        if (instance == null)
        {
            synchronized (ToastUtils.class)
            {
                if (instance == null)
                {
                    instance = new ToastUtils();
                }
            }
        }
        return instance;
    }

    public void showText(Context context, String text)
    {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
