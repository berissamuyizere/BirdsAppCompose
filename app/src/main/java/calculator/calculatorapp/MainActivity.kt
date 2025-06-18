package calculator.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnMinus: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        castViews()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun castViews(){
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNUm2)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
    }
    override fun onResume(){
    super.onResume()
        btnAdd.setOnClickListener{
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            val sum = num1.toInt() + num2.toInt()
            tvResult.text = sum.toString()
        }
        btnMinus.setOnClickListener{
            var num1= etNum1.text.toString()
            var num2 = etNum2.text.toString()
            val difference = num1.toInt() - num2.toInt()
            tvResult.text = difference.toString()
        }

        btnMultiply.setOnClickListener{
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            val product = num1.toInt() * num2.toInt()
            tvResult.text = product.toString()
        }

        btnDivide.setOnClickListener{
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            val quotient = num1.toInt() / num2.toInt()
            tvResult.text = quotient.toString()
        }
    }
}