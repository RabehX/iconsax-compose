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

val Iconsax.Outline.MagniferBug: ImageVector
    get() {
        if (_MagniferBug != null) {
            return _MagniferBug!!
        }
        _MagniferBug = ImageVector.Builder(
            name = "Outline.MagniferBug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.5f, 2.75f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 17.5f)
                arcToRelative(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -17.5f)
                moveTo(1.25f, 11.5f)
                curveToRelative(0f, -5.66f, 4.59f, -10.25f, 10.25f, -10.25f)
                reflectiveCurveTo(21.75f, 5.84f, 21.75f, 11.5f)
                curveToRelative(0f, 2.56f, -0.939f, 4.902f, -2.491f, 6.698f)
                lineToRelative(3.271f, 3.272f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-3.272f, -3.271f)
                arcTo(10.2f, 10.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 21.75f)
                curveToRelative(-5.66f, 0f, -10.25f, -4.59f, -10.25f, -10.25f)
                moveToRelative(7.299f, -3.314f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 6.75f)
                curveToRelative(1.198f, 0f, 2.265f, 0.562f, 2.951f, 1.436f)
                lineToRelative(0.714f, -0.357f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.67f, 1.342f)
                lineToRelative(-0.712f, 0.356f)
                quadToRelative(0.126f, 0.467f, 0.127f, 0.973f)
                verticalLineToRelative(0.25f)
                lineTo(16f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(0.25f)
                quadToRelative(-0.001f, 0.505f, -0.127f, 0.973f)
                lineToRelative(0.712f, 0.356f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, 1.342f)
                lineToRelative(-0.714f, -0.357f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 16.25f)
                arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.951f, -1.436f)
                lineToRelative(-0.714f, 0.357f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, -1.342f)
                lineToRelative(0.712f, -0.356f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.127f, -0.973f)
                verticalLineToRelative(-0.25f)
                lineTo(7f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.25f)
                quadToRelative(0.001f, -0.506f, 0.127f, -0.973f)
                lineToRelative(-0.712f, -0.356f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, -1.342f)
                close()
                moveTo(9.25f, 11.25f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.98f, 0.626f, 1.813f, 1.5f, 2.122f)
                lineTo(10.75f, 11.25f)
                close()
                moveTo(12.25f, 11.25f)
                verticalLineToRelative(3.372f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -2.122f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(13.622f, 9.75f)
                lineTo(9.378f, 9.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.244f, 0f)
            }
        }.build()

        return _MagniferBug!!
    }

@Suppress("ObjectPropertyName")
private var _MagniferBug: ImageVector? = null
