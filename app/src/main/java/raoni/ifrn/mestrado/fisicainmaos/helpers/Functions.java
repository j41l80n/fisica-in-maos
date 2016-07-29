package raoni.ifrn.mestrado.fisicainmaos.helpers;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Jailson on 29/07/2016.
 */
public class Functions
{
    public void makeToast(String text, Context context)
    {
        //
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
