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

val Iconsax.Filled.HomeSmile: ImageVector
    get() {
        if (_HomeSmile != null) {
            return _HomeSmile!!
        }
        _HomeSmile = ImageVector.Builder(
            name = "Filled.HomeSmile",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.106f, 22f)
                horizontalLineToRelative(-2.212f)
                curveToRelative(-3.447f, 0f, -5.17f, 0f, -6.345f, -1.012f)
                reflectiveCurveToRelative(-1.419f, -2.705f, -1.906f, -6.093f)
                lineToRelative(-0.279f, -1.937f)
                curveToRelative(-0.38f, -2.637f, -0.57f, -3.956f, -0.029f, -5.083f)
                reflectiveCurveToRelative(1.691f, -1.813f, 3.992f, -3.183f)
                lineToRelative(1.385f, -0.825f)
                curveTo(9.8f, 2.622f, 10.846f, 2f, 12f, 2f)
                reflectiveCurveToRelative(2.199f, 0.622f, 4.288f, 1.867f)
                lineToRelative(1.385f, 0.825f)
                curveToRelative(2.3f, 1.37f, 3.451f, 2.056f, 3.992f, 3.183f)
                reflectiveCurveToRelative(0.35f, 2.446f, -0.03f, 5.083f)
                lineToRelative(-0.278f, 1.937f)
                curveToRelative(-0.487f, 3.388f, -0.731f, 5.081f, -1.906f, 6.093f)
                reflectiveCurveTo(16.553f, 22f, 13.106f, 22f)
                moveToRelative(-4.708f, -6.447f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.049f, -0.156f)
                curveToRelative(0.728f, 0.54f, 1.607f, 0.853f, 2.553f, 0.853f)
                reflectiveCurveToRelative(1.825f, -0.313f, 2.553f, -0.853f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.894f, 1.205f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17.75f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.447f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.155f, -1.049f)
            }
        }.build()

        return _HomeSmile!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSmile: ImageVector? = null
