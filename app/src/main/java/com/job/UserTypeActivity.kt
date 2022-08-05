package com.job

 import android.os.Bundle
 import androidx.appcompat.app.AppCompatActivity
 import com.job.databinding.UserTypeActivityBinding

class UserTypeActivity : AppCompatActivity() {

    private lateinit var binding: UserTypeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  UserTypeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}