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

val Iconsax.Outline.HomeSmile: ImageVector
    get() {
        if (_HomeSmile != null) {
            return _HomeSmile!!
        }
        _HomeSmile = ImageVector.Builder(
            name = "Outline.HomeSmile",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.447f, 15.398f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.894f, 1.204f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.75f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.447f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.894f, -1.204f)
                arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.25f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.553f, -0.852f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1.25f)
                curveToRelative(-0.708f, 0f, -1.351f, 0.203f, -2.05f, 0.542f)
                curveToRelative(-0.674f, 0.328f, -1.454f, 0.812f, -2.427f, 1.416f)
                lineTo(5.456f, 4.491f)
                curveToRelative(-0.92f, 0.572f, -1.659f, 1.03f, -2.227f, 1.465f)
                curveToRelative(-0.589f, 0.45f, -1.041f, 0.91f, -1.368f, 1.507f)
                curveToRelative(-0.326f, 0.595f, -0.472f, 1.229f, -0.543f, 1.978f)
                curveToRelative(-0.068f, 0.725f, -0.068f, 1.613f, -0.068f, 2.726f)
                verticalLineToRelative(1.613f)
                curveToRelative(0f, 1.904f, 0f, 3.407f, 0.153f, 4.582f)
                curveToRelative(0.156f, 1.205f, 0.486f, 2.178f, 1.23f, 2.947f)
                curveToRelative(0.747f, 0.773f, 1.697f, 1.119f, 2.875f, 1.282f)
                curveToRelative(1.14f, 0.159f, 2.598f, 0.159f, 4.434f, 0.159f)
                horizontalLineToRelative(4.116f)
                curveToRelative(1.836f, 0f, 3.294f, 0f, 4.434f, -0.159f)
                curveToRelative(1.177f, -0.163f, 2.128f, -0.509f, 2.876f, -1.282f)
                curveToRelative(0.743f, -0.769f, 1.073f, -1.742f, 1.23f, -2.947f)
                curveToRelative(0.152f, -1.175f, 0.152f, -2.678f, 0.152f, -4.582f)
                verticalLineToRelative(-1.613f)
                curveToRelative(0f, -1.113f, 0f, -2f, -0.068f, -2.726f)
                curveToRelative(-0.07f, -0.75f, -0.217f, -1.383f, -0.543f, -1.978f)
                curveToRelative(-0.327f, -0.597f, -0.78f, -1.056f, -1.368f, -1.507f)
                curveToRelative(-0.568f, -0.436f, -1.306f, -0.893f, -2.227f, -1.465f)
                lineToRelative(-2.067f, -1.283f)
                curveToRelative(-0.973f, -0.604f, -1.753f, -1.088f, -2.428f, -1.416f)
                curveToRelative(-0.697f, -0.34f, -1.34f, -0.542f, -2.049f, -0.542f)
                moveTo(8.28f, 4.504f)
                curveToRelative(1.015f, -0.63f, 1.73f, -1.072f, 2.327f, -1.363f)
                curveToRelative(0.581f, -0.283f, 0.993f, -0.391f, 1.393f, -0.391f)
                reflectiveCurveToRelative(0.812f, 0.108f, 1.393f, 0.391f)
                curveToRelative(0.598f, 0.29f, 1.312f, 0.733f, 2.327f, 1.363f)
                lineToRelative(2f, 1.241f)
                curveToRelative(0.961f, 0.597f, 1.636f, 1.016f, 2.14f, 1.402f)
                curveToRelative(0.489f, 0.375f, 0.77f, 0.684f, 0.963f, 1.036f)
                curveToRelative(0.193f, 0.353f, 0.306f, 0.766f, 0.365f, 1.398f)
                curveToRelative(0.061f, 0.648f, 0.062f, 1.465f, 0.062f, 2.623f)
                verticalLineToRelative(1.521f)
                curveToRelative(0f, 1.97f, -0.002f, 3.376f, -0.14f, 4.443f)
                curveToRelative(-0.136f, 1.048f, -0.393f, 1.656f, -0.82f, 2.099f)
                curveToRelative(-0.425f, 0.439f, -1.003f, 0.7f, -2.004f, 0.839f)
                curveToRelative(-1.026f, 0.142f, -2.379f, 0.144f, -4.286f, 0.144f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.908f, 0f, -3.26f, -0.002f, -4.286f, -0.144f)
                curveToRelative(-1.001f, -0.14f, -1.579f, -0.4f, -2.003f, -0.84f)
                curveToRelative(-0.428f, -0.442f, -0.685f, -1.05f, -0.82f, -2.098f)
                curveToRelative(-0.14f, -1.067f, -0.141f, -2.472f, -0.141f, -4.443f)
                verticalLineToRelative(-1.521f)
                curveToRelative(0f, -1.158f, 0f, -1.975f, 0.062f, -2.623f)
                curveToRelative(0.059f, -0.632f, 0.172f, -1.045f, 0.365f, -1.398f)
                curveToRelative(0.193f, -0.352f, 0.474f, -0.661f, 0.964f, -1.036f)
                curveToRelative(0.503f, -0.386f, 1.178f, -0.805f, 2.139f, -1.402f)
                close()
            }
        }.build()

        return _HomeSmile!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSmile: ImageVector? = null
