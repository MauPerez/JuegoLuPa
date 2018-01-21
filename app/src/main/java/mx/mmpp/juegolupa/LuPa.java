package mx.mmpp.juegolupa;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Mauricio on 20/01/2018.
 */

public class LuPa {

    private int numero;

    public String azar(){
        numero =(int)Math.random()*2;
        return numero+"";
    }

}
