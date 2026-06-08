package com.hluhovska.myapplication.AppTheme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import myapplication.shared.generated.resources.Res
import myapplication.shared.generated.resources.bricolagegrotesque
import org.jetbrains.compose.resources.Font

val BricolageGrotesqueFontFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(Res.font.bricolagegrotesque, FontWeight.Normal)
    )

val AppTypography: Typography
    @Composable
    get() = Typography(
        titleLarge = TextStyle(
            fontFamily = BricolageGrotesqueFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            lineHeight = 28.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = BricolageGrotesqueFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        labelMedium = TextStyle(
            fontFamily = BricolageGrotesqueFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
    )