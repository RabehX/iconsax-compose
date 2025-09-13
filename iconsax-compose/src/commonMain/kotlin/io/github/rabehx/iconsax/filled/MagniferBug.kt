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

val Iconsax.Filled.MagniferBug: ImageVector
    get() {
        if (_MagniferBug != null) {
            return _MagniferBug!!
        }
        _MagniferBug = ImageVector.Builder(
            name = "Filled.MagniferBug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.857f, 11.947f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.429f, 2.01f)
                verticalLineToRelative(-3.194f)
                lineTo(8.857f, 10.763f)
                close()
                moveTo(13.021f, 9.342f)
                arcTo(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7.921f)
                arcToRelative(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.02f, 1.421f)
                close()
                moveTo(13.143f, 10.763f)
                horizontalLineToRelative(-1.429f)
                verticalLineToRelative(3.195f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.429f, -2.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.788f, 21.788f)
                arcToRelative(0.723f, 0.723f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.022f)
                lineTo(18.122f, 17.1f)
                arcToRelative(9.157f, 9.157f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.022f, 1.022f)
                lineToRelative(3.666f, 3.666f)
                arcToRelative(0.723f, 0.723f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.022f, 0f)
                moveTo(8.19f, 7.86f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.5f)
                curveToRelative(1.14f, 0f, 2.157f, 0.532f, 2.81f, 1.36f)
                lineToRelative(0.68f, -0.338f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.958f, 0.318f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.319f, 0.953f)
                lineToRelative(-0.679f, 0.338f)
                quadToRelative(0.12f, 0.442f, 0.121f, 0.922f)
                verticalLineToRelative(0.236f)
                horizontalLineToRelative(0.715f)
                curveToRelative(0.394f, 0f, 0.714f, 0.319f, 0.714f, 0.711f)
                reflectiveCurveToRelative(-0.32f, 0.71f, -0.714f, 0.71f)
                horizontalLineToRelative(-0.715f)
                verticalLineToRelative(0.237f)
                quadToRelative(-0.002f, 0.48f, -0.12f, 0.922f)
                lineToRelative(0.678f, 0.338f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.953f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.959f, 0.318f)
                lineToRelative(-0.68f, -0.338f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15.5f)
                arcToRelative(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.81f, -1.36f)
                lineToRelative(-0.68f, 0.338f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.958f, -0.318f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.319f, -0.953f)
                lineToRelative(0.679f, -0.338f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.121f, -0.922f)
                verticalLineToRelative(-0.236f)
                horizontalLineToRelative(-0.715f)
                arcTo(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                curveToRelative(0f, -0.392f, 0.32f, -0.71f, 0.714f, -0.71f)
                horizontalLineToRelative(0.715f)
                verticalLineToRelative(-0.237f)
                quadToRelative(0.001f, -0.48f, 0.12f, -0.922f)
                lineToRelative(-0.678f, -0.338f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, -0.953f)
                arcToRelative(0.716f, 0.716f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.959f, -0.318f)
                close()
            }
        }.build()

        return _MagniferBug!!
    }

@Suppress("ObjectPropertyName")
private var _MagniferBug: ImageVector? = null
