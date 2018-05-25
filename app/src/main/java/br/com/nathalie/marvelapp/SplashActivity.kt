package br.com.nathalie.marvelapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //2000L significa 2 segundos
        //reset anim, não é necessário no momento
        //não precisa criar uma variável para a image view, pq ela vai ter uma id e vai ser chamada pela id
    }


}
