/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.RoundedMagniferBug: ImageVector
    get() {
        if (_RoundedMagniferBug != null) {
            return _RoundedMagniferBug!!
        }
        _RoundedMagniferBug = ImageVector.Builder(
            name = "Filled.RoundedMagniferBug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.82f, 19.7f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, -1.917f)
                curveToRelative(0.189f, 0.016f, 0.414f, 0.084f, 0.643f, 0.154f)
                lineToRelative(0.066f, 0.02f)
                lineToRelative(0.06f, 0.018f)
                curveToRelative(0.211f, 0.063f, 0.42f, 0.126f, 0.58f, 0.212f)
                arcToRelative(1.786f, 1.786f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.638f, 2.55f)
                curveToRelative(-0.1f, 0.151f, -0.255f, 0.307f, -0.41f, 0.464f)
                lineToRelative(-0.045f, 0.044f)
                lineToRelative(-0.044f, 0.045f)
                curveToRelative(-0.156f, 0.157f, -0.31f, 0.313f, -0.46f, 0.414f)
                arcToRelative(1.754f, 1.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.528f, -0.643f)
                curveToRelative(-0.085f, -0.16f, -0.147f, -0.372f, -0.21f, -0.585f)
                lineToRelative(-0.018f, -0.06f)
                lineToRelative(-0.02f, -0.067f)
                curveToRelative(-0.07f, -0.232f, -0.137f, -0.459f, -0.153f, -0.648f)
                moveToRelative(2.309f, -8.558f)
                curveToRelative(0f, 5.05f, -4.058f, 9.143f, -9.064f, 9.143f)
                reflectiveCurveTo(2f, 16.192f, 2f, 11.143f)
                reflectiveCurveTo(6.058f, 2f, 11.064f, 2f)
                reflectiveCurveToRelative(9.064f, 4.093f, 9.064f, 9.143f)
                moveTo(8.19f, 7.86f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.5f)
                curveToRelative(1.14f, 0f, 2.157f, 0.532f, 2.81f, 1.36f)
                lineToRelative(0.68f, -0.338f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.958f, 0.318f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.319f, 0.953f)
                lineToRelative(-0.679f, 0.338f)
                quadToRelative(0.121f, 0.442f, 0.122f, 0.922f)
                verticalLineToRelative(0.236f)
                horizontalLineToRelative(0.714f)
                curveToRelative(0.394f, 0f, 0.714f, 0.319f, 0.714f, 0.711f)
                reflectiveCurveToRelative(-0.32f, 0.71f, -0.714f, 0.71f)
                horizontalLineToRelative(-0.714f)
                verticalLineToRelative(0.237f)
                quadToRelative(-0.002f, 0.48f, -0.122f, 0.922f)
                lineToRelative(0.679f, 0.338f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.953f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.959f, 0.318f)
                lineToRelative(-0.68f, -0.338f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15.5f)
                arcToRelative(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.81f, -1.36f)
                lineToRelative(-0.68f, 0.338f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.958f, -0.318f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, -0.953f)
                lineToRelative(0.678f, -0.338f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.121f, -0.922f)
                verticalLineToRelative(-0.236f)
                horizontalLineToRelative(-0.715f)
                arcTo(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                curveToRelative(0f, -0.392f, 0.32f, -0.71f, 0.714f, -0.71f)
                horizontalLineToRelative(0.715f)
                verticalLineToRelative(-0.237f)
                quadToRelative(0.001f, -0.48f, 0.121f, -0.922f)
                lineToRelative(-0.679f, -0.338f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, -0.953f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.959f, -0.318f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.714f, 13.958f)
                verticalLineToRelative(-3.195f)
                horizontalLineToRelative(1.429f)
                verticalLineToRelative(1.184f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.429f, 2.01f)
                moveToRelative(-2.857f, -2.01f)
                verticalLineToRelative(-1.184f)
                horizontalLineToRelative(1.429f)
                verticalLineToRelative(3.195f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.429f, -2.01f)
                moveToRelative(0.123f, -2.606f)
                arcTo(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7.921f)
                curveToRelative(0.933f, 0f, 1.727f, 0.593f, 2.021f, 1.421f)
                close()
            }
        }.build()

        return _RoundedMagniferBug!!
    }

@Suppress("ObjectPropertyName")
private var _RoundedMagniferBug: ImageVector? = null
