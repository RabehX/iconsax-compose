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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.RoundedMagniferBug: ImageVector
    get() {
        if (_RoundedMagniferBug != null) {
            return _RoundedMagniferBug!!
        }
        _RoundedMagniferBug = ImageVector.Builder(
            name = "Outline.RoundedMagniferBug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 2.75f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16.5f)
                moveTo(1.25f, 11f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(1.25f, 16.385f, 1.25f, 11f)
                moveToRelative(6.799f, -3.314f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.25f)
                curveToRelative(1.198f, 0f, 2.265f, 0.562f, 2.951f, 1.436f)
                lineToRelative(0.714f, -0.357f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.67f, 1.342f)
                lineToRelative(-0.712f, 0.356f)
                quadToRelative(0.126f, 0.467f, 0.127f, 0.973f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                lineTo(14.75f, 12f)
                quadToRelative(-0.001f, 0.505f, -0.127f, 0.973f)
                lineToRelative(0.712f, 0.356f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, 1.342f)
                lineToRelative(-0.714f, -0.357f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15.75f)
                arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.951f, -1.436f)
                lineToRelative(-0.714f, 0.357f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, -1.342f)
                lineToRelative(0.712f, -0.356f)
                arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 12f)
                verticalLineToRelative(-0.25f)
                lineTo(6.5f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                lineTo(7.25f, 10f)
                quadToRelative(0.001f, -0.506f, 0.127f, -0.973f)
                lineToRelative(-0.712f, -0.356f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, -1.342f)
                close()
                moveTo(8.75f, 10.75f)
                lineTo(8.75f, 12f)
                curveToRelative(0f, 0.98f, 0.626f, 1.813f, 1.5f, 2.122f)
                lineTo(10.25f, 10.75f)
                close()
                moveTo(11.75f, 10.75f)
                verticalLineToRelative(3.372f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.25f, 12f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(13.122f, 9.25f)
                lineTo(8.878f, 9.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.244f, 0f)
                moveToRelative(7.036f, 10.501f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.407f, 0.407f)
                curveToRelative(0f, 0.001f, 0.004f, 0.027f, 0.024f, 0.1f)
                curveToRelative(0.022f, 0.084f, 0.056f, 0.197f, 0.108f, 0.37f)
                curveToRelative(0.047f, 0.158f, 0.078f, 0.26f, 0.103f, 0.336f)
                curveToRelative(0.026f, 0.078f, 0.035f, 0.093f, 0.031f, 0.086f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.544f, 0.137f)
                curveToRelative(-0.007f, 0.004f, 0.008f, -0.005f, 0.067f, -0.06f)
                curveToRelative(0.059f, -0.056f, 0.134f, -0.131f, 0.251f, -0.248f)
                reflectiveCurveToRelative(0.192f, -0.192f, 0.247f, -0.25f)
                curveToRelative(0.047f, -0.05f, 0.06f, -0.069f, 0.062f, -0.07f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.137f, -0.541f)
                curveToRelative(-0.001f, 0f, -0.022f, -0.01f, -0.087f, -0.032f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.336f, -0.103f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, -0.108f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.024f)
                moveToRelative(-1.902f, 0.532f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.027f, -2.027f)
                curveToRelative(0.2f, 0.017f, 0.442f, 0.09f, 0.703f, 0.168f)
                lineToRelative(0.072f, 0.022f)
                lineToRelative(0.065f, 0.02f)
                curveToRelative(0.24f, 0.07f, 0.465f, 0.138f, 0.635f, 0.229f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 2.694f)
                curveToRelative(-0.107f, 0.16f, -0.273f, 0.326f, -0.45f, 0.503f)
                lineToRelative(-0.048f, 0.048f)
                lineToRelative(-0.048f, 0.048f)
                curveToRelative(-0.177f, 0.177f, -0.343f, 0.343f, -0.503f, 0.45f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.694f, -0.68f)
                curveToRelative(-0.091f, -0.17f, -0.158f, -0.395f, -0.23f, -0.635f)
                lineToRelative(-0.02f, -0.065f)
                lineToRelative(-0.02f, -0.072f)
                curveToRelative(-0.08f, -0.26f, -0.152f, -0.503f, -0.169f, -0.703f)
            }
        }.build()

        return _RoundedMagniferBug!!
    }

@Suppress("ObjectPropertyName")
private var _RoundedMagniferBug: ImageVector? = null
