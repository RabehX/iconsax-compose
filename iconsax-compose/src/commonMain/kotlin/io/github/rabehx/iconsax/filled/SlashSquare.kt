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

val Iconsax.Filled.SlashSquare: ImageVector
    get() {
        if (_SlashSquare != null) {
            return _SlashSquare!!
        }
        _SlashSquare = ImageVector.Builder(
            name = "Filled.SlashSquare",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.464f, 3.464f)
                curveTo(2f, 4.93f, 2f, 7.286f, 2f, 12f)
                reflectiveCurveToRelative(0f, 7.071f, 1.464f, 8.535f)
                curveTo(4.93f, 22f, 7.286f, 22f, 12f, 22f)
                reflectiveCurveToRelative(7.071f, 0f, 8.535f, -1.465f)
                curveTo(22f, 19.072f, 22f, 16.714f, 22f, 12f)
                reflectiveCurveToRelative(0f, -7.071f, -1.465f, -8.536f)
                curveTo(19.072f, 2f, 16.714f, 2f, 12f, 2f)
                reflectiveCurveTo(4.929f, 2f, 3.464f, 3.464f)
                moveToRelative(10.554f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.448f, -0.388f)
                lineToRelative(-2.589f, 9.66f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.45f, 0.388f)
                close()
            }
        }.build()

        return _SlashSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SlashSquare: ImageVector? = null
