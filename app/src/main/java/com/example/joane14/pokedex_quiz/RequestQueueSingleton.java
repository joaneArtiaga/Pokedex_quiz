package com.example.joane14.pokedex_quiz;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Joane14 on 7/5/2017.
 */

class RequestQueueSingleton {


    private static RequestQueue requestQueue;

    private RequestQueueSingleton() {

    }

    public static RequestQueue getInstance(Context context) {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context);
        }
        return requestQueue;
    }

}
