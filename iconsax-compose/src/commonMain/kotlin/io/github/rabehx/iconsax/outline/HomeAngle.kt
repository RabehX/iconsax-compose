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

val Iconsax.Outline.HomeAngle: ImageVector
    get() {
        if (_HomeAngle != null) {
            return _HomeAngle!!
        }
        _HomeAngle = ImageVector.Builder(
            name = "Outline.HomeAngle",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1.25f)
                curveToRelative(-0.725f, 0f, -1.387f, 0.2f, -2.11f, 0.537f)
                curveToRelative(-0.702f, 0.327f, -1.512f, 0.81f, -2.528f, 1.415f)
                lineToRelative(-1.456f, 0.867f)
                curveToRelative(-1.119f, 0.667f, -2.01f, 1.198f, -2.686f, 1.706f)
                curveTo(2.523f, 6.3f, 2f, 6.84f, 1.66f, 7.551f)
                curveToRelative(-0.342f, 0.711f, -0.434f, 1.456f, -0.405f, 2.325f)
                curveToRelative(0.029f, 0.841f, 0.176f, 1.864f, 0.36f, 3.146f)
                lineToRelative(0.293f, 2.032f)
                curveToRelative(0.237f, 1.65f, 0.426f, 2.959f, 0.707f, 3.978f)
                curveToRelative(0.29f, 1.05f, 0.702f, 1.885f, 1.445f, 2.524f)
                curveToRelative(0.742f, 0.64f, 1.63f, 0.925f, 2.716f, 1.062f)
                curveToRelative(1.056f, 0.132f, 2.387f, 0.132f, 4.066f, 0.132f)
                horizontalLineToRelative(2.316f)
                curveToRelative(1.68f, 0f, 3.01f, 0f, 4.066f, -0.132f)
                curveToRelative(1.086f, -0.137f, 1.974f, -0.422f, 2.716f, -1.061f)
                curveToRelative(0.743f, -0.64f, 1.155f, -1.474f, 1.445f, -2.525f)
                curveToRelative(0.281f, -1.02f, 0.47f, -2.328f, 0.707f, -3.978f)
                lineToRelative(0.292f, -2.032f)
                curveToRelative(0.185f, -1.282f, 0.332f, -2.305f, 0.36f, -3.146f)
                curveToRelative(0.03f, -0.87f, -0.062f, -1.614f, -0.403f, -2.325f)
                reflectiveCurveTo(21.477f, 6.3f, 20.78f, 5.775f)
                curveToRelative(-0.675f, -0.508f, -1.567f, -1.039f, -2.686f, -1.706f)
                lineToRelative(-1.456f, -0.867f)
                curveToRelative(-1.016f, -0.605f, -1.826f, -1.088f, -2.527f, -1.415f)
                curveToRelative(-0.724f, -0.338f, -1.386f, -0.537f, -2.111f, -0.537f)
                moveTo(8.096f, 4.511f)
                curveToRelative(1.057f, -0.63f, 1.803f, -1.073f, 2.428f, -1.365f)
                curveToRelative(0.609f, -0.284f, 1.047f, -0.396f, 1.476f, -0.396f)
                reflectiveCurveToRelative(0.867f, 0.112f, 1.476f, 0.396f)
                curveToRelative(0.625f, 0.292f, 1.37f, 0.735f, 2.428f, 1.365f)
                lineToRelative(1.385f, 0.825f)
                curveToRelative(1.165f, 0.694f, 1.986f, 1.184f, 2.59f, 1.638f)
                curveToRelative(0.587f, 0.443f, 0.91f, 0.809f, 1.11f, 1.225f)
                curveToRelative(0.199f, 0.416f, 0.282f, 0.894f, 0.257f, 1.626f)
                curveToRelative(-0.026f, 0.75f, -0.16f, 1.691f, -0.352f, 3.026f)
                lineToRelative(-0.28f, 1.937f)
                curveToRelative(-0.246f, 1.714f, -0.422f, 2.928f, -0.675f, 3.845f)
                curveToRelative(-0.247f, 0.896f, -0.545f, 1.415f, -0.977f, 1.787f)
                curveToRelative(-0.433f, 0.373f, -0.994f, 0.593f, -1.925f, 0.71f)
                curveToRelative(-0.951f, 0.119f, -2.188f, 0.12f, -3.93f, 0.12f)
                horizontalLineToRelative(-2.213f)
                curveToRelative(-1.743f, 0f, -2.98f, -0.001f, -3.931f, -0.12f)
                curveToRelative(-0.93f, -0.117f, -1.492f, -0.337f, -1.925f, -0.71f)
                curveToRelative(-0.432f, -0.372f, -0.73f, -0.891f, -0.977f, -1.787f)
                curveToRelative(-0.253f, -0.917f, -0.43f, -2.131f, -0.676f, -3.845f)
                lineToRelative(-0.279f, -1.937f)
                curveToRelative(-0.192f, -1.335f, -0.326f, -2.277f, -0.352f, -3.026f)
                curveToRelative(-0.025f, -0.732f, 0.058f, -1.21f, 0.258f, -1.626f)
                reflectiveCurveToRelative(0.521f, -0.782f, 1.11f, -1.225f)
                curveToRelative(0.603f, -0.454f, 1.424f, -0.944f, 2.589f, -1.638f)
                close()
            }
        }.build()

        return _HomeAngle!!
    }

@Suppress("ObjectPropertyName")
private var _HomeAngle: ImageVector? = null
