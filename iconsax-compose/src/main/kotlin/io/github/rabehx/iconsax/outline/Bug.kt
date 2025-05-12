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

val Iconsax.Outline.Bug: ImageVector
    get() {
        if (_Bug != null) {
            return _Bug!!
        }
        _Bug = ImageVector.Builder(
            name = "Outline.Bug",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.386f, 2.643f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.772f, -1.286f)
                lineTo(14.27f, 2.764f)
                arcTo(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.269f, 0.514f)
                lineTo(7.386f, 1.357f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.772f, 1.286f)
                lineToRelative(1.763f, 1.058f)
                arcTo(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 7.5f)
                verticalLineToRelative(0.29f)
                quadToRelative(-0.386f, 0.204f, -0.725f, 0.473f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.246f, -0.16f)
                lineToRelative(-2f, -0.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.558f, 1.392f)
                lineToRelative(1.772f, 0.709f)
                curveToRelative(-0.47f, 0.73f, -0.743f, 1.6f, -0.743f, 2.533f)
                verticalLineToRelative(1.312f)
                horizontalLineTo(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.28f, 0.31f, 2.486f, 0.859f, 3.55f)
                lineToRelative(-1.888f, 0.754f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.558f, 1.393f)
                lineToRelative(2f, -0.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.149f, -0.08f)
                arcTo(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22.75f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.072f, -2.934f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 0.08f)
                lineToRelative(2f, 0.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.556f, -1.392f)
                lineToRelative(-1.886f, -0.755f)
                arcTo(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.75f, 15f)
                verticalLineToRelative(-0.25f)
                horizontalLineTo(22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-1.312f)
                curveToRelative(0f, -0.934f, -0.273f, -1.803f, -0.743f, -2.533f)
                lineToRelative(1.771f, -0.709f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.556f, -1.392f)
                lineToRelative(-2f, 0.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.247f, 0.16f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.725f, -0.473f)
                verticalLineTo(7.5f)
                arcToRelative(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.627f, -3.8f)
                close()
                moveTo(5.75f, 15f)
                verticalLineToRelative(-3.062f)
                arcTo(3.187f, 3.187f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.938f, 8.75f)
                horizontalLineToRelative(6.124f)
                arcToRelative(3.19f, 3.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.188f, 3.188f)
                verticalLineTo(15f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 6.206f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6.206f)
                arcTo(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 15f)
                moveTo(12f, 3.75f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.745f, 3.55f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.682f, -0.05f)
                horizontalLineTo(8.936f)
                quadToRelative(-0.347f, 0f, -0.682f, 0.05f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
            }
        }.build()

        return _Bug!!
    }

@Suppress("ObjectPropertyName")
private var _Bug: ImageVector? = null
