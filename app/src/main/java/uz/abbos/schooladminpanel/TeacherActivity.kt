package uz.abbos.schooladminpanel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.abbos.schooladminpanel.databinding.ActivityTeacherBinding

class TeacherActivity : AppCompatActivity() {
    lateinit var binding: ActivityTeacherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeacherBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}