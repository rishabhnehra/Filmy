package tech.salroid.filmy.network_stuff;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import tech.salroid.filmy.FilmyApplication;

/*
 * Filmy Application for Android
 * Copyright (c) 2016 Sajal Gupta (http://github.com/salroid).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class TmdbVolleySingleton {


    public static TmdbVolleySingleton instance = null;
    private RequestQueue requestQueue;


    private TmdbVolleySingleton() {
        requestQueue = Volley.newRequestQueue(FilmyApplication.getContext());
    }

    public static TmdbVolleySingleton getInstance() {

        if (instance == null) {
            instance = new TmdbVolleySingleton();
        }
        return instance;
    }


    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
