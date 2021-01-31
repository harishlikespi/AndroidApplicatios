package selvakumar.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertTemperature(view : View){
        if(fahrenheitText.text.isNotEmpty()){
            val fahrenheitValue  = fahrenheitText.text.toString().toFloat()
            val celsiusValue = 5.0f/9.0f * (fahrenheitValue - 32)
            val trimmedCelsiusValue = "%.1f".format(celsiusValue)
            textView.text = trimmedCelsiusValue.toString().plus(" Celsius")
        } else {
            textView.text = getString(R.string.no_value_string)
        }
    }
}