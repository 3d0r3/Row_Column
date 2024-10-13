package com.example.calculator_row_column.ui.theme
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(symbol: String) {
    Button(
        onClick = { /* Acción del botón */ },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF6200EE)),
        modifier = Modifier.size(64.dp)  // Tamaño circular del botón
    ) {
        Text(
            text = symbol,
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewCalculatorButton() {
    CalculatorButton(symbol = "1")
}
