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
        behaviorCards()
        behaviorButton()
    }

    private fun behaviorCards() {
        binding.userTypeCardContainer.setOnClickListener {
            binding.userTypeCardContainer.isSelected = true
            binding.userTypeContainerEmployeeCard.isSelected = false
        }
        binding.userTypeContainerEmployeeCard.setOnClickListener {
            binding.userTypeCardContainer.isSelected = false
            binding.userTypeContainerEmployeeCard.isSelected = true
        }
    }

    private fun behaviorButton(){
        binding.appCompatButton.setOnClickListener {
            binding.appCompatButton.isActivated =  true
        }
    }


}